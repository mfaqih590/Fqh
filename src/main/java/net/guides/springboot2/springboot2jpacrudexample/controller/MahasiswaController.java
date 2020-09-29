package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.model.Mahasiswa;
import net.guides.springboot2.springboot2jpacrudexample.repository.MahasiswaRepository;

@RestController
@RequestMapping("/nashta/v1")
public class MahasiswaController {
	
	@Autowired
	private MahasiswaRepository mahasiswaRepo;
	
	@GetMapping("/mahasiswa")
	public List<Mahasiswa> getAllMahasiswa() {
		return mahasiswaRepo.findAll();
	}

}
