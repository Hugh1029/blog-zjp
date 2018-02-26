package cn.answering.blog.service.impl;

import cn.answering.blog.domain.Resume;
import cn.answering.blog.repository.ResumeRepository;
import cn.answering.blog.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by HP on 2017/9/7.
 */
@Service
public class ResumeServiceImpl implements ResumeService{

    @Autowired
    private ResumeRepository resumeRepository;

    @Transactional
    @Override
    public void saveOrUpdate(Resume resume) {
        resumeRepository.save(resume);
    }

    @Transactional
    @Override
    public void deleteById(String id) {
        resumeRepository.delete(id);
    }

    @Transactional
    @Override
    public void deleteByUsername(String username) {

    }

    @Override
    public Resume findResumeByUsername(String username) {
        return null;
    }

    @Override
    public List<Resume> findAll() {
        return resumeRepository.findAll();
    }

    @Override
    public Resume findResumeById(String id) {
        return resumeRepository.findOne(id);
    }
}
