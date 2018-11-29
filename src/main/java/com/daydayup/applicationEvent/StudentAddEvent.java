package com.daydayup.applicationEvent;

import org.springframework.context.ApplicationEvent;

public class StudentAddEvent   extends ApplicationEvent {
    private static final long serialVersionUID = 20L;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * @param source
     */
    public StudentAddEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
