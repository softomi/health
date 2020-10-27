package healthcare.com.healthcaredemo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class CancelInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String canceldata; 
}
