package Service;

import Entity.lop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface lop_Service {
    List<lop> getAll();

    lop getlopBylopId(Integer lopId);
    lop createlop(lop lp);
    lop updatelop(lop lp);
    void deletelop(Integer lopId);
}
