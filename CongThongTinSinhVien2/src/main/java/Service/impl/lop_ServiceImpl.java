package Service.impl;

import Entity.lop;
import Repository.lop_Repository;
import Service.lop_Service;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class lop_ServiceImpl implements lop_Service {

    private final lop_Repository lopRepository;

    public lop_ServiceImpl(lop_Repository lopRepository) {
        this.lopRepository = lopRepository;
    }

    @Override
    public List<lop> getAll() {
        return lopRepository.findAll();
    }

    @Override
    @Bean
    public lop getlopBylopId(Integer lopId) {
        return lopRepository.findBylopId(lopId);
    }

    @Override
    public lop createlop(lop lp) {
        return lopRepository.save(lp);
    }

    @Override
    public lop updatelop(lop lp) {
        return lopRepository.save(lp);
    }

    @Override
    public void deletelop(Integer lopId) {
        lopRepository.deleteById(lopId);
    }
}
