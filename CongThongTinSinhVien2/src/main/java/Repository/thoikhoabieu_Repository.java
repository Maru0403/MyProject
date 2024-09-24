package Repository;

import Entity.thoikhoabieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface thoikhoabieu_Repository extends JpaRepository<thoikhoabieu,Integer> {
    thoikhoabieu findBytkbId(Integer tkbId);
}
