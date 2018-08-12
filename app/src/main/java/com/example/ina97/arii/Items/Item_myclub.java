package com.example.ina97.arii.Items;

public class Item_myclub {
    String club_name;
    int img_id;

    public Item_myclub(String name, int img_id){
        this.img_id=img_id;
        this.club_name=name;
    }

    public int getImgId(){
        return this.img_id;
    }
}

