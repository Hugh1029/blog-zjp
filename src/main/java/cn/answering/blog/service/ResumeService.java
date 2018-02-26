package cn.answering.blog.service;

import cn.answering.blog.domain.Resume;

import java.util.List;

/**
 * Created by HP on 2017/9/7.
 */
public  interface ResumeService {

    public void saveOrUpdate(Resume resume);

    public void deleteById(String id);

    public void deleteByUsername(String username);

    public Resume findResumeByUsername(String username);

    public List<Resume> findAll();

    public Resume findResumeById(String id);
}
