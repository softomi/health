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
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class ProcedureInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cptCode;      //"cptCode": "77049",
	private String bodyPart;    //"bodyPart": null,
	private String modifier;    //"modifier": null,
	private String description; //"description": "MR-Breast with and without contrast Bilateral",
	                            //private String "id": null,
	private boolean active;     // "active": true,
	private boolean cancel;    //"cancel": false,
	private String modality;   //"modality": null,
	private String updateStatus; //"updateStatus": "",
	private String comparableFieldsAsString; //"comparableFieldsAsString":
	
								//"com.infinx.ipa.dto.ProcedureInformation_77049__null_"

	
}
