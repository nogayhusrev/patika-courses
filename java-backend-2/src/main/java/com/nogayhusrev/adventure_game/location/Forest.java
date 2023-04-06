package com.nogayhusrev.adventure_game.location;

import com.nogayhusrev.adventure_game.obstacles.Vampire;
import com.nogayhusrev.adventure_game.player.Player;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "Wood", 3, 4);
    }
}
