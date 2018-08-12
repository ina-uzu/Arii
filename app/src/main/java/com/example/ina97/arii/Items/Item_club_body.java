package com.example.ina97.arii.Items;

public class Item_club_body {
    private String title;
    private String cont;
    private String date;

    public Item_club_body(String date, String title, String cont){
        this.date=date;
        this.title=title;
        this.cont=cont;
    }

    public String getDate(){
        return this.date;
    }
    public String getTitle(){
        return this.title;
    }
    public String getCont(){
        return this.cont;
    }
}
