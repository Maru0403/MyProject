package Controller;

import Entity.sinhvien;
import Service.sinhvien_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class sinhvienController {
    @Autowired
    private sinhvien_Service sinhvienService;

    @GetMapping(value = "/sinhvien/getAll")
    public List<sinhvien> getAllsinhvien()
    { return sinhvienService.gettAll(); }

    @GetMapping(value = "/sinhvien/getsinhvienById/{sinhvienId}")
    public List<sinhvien> getsinhvienById(Integer sinhvienId) { return sinhvienService.gettAll();}

    @GetMapping(value = "/sinhvien/createsinhvien")
    public sinhvien createsinhvien(@RequestBody sinhvien SV) {return sinhvienService.createsinhvien(SV);}

    @GetMapping(value = "/sinhvien/updatesinhvien")
    public sinhvien updatesinhvien(@RequestBody sinhvien SV) {return sinhvienService.updatesinhvien(SV);}

    @PatchMapping(value = "/sinhvien/patchsinhvien")
    public sinhvien patchsinhvien(@RequestBody sinhvien SV) {return sinhvienService.updatesinhvien(SV);}

    @DeleteMapping(value = "/sinhvien/deletesinhvien/{sinhvienId}")
    public void deletesinhvien(@PathVariable Integer sinhvienId) {sinhvienService.deletesinhvien(sinhvienId);}
}
