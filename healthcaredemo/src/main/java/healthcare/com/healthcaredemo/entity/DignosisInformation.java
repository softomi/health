package healthcare.com.healthcaredemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class DignosisInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String icd_10Code; // "icd_10Code": "Z15.01",
	private String description;
	

}
