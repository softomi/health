package healthcare.com.healthcaredemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import healthcare.com.healthcaredemo.entity.Cases;

public interface IpaRepo extends JpaRepository<Cases, Long> {

}
