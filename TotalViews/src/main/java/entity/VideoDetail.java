package entity;

public class VideoDetail {
    private String id;
    private String title;
    private Double view;

    public VideoDetail() {
    }

    public VideoDetail(String id, String title, Double view) {
        this.id = id;
        this.title = title;
        this.view = view;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getView() {
        return view;
    }

    public void setView(Double view) {
        this.view = view;
    }
}
