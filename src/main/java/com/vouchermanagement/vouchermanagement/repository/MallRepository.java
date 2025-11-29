package com.vouchermanagement.vouchermanagement.repository;

import com.vouchermanagement.vouchermanagement.entity.Mall;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MallRepository extends JpaRepository<Mall, Long> {
    Page<Mall> findByNameIgnoreCase(String q, Pageable pageable);
}
