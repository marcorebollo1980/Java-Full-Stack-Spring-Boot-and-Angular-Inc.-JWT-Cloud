package repository;

import model.Role;
import model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username);

    @Modifying
    @Query("update User set role =:role where username =:username")
    void updateUserRole(@Param("username") String username, @Param("rol") Role rol);

    public List<User> findAllUsers();

    @Override
    Page<User> findAll(Pageable pageable);
}
