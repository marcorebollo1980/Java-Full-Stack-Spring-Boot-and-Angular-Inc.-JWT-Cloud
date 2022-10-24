package service;

import model.PurchaseHistory;
import projections.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {


    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUsers(Long userId);
}
