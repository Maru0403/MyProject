package Service.impl;

import Entity.sinhvien;
import Repository.sinhvien_Repository;
import Service.sinhvien_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sinhvien_ServiceImpl implements sinhvien_Service {
    @Autowired
    private sinhvien_Repository sinhvienRepository;

    @Override
    public List<sinhvien> gettAll() {
        return sinhvienRepository.findAll();
    }

    @Override
    public sinhvien getsinhvienBysinhvienId(Integer sinhvienId) {
        return sinhvienRepository.findBysinhvienId(sinhvienId);
    }

    @Override
    public sinhvien createsinhvien(sinhvien SV) {
         return sinhvienRepository.save(SV);
    }

    @Override
    public sinhvien updatesinhvien(sinhvien SV) {
        return sinhvienRepository.save(SV);
    }

    @Override
    public void deletesinhvien(Integer sinhvienId) {
        sinhvienRepository.deleteById(sinhvienId);
    }


}
