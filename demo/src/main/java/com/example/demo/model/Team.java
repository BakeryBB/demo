package com.example.demo.model;

public class Team {
    private String name;
    private int memberCount;


    public Team() {

    }

    public Team(String name, int memberCount) {
        this.name = name;
        this.memberCount = memberCount;
    }

    public String getName() {
        return name;
    }
    public int getMemberCount() {
        return memberCount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }
    
    
}
