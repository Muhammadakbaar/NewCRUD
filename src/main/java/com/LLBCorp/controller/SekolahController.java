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

    @Autowired
    public SekolahRepository sekolahRepository;

    @GetMapping("/")
    public @ResponseBody List<Sekolah> getAllSekolah() {
        return sekolahRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Sekolah getByNomorSekolah(@PathVariable("id") Long nomor_sekolah){
        return sekolahRepository.findByNomorSekolah(nomor_sekolah).get();

    }

    @PostMapping("/")
    public @ResponseBody Sekolah addNewSekolah(@RequestBody Sekolah sekolah){
        return sekolahRepository.save(sekolah);
    }

    @DeleteMapping("/{id}")
    public String deleteSekolah(@PathVariable("id") Long nomor_sekolah){
        Sekolah sekolah = sekolahRepository.findByNomorSekolah(nomor_sekolah).get();
        sekolahRepository.delete(sekolah);
        return "Terhapus";
    }

    @PutMapping("/{id}")
    public Sekolah update(@PathVariable("id") Long nomor_sekolah, @RequestBody Sekolah newSekolah) {
        Sekolah sekolah = sekolahRepository.findByNomorSekolah(nomor_sekolah).get();
        sekolah.setNamaSekolah(newSekolah.getNamaSekolah());
      return sekolahRepository.save(sekolah);
    }
} 