package ir.dotprint.news.Model;

public class NewsItems {
    String id;
    String title;
    String shortdes;
    String fulldes;
    String imgpost;
    String imgauthor;
    String date;

    public NewsItems(String id, String title, String shortdes, String fulldes, String imgpost, String imgauthor, String date) {
        this.id = id;
        this.title = title;
        this.shortdes = shortdes;
        this.fulldes = fulldes;
        this.imgpost = imgpost;
        this.imgauthor = imgauthor;
        this.date = date;
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

    public String getShortdes() {
        return shortdes;
    }

    public void setShortdes(String shortdes) {
        this.shortdes = shortdes;
    }

    public String getFulldes() {
        return fulldes;
    }

    public void setFulldes(String fulldes) {
        this.fulldes = fulldes;
    }

    public String getImgpost() {
        return imgpost;
    }

    public void setImgpost(String imgpost) {
        this.imgpost = imgpost;
    }

    public String getImgauthor() {
        return imgauthor;
    }

    public void setImgauthor(String imgauthor) {
        this.imgauthor = imgauthor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
