package com.structuralpattern.flyweightpattern.example;

public abstract class Website {

    private String webSiteName;

    abstract void use(User user);

    public String getWebSiteName() {
        return webSiteName;
    }

    public void setWebSiteName(String webSiteName) {
        this.webSiteName = webSiteName;
    }
}
