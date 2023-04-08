package com.nogayhusrev.fixture_creater;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class Fixture {

    private HashMap<Integer, Team> teams;

    private List<Team> homes, aways;


    public Fixture() {
        this.teams = new HashMap<>();
        this.homes = new ArrayList<>();
        this.aways = new ArrayList<>();

    }

    public void addTeam(Team team) {
        teams.put(team.getId(), team);
    }

    public void generate() {

        Random random = new Random();

        Integer[][] week = new Integer[teams.size() / 2][2];


    }

    private void roundIt(Integer[][] week) {


    }


    public void display() {


    }
}
