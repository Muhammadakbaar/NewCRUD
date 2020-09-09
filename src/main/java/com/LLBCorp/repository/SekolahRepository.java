package com.LLBCorp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.LLBCorp.model.Sekolah;

@Repository
public interface SekolahRepository extends JpaRepository<Sekolah, Long>{
    // List<Sekolah> findAll();
    // Sekolah save(Sekolah sekolah);
    // Sekolah updateSekolah(Long nomor_sekolah, Sekolah sekolah);
    Optional<Sekolah> findByNomorSekolah(Long nomor_sekolah);
    // void deleteByNomorSekolah(Long nomor_sekolah);
    // Sekolah findByNomorSekolah(Long nomor_sekolah);

}