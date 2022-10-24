package repository;

import model.Book;
import model.PurchaseHistory;
import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import projections.IPurchaseItem;

import java.util.List;

@Repository
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory,Long> {

    @Query(value = "select " +
            "b.title as title, ph.price as price, ph.purchaseTime as purchaseTime " +
            "from PurchaseHistory ph left join Book b on b.id = ph.bookId " +
            "where ph.userId = :userId")
     List<IPurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId);
}
