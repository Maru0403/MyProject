package Service.impl;

import Entity.thoikhoabieu;
import Repository.thoikhoabieu_Repository;
import Service.thoikhoabieu_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class thoikhoabieu_ServiceImpl implements thoikhoabieu_Service {

    @Autowired
    private thoikhoabieu_Repository thoikhoabieuRepository;


    @Override
    public List<thoikhoabieu> getAll() {
        return thoikhoabieuRepository.findAll();
    }

    @Override
    public thoikhoabieu getthoikhoabieuBytkbId(Integer tkbId) {
        return thoikhoabieuRepository.findBytkbId(tkbId);
    }

    @Override
    public thoikhoabieu createthoikhoabieu(thoikhoabieu tkb) {
        return thoikhoabieuRepository.save(tkb);
    }

    @Override
    public thoikhoabieu updatethoikhoabieu(thoikhoabieu tkb) {
        return thoikhoabieuRepository.save(tkb);
    }

    @Override
    public void deletethoikhoabieu(Integer tkbId) {
    thoikhoabieuRepository.deleteById(tkbId);
    }
}
