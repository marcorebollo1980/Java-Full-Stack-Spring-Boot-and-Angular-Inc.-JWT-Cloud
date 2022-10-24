package service;

import model.PurchaseHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projections.IPurchaseItem;
import repository.PurchaseHistoryRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryImpl implements IPurchaseHistoryService{

   @Autowired
   private PurchaseHistoryRepository purchaseHistoryRepository;

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findPurchasedItemsOfUsers(Long userId){
        return purchaseHistoryRepository.findAllPurchasesOfUser(userId);
    }

}
