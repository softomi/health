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
public class PatientInformationdto {

	private Long id;
	private String patientMRN;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private Long dob;    //used long, what is difference betweend dateOfBirth and dob 
	private String contact;
	private String address;
	private String note;
	private String ssn;
	private String rsid;
	private String pmis;

	
}
