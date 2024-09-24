package Service;

import Entity.sinhvien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface sinhvien_Service {
    List<sinhvien> gettAll();
    sinhvien getsinhvienBysinhvienId(Integer sinhvienId);
    sinhvien createsinhvien(sinhvien SV);
    sinhvien updatesinhvien(sinhvien SV);
    void deletesinhvien(Integer sinhvienId);

}
