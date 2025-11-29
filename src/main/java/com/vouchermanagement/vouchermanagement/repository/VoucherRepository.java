package com.vouchermanagement.vouchermanagement.repository;

import com.vouchermanagement.vouchermanagement.entity.Voucher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoucherRepository {
    Page<Voucher> findByTitleContainingIgnoreCase(String q, Pageable pageable);
    Page<Voucher> findByStoreId(Long storeId, Pageable pageable);
    Optional<Voucher> findByCode(String code);
}
