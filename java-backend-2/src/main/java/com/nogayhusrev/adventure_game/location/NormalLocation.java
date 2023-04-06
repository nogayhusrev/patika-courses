package com.nogayhusrev.adventure_game.location;
import com.nogayhusrev.adventure_game.player.Player;


public abstract class NormalLocation extends Location {
    public NormalLocation(Player player, String name, int id){
        super(player, name, id);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
