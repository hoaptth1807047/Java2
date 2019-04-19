package main;

import entity.Video;
import entity.VideoDetail;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MainThread {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/tomandjerry.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        int count = 0;
        ArrayList<Video> list = new ArrayList<>();
        while ((line = br.readLine()) != null){
            if (count == 0){
                count ++;
                continue;
            }
            String[] slipted = line.split("\\s{2,}");
            if (slipted.length == 4){
                String day = slipted[0];
                String id = slipted[1];
                String title = slipted[2];
                Double view = Double.valueOf(slipted[3]);
                Video video = new Video(day, id, title, view);
                list.add(video);
            }
        }
        HashMap<String, VideoDetail> statistic = new HashMap<>();
        for (Video video : list) {
            double currentView = 0;
            if(statistic.containsKey(video.getId())){
                VideoDetail videoDetail = statistic.get(video.getId());
                currentView = videoDetail.getView();
            }
            currentView = currentView + video.getView();
            VideoDetail videoDetail = new VideoDetail(video.getId(), video.getTitle(), currentView);
            statistic.put(video.getId(), videoDetail);
        }

        for (String id :
                statistic.keySet()) {
            System.out.println("ID: " + id);
            VideoDetail videoDetail = statistic.get(id);
            System.out.println("Tên Video: " + videoDetail.getTitle());
            System.out.println("Tổng lượt xem: " + videoDetail.getView());
        }
    }
}
