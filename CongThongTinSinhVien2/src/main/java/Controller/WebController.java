package Controller;

import Entity.sinhvien;
import Service.bangdiem_Service;
import Service.sinhvien_Service;
import Service.thoikhoabieu_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {
    @Autowired
    sinhvien_Service sinhvienService;

    @Autowired
    bangdiem_Service bangdiemService;

    @Autowired
    thoikhoabieu_Service thoikhoabieuService;

    @GetMapping("/")
    public String home()
    {
        return "home";
    }


    @GetMapping("/showTTSV_new")
    public String showTTSV_new(Model model){
        sinhvien SV = new sinhvien();
        model.addAttribute("sinhvien",SV);
        return "TTSV_new";
    }

    @PostMapping("/TTSV_new")
    public String savesinhvien(@ModelAttribute("SV")sinhvien SV, Model model)
    {
        sinhvienService.createsinhvien(SV);
        model.addAttribute("listsinhvien", sinhvienService.gettAll());
        return "TTSV_edit";
    }

    @GetMapping("/showTTSV_edit")
    public String showTTSV_edit(@PathVariable(value = "sinhvienId") Integer sinhvienId, Model model)
    {
        sinhvien SV = sinhvienService.getsinhvienBysinhvienId(sinhvienId);
        model.addAttribute("SV",SV);
        return "TTSV_edit";
    }

    @GetMapping("/BangDiem")
    public String getAllbangdiem(Model model){
        model.addAttribute("listbangdiem",bangdiemService.getAll());
        return "BangDiem";
    }


}
