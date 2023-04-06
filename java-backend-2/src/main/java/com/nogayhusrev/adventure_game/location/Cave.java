package com.nogayhusrev.adventure_game.location;

import com.nogayhusrev.adventure_game.obstacles.Zombie;
import com.nogayhusrev.adventure_game.player.Player;

public class Cave extends BattleLocation {
    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "Food", 3, 3);
    }
}
