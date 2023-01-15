package fr.ph1lou.werewolfapi.events.random_events;

import fr.ph1lou.werewolfapi.annotations.statistics.StatisticsEvent;
import fr.ph1lou.werewolfapi.annotations.statistics.StatisticsPlayer;
import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@StatisticsEvent(key = "werewolf.random_infection")
public class InfectionRandomEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final IPlayerWW playerWW;
    private boolean cancel = false;

    public InfectionRandomEvent(IPlayerWW playerWW) {
        this.playerWW = playerWW;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancel = cancelled;
    }

    @StatisticsPlayer
    public IPlayerWW getPlayerWW() {
        return playerWW;
    }

}

