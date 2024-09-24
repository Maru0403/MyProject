package Repository;

import Entity.lop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface lop_Repository extends JpaRepository<lop,Integer> {
    lop findBylopId(Integer lopId);
}
