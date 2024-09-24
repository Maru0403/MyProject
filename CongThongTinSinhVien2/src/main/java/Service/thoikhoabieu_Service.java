package Service;

import Entity.thoikhoabieu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface thoikhoabieu_Service {
    List<thoikhoabieu> getAll();

    thoikhoabieu getthoikhoabieuBytkbId(Integer tkbId);
    thoikhoabieu createthoikhoabieu(thoikhoabieu tkb);
    thoikhoabieu updatethoikhoabieu(thoikhoabieu tkb);
    void deletethoikhoabieu(Integer tkbId);
}
