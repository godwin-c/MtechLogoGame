/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mtech.antm;

/**
 *
 * @author imedia-2
 */
public class AppUsers {
    private String username;
    private String email;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
   
    public AppUsers(String username, String email){
        this.username = username;
        this.email = email;
        
    }
}
