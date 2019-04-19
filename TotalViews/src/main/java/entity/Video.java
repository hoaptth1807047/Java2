package entity;

public class Video {
    private String day;
    private String id;
    private String title;
    private Double view;

    public Video() {
    }

    public Video(String day, String id, String title, Double view){
        this.day = day;
        this.id = id;
        this.title = title;
        this.view = view;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
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
