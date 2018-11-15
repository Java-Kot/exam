package com.codegym.exam.service;

import com.codegym.exam.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StaffService {
    Page<Staff> findAll(Pageable pageable);

    Staff findById(Integer id);

    void save(Staff staff);

    void remove(Integer id);

    Iterable<Staff> findAllByGroupstaff(Staff staff);
}
