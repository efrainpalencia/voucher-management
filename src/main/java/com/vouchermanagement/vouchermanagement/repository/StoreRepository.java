package com.vouchermanagement.vouchermanagement.repository;

import com.vouchermanagement.vouchermanagement.entity.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    Page<Store> findByNameIgnoreCase(String q, Pageable pageable);
        Page<Store> findByMallId(Long mallId, Pageable pageable);
}
