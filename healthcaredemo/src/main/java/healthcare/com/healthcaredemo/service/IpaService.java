package healthcare.com.healthcaredemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import healthcare.com.healthcaredemo.entity.Cases;
import healthcare.com.healthcaredemo.repo.IpaRepo;
@Service
public class IpaService {

	@Autowired
	IpaRepo iparepo;

	public List<Cases> getAllData() {
		return iparepo.findAll();
	}

	public Cases uploadData(Cases patient) {
		return iparepo.save(patient);
	}
}

