package com.codegym.exam.repository;

import com.codegym.exam.model.Staff;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StaffRepository extends PagingAndSortingRepository<Staff, Integer> {

}
