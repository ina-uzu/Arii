package com.example.ina97.arii.Items;

import android.widget.ImageView;

public class Item_club_news {
    String title;
    String cont;

    public Item_club_news(String title, String cont){
        this.cont=cont;
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public String getCont(){
        return cont;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setCont(String cont){
        this.cont=cont;
    }
}
