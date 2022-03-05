package com.example.hw73mounth;

public class SecondModel {
    private int image_avatarka;
    private String textLiked;
    private String textTime;
    private int image_foto;

    public SecondModel(int image_avatarka, String textLiked, String textTime, int image_foto) {
        this.image_avatarka = image_avatarka;
        this.textLiked = textLiked;
        this.textTime = textTime;
        this.image_foto = image_foto;
    }

    public int getImage_avatarka() {
        return image_avatarka;
    }

    public void setImage_avatarka(int image_avatarka) {
        this.image_avatarka = image_avatarka;
    }

    public String getTextLiked() {
        return textLiked;
    }

    public void setTextLiked(String textLiked) {
        this.textLiked = textLiked;
    }

    public String getTextTime() {
        return textTime;
    }

    public void setTextTime(String textTime) {
        this.textTime = textTime;
    }

    public int getImage_foto() {
        return image_foto;
    }

    public void setImage_foto(int image_foto) {
        this.image_foto = image_foto;
    }
}
