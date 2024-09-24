package Controller;

import Entity.bangdiem;
import Service.bangdiem_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class bangdiemController {

    @Autowired
    private bangdiem_Service bangdiemService;

    @GetMapping(value = "/bangdiem/getAll")
    public List<bangdiem> getAllbangdiem()
    {return bangdiemService.getAll(); }

    @GetMapping(value = "/bangdiem/getbangdiemById/{bangdiemId}")
    public List<bangdiem> getbangdiemById(Integer bangdiemId) {return bangdiemService.getAll();}

    @GetMapping(value = "/bangdiem/createbangdiem")
    public bangdiem createbangdiem(@RequestBody bangdiem BD) {return bangdiemService.createbangdiem(BD);}

    @GetMapping(value = "/bangdiem/updatebangdiem")
    public bangdiem updatebangdiem(@RequestBody bangdiem BD) {return bangdiemService.updatebangdiem(BD);}

    @PatchMapping(value = "/bangdiem/patchbangdiem")
    public bangdiem patchbangdiem(@RequestBody bangdiem BD) {return bangdiemService.updatebangdiem(BD);}

    @DeleteMapping(value = "/bangdiem/deletebangdiem/{bangdiemId}")
    public void deletebangdiem(@PathVariable Integer bangdiemId) {bangdiemService.deletebangdiem(bangdiemId);}
}
