package Controller;

import Entity.thoikhoabieu;
import Service.thoikhoabieu_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class thoikhoabieuController {

    @Autowired
    private thoikhoabieu_Service thoikhoabieuService;

    @GetMapping(value = "/thoikhoabieu/getALl")
    public List<thoikhoabieu> getAllthoikhoabieu()
    {return thoikhoabieuService.getAll();}

    @GetMapping(value = "/thoikhoabieu/getthoikhoabieuById/{tkbId}")
    public List<thoikhoabieu> getthoikhoabieuById(Integer tkbId) {return thoikhoabieuService.getAll();}

    @GetMapping(value = "/thoikhoabieu/createthoikhoabieu")
    public thoikhoabieu createthoikhoabieu(@RequestBody thoikhoabieu tkb) {return thoikhoabieuService.createthoikhoabieu(tkb);}

    @GetMapping(value = "/thoikhoabieu/updatethoikhoabieu")
    public thoikhoabieu updatethoikhoabieu(@RequestBody thoikhoabieu tkb) {return thoikhoabieuService.updatethoikhoabieu(tkb);}

    @GetMapping(value = "/thoikhoabieu/patchthoikhoabieu")
    public thoikhoabieu patchthoikhoabieu(@RequestBody thoikhoabieu tkb) {return thoikhoabieuService.updatethoikhoabieu(tkb);}

    @DeleteMapping(value = "/thoikhoabieu/deletethoikhoabieu/{tkbId}")
    public void deletethoikhoabieu(@PathVariable Integer tkbId) {thoikhoabieuService.deletethoikhoabieu(tkbId);}
}
