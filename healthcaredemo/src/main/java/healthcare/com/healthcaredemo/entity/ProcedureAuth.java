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
public class ProcedureAuth {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cptCode;
	private String bodyPart;
	private String modifier;
	private String description; // "MR-Breast with and without contrast Bilateral",
	
	private boolean active;
	private String cancel;
	private String modality;
	private String updateStatus;
	private String comparableFieldsAsString;
	// comparableFieldsAsString  "com.infinx.ipa.dto.ProcedureInformation_77049__null_"

		
}
