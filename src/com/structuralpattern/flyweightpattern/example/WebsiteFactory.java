package com.structuralpattern.flyweightpattern.example;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {

    Map<String,Website> websiteMap = new HashMap<String, Website>();

    public Website getWebsite(String websiteName) {
        Website website = websiteMap.get(websiteName);

        if(website == null){
            website = new ConcreteWebsite();
            website.setWebSiteName(websiteName);
            websiteMap.put(websiteName,website);
        }
        return  website;

    }

    public int getWebsiteCount(){
        return websiteMap.size();
    }
}
