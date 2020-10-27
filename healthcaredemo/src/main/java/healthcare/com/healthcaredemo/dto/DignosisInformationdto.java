package healthcare.com.healthcaredemo.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class DignosisInformationdto {

	private Long id;
	private String icd_10Code; // "icd_10Code": "Z15.01",
	private String description;
	

}
