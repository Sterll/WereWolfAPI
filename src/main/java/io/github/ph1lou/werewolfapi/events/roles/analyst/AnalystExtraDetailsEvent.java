package io.github.ph1lou.werewolfapi.events.roles.analyst;

import io.github.ph1lou.werewolfapi.IPlayerWW;
import io.github.ph1lou.werewolfapi.events.roles.SelectionEvent;
import org.bukkit.event.HandlerList;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;

public class AnalystExtraDetailsEvent extends SelectionEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final Set<PotionEffectType> potions;

    public AnalystExtraDetailsEvent(IPlayerWW playerWW, IPlayerWW targetUUID, Set<PotionEffectType> potions){
        super(playerWW,targetUUID);
        this.potions=potions;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public Set<PotionEffectType> getPotions() {
        return this.potions;
    }

}

