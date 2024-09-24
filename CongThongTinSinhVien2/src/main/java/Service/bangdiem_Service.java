package Service;

import Entity.bangdiem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface bangdiem_Service {
    List<bangdiem> getAll();
    bangdiem getbangdiemBybangdiemId(Integer bangdiemId);
    bangdiem createbangdiem(bangdiem BD);
    bangdiem updatebangdiem(bangdiem BD);
    void deletebangdiem(Integer bangdiemId);
}
