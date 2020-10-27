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
public class PhysicianInformatondto {

	private Long id;
	private String firstName;
	private String lastName;
	private String physicianExternalId;
	private String npi;
	private String contact;
	private String taxId;
	private String address;
	private String physicianAddressId;
	private String  email;

}
