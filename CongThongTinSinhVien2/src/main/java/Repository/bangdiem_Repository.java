package Repository;

import Entity.bangdiem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface bangdiem_Repository extends JpaRepository<bangdiem, Integer> {
    bangdiem findBybangdiemId(Integer bangdiemId);

    Optional<bangdiem> findByMamon(String mamon);

    @Query(value = "SELECT * FROM bangdiem WHERE delete = :delete", nativeQuery = true)
    List<bangdiem> ahihi(@Param("delete") String a,@Param("delete21") String b);
}
