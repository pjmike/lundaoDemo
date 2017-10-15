package com.pjmike.lundao.enums;

/**
 * Created by DELL on 2017/10/15.
 */
public enum targetType {
    THESIS("thesis"),DEBATETOPIC("debateTopic"),USER("user"),ASKQUESTION("askquestion"),REPLY("reply");
    private String name;

    targetType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "targetType{" +
                "name='" + name + '\'' +
                '}';
    }
}
