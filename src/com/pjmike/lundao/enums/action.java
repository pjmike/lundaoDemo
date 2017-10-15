package com.pjmike.lundao.enums;

/**
 * Created by DELL on 2017/10/15.
 */
public enum action {
    ATTENTION("attention"),LIKE("like"),COMMENT("comment");
    private String name;

    action(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "action{" +
                "name='" + name + '\'' +
                '}';
    }
}
