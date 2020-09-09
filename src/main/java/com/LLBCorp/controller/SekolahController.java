package com.LLBCorp.controller;


import com.LLBCorp.model.Sekolah;
import com.LLBCorp.repository.SekolahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import java.util.Optional;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/sekolah")
public class SekolahController {

    // @Autowired
    public SekolahRepository sekolahRepository;

    // @GetMapping("/semua")
    // public @ResponseBody List<Sekolah> getAllSekolah() {
    //     return sekolahRepository.findAll();
    // }

    // @PostMapping("/tambah")
    // public @ResponseBody Sekolah addNewSekolah(@RequestBody Sekolah sekolah){
    //     return sekolahRepository.save(sekolah);
    // }

    @GetMapping("/data/{id}")
    Optional<Sekolah> sekolahByNomorSekolah(@PathVariable(value = "id") Long nomor_sekolah) {
        // return sekolahRepository.findByNomorSekolah(nomor_sekolah).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return sekolahRepository.findByNomorSekolah(nomor_sekolah);
    }

    // @DeleteMapping("/hapus/{id}")
    // public void deleteSekolah(@PathVariable Long nomor_sekolah){
    //     sekolahRepository.deleteByNomorSekolah(nomor_sekolah);
    // }

    // @PutMapping("/edit/{id}")
    // Sekolah updateSekolah(@RequestBody Sekolah newSekolah, @PathVariable Long nomor_sekolah){
    //     return sekolahRepository.findByNomorSekolah(nomor_sekolah)
    //     .map(sekolah ->{
    //         sekolah.setNomorSekolah(newSekolah.getNomorSekolah());
    //         sekolah.setNamaSekolah(newSekolah.getNamaSekolah());
    //         return sekolahRepository.save(sekolah);
    //     }).orElseGet(() -> {
    //         newSekolah.setNomorSekolah(nomor_sekolah);
    //         return sekolahRepository.save(newSekolah);
    //     });
    // }

    // @PutMapping("/edit/{id}")
    // public Sekolah update(@PathVariable("id") Long nomor_sekolah, @RequestBody Sekolah newSekolah) {
    //     Sekolah sekolah = this.sekolahRepository.findByNomorSekolah(nomor_sekolah);
    //     sekolah.setNamaSekolah(newSekolah.getNamaSekolah());
    //   return this.sekolahRepository.save(sekolah);
    // }
}