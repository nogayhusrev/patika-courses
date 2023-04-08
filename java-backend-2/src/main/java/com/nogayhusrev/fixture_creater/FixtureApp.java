package com.nogayhusrev.fixture_creater;

import java.util.ArrayList;
import java.util.List;

public class FixtureApp {


    public static void main(String[] args) {
        Fixture fixture = new Fixture();

        fixture.addTeam(new Team(1,"Fenerbahçe"));
        fixture.addTeam(new Team(2,"Galatasaray"));
        fixture.addTeam(new Team(3,"GenlerBirliği"));
        fixture.addTeam(new Team(4,"Beşiktaş"));
        fixture.addTeam(new Team(5,"Trabzon"));
        fixture.addTeam(new Team(6,"Konya Spor"));
        fixture.addTeam(new Team(7,"Altay"));


        fixture.generate();

        fixture.display();

    }
}
