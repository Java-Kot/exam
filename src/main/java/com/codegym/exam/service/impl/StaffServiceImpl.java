package com.codegym.exam.service.impl;

import com.codegym.exam.model.Staff;
import com.codegym.exam.repository.StaffRepository;
import com.codegym.exam.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("staffService")
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Page<Staff> findAll(Pageable pageable) {
        return staffRepository.findAll(pageable);
    }

    @Override
    public Staff findById(Integer id) {
        return null;
    }

    @Override
    public void save(Staff staff) {
        staffRepository.save(staff);
    }

    @Override
    public void remove(Integer id) {
        staffRepository.deleteById(id);
    }

    @Override
    public Iterable<Staff> findAllByGroupstaff(Staff staff) {
        return null;
    }
}
