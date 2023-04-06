package com.nogayhusrev.adventure_game.location;

import com.nogayhusrev.adventure_game.obstacles.Snake;
import com.nogayhusrev.adventure_game.player.Player;

public class Mine extends BattleLocation {
    public Mine(Player player) {
        super(player, "Mine", new Snake(), "random", 5, 6);
    }
}
