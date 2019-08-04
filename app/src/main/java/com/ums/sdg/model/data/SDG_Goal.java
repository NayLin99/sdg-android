package com.ums.sdg.model.data;

import android.graphics.drawable.Drawable;

public class SDG_Goal {
    private Drawable image;
    private String factsAndFigures;
    private String target;
    private String links;

    public SDG_Goal(Drawable image, String factsAndFigures, String target, String links) {
        this.image = image;
        this.factsAndFigures = factsAndFigures;
        this.target = target;
        this.links = links;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getFactsAndFigures() {
        return factsAndFigures;
    }

    public void setFactsAndFigures(String factsAndFigures) {
        this.factsAndFigures = factsAndFigures;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }
}
