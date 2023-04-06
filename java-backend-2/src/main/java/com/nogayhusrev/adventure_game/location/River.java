package com.nogayhusrev.adventure_game.location;

import com.nogayhusrev.adventure_game.obstacles.Bear;
import com.nogayhusrev.adventure_game.player.Player;

public class River extends BattleLocation {
    public River(Player player) {
        super(player, "River", new Bear(), "Water", 2, 5);
    }
}
