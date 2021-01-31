package com.structuralpattern.flyweightpattern.example;

public class Client {

    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();

        Website newsWebsite1 = factory.getWebsite("新闻");

        newsWebsite1.use(new User("小贾"));

        Website newsWebsite2 = factory.getWebsite("新闻");

        newsWebsite1.use(new User("小乙"));

        Website saleWebsite1 = factory.getWebsite("电商");

        saleWebsite1.use(new User("小兵"));

        Website saleWebsite2 = factory.getWebsite("电商");

        saleWebsite2.use(new User("小丁"));

        System.out.println("网站种类有"+factory.getWebsiteCount()+"个");
    }
}
