/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mtech.antm;

/**
 *
 * @author imedia-2
 */
public class News {
    private String title;
    private String details;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the details
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(String details) {
        this.details = details;
    }
    
    public News(String title, String details){
        this.title = title;
        this.details = details;
    }
}
