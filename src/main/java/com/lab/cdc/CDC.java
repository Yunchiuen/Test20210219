
package com.lab.cdc;

public class CDC {
    //官方提供的資料
    private String sent;
    private String headline;
    private String description;
    private String circle;
    //客制化的欄位資料
    private String distance;//距離我的所在地有多遠

    public void setSent(String sent) {
        this.sent = sent;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getSent() {
        return sent;
    }

    public String getHeadline() {
        return headline;
    }

    public String getDescription() {
        return description;
    }

    public String getCircle() {
        return circle;
    }

    public String getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "CDC{" + "sent=" + sent + ", headline=" + headline + ", description=" + description + ", circle=" + circle + ", distance=" + distance + '}';
    }

    
}
