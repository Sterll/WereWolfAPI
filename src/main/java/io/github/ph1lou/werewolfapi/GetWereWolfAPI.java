package io.github.ph1lou.werewolfapi;

import fr.minuskube.inv.InventoryManager;
import io.github.ph1lou.werewolfapi.registers.IRegisterManager;
import io.github.ph1lou.werewolfapi.statistics.GameReview;

import java.util.List;
import java.util.Optional;

/**
 * @author Ph1Lou
 */

@SuppressWarnings("unused")

public interface GetWereWolfAPI {
    WereWolfAPI getWereWolfAPI();
    IRegisterManager getRegisterManager();
    Optional<IRegisterManager> getAddonRegisterManager(String addonKey);
    ILanguageManager getLangManager();
    InventoryManager getInvManager();
    List<GameReview> loadPreviousGame();
}