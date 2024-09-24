package Repository;


import Entity.sinhvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sinhvien_Repository extends JpaRepository<sinhvien,Integer> {

    sinhvien findBysinhvienId(Integer sinhvienId);
}
