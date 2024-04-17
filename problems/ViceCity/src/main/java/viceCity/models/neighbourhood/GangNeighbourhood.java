package viceCity.models.neighbourhood;

import viceCity.models.guns.Gun;
import viceCity.models.players.Player;
import viceCity.repositories.interfaces.Repository;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

public class GangNeighbourhood implements Neighbourhood {

    @Override
    public void action(Player tommyVercetty, Collection<Player> civilPlayers) {
        Repository<Gun> tommyGunRepository = tommyVercetty.getGunRepository();
        Deque<Gun> tommyGuns = new ArrayDeque<>(tommyGunRepository.getModels());
        Deque<Player> players = new ArrayDeque<>(civilPlayers);

        Player player = players.poll();
        Gun gun = tommyGuns.poll();

        while (player != null && gun != null) {

            while (gun.canFire() && player.isAlive()) {
                int shot = gun.fire();
                player.takeLifePoints(shot);
            }
            if (gun.canFire()) {
                player = players.poll();
            } else {
                gun = tommyGuns.poll();
            }

        }

        for (Player civilPlayer : civilPlayers) {
            if (civilPlayer.isAlive()) {


                Repository<Gun> civilPlayerGunRepository = civilPlayer.getGunRepository();
                Deque<Gun> civilPlayerGuns = new ArrayDeque<>(civilPlayerGunRepository.getModels());
                Gun civilPlayerGun = civilPlayerGuns.poll();

                while (civilPlayerGun != null) {
                    while (civilPlayerGun.canFire() && tommyVercetty.isAlive()) {
                        int shot = civilPlayerGun.fire();
                        tommyVercetty.takeLifePoints(shot);
                    }
                    if (!tommyVercetty.isAlive()) {
                        return;
                    }
                    civilPlayerGun = civilPlayerGuns.poll();

                }

            }

        }

    }
}
