package Service.impl;

import Entity.bangdiem;
import Repository.bangdiem_Repository;
import Service.bangdiem_Service;
import jakarta.persistence.Id;
import org.apache.tomcat.util.buf.ByteChunk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
public class bangdiem_ServiceImpl implements bangdiem_Service {


    private bangdiem_Repository bangdiemRepository;

    @Override
    public List<bangdiem> getAll() {
        return bangdiemRepository.findAll();
    }

    @Override
    public bangdiem getbangdiemBybangdiemId(Integer bangdiemId) {
        return bangdiemRepository.findBybangdiemId(bangdiemId);
    }
    @Override
    @Transactional
    @Async
    public bangdiem createbangdiem(bangdiem BD) {
        if (StringUtils.isEmpty(BD.getMamon())) {
            throw new RuntimeException("'");
        }
        Optional<bangdiem> bangdiemOptional = bangdiemRepository.findByMamon(BD.getMamon());
        if (bangdiemOptional.isPresent()) {
            throw new RuntimeException("Ma mon da ton tai");
        }

        return bangdiemRepository.save(BD);
    }

    @Override
    public bangdiem updatebangdiem(bangdiem BD) {
        return bangdiemRepository.save(BD);
    }

    @Override
    public void deletebangdiem(Integer bangdiemId) {
        bangdiemRepository.deleteById(bangdiemId);

    }
}
