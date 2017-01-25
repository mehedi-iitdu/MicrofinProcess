package com.example.mehedi.microfinprocess.processCard;

/**
 * Created by mehedi on 1/23/17.
 */

public class CardData {

    private String process_name;
    private int process_image;

    public CardData(int process_image, String process_name){
        this.process_name = process_name;
        this.process_image = process_image;
    }

    public void setProcess_name(String process_name){
        this.process_name = process_name;
    }

    public void setProcess_image(int process_image){
        this.process_image = process_image;
    }

    public String getProcess_name(){
        return process_name;
    }

    public Integer getProcess_image(){
        return process_image;
    }
}
