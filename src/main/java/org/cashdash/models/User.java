package org.cashdash.models;

public class User {
    private int id;
    private String fullname;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String fullname, String username, String password) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
    }

    public User(int id, String fullname, String username, String password) {
        this.id = id;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
