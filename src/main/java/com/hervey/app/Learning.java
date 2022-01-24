package com.hervey.app;


import java.util.List;


public class Learning {
    private String topic1;
    private List<String> typeStuff;

    public Learning(String topic1) {
        this.topic1 = topic1;
    }

    //getters and setters


    public String getTopic1() {
        return topic1;
    }

    public void setTopic1(String topic1) {
        this.topic1 = topic1;
    }

    @Override
    public String toString() {
        return "Learnings{" +
                "topic1='" + topic1 +'\'' +
                ", typeStuff=" + typeStuff +
                '}';
    }
}