package com.LLBCorp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Optional;


import com.LLBCorp.model.Sekolah;

public interface SekolahRepository{
    
    // Sekolah save(Sekolah sekolah);
    // Sekolah updateSekolah(Long nomor_sekolah, Sekolah sekolah);
    Optional<Sekolah> findByNomorSekolah(Long nomor_sekolah);
    // Sekolah findByNomorSekolah(Long nomor_sekolah);
    // void deleteByNomorSekolah(Long nomor_sekolah);

}