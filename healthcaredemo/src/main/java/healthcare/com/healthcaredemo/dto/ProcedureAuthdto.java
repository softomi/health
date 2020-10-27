package healthcare.com.healthcaredemo.dto;


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
public class ProcedureAuthdto {

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
