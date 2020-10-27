package healthcare.com.healthcaredemo.dto;

import java.util.ArrayList;

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
public class Casesdto {

	private Long id;
	private FacilityInformationdto facility;
	private PhysicianInformatondto physician;
	private PatientInformationdto patient;
	private ArrayList<InsuranceInformationdto> insurance = new ArrayList<InsuranceInformationdto>();
	private ArrayList<ProcedureInformationdto> procedure = new ArrayList<ProcedureInformationdto>();
	private Workflowdto workflow;
	private UserInformationdto user;
	private AuthDeterminationAgentRequestListdto authDeterminationAgentRequestList; //"authDeterminationAgentRequestList": null,
	private ArrayList<DignosisInformationdto> dignosis = new ArrayList<DignosisInformationdto>();
	private CaseInformationdto caseinfo;
	
//  private AttachmentInformationdto attachment;
//	private Commentdto comment;
//	private ProcedureAuthorizationInfodto procedureAuthorizationInfo; 
//	private NotificationInfodto notificationInfo; //"notificationInfo": null,	
//	private EligiblityBenefitsDetailsdto eligiblityBenefitsDetails; //"eligiblityBenefitsDetails": null,
//	private PpeInformationdto ppeInformation; //"ppeInformation": null,
//	private CertificateInformationdto certificateInformation; //"certificateInformation": null,
//	private ProviderBMInformationdto providerBMInformation; //"providerBMInformation": null,
	
	private CancelInformationdto cancelInformation; //"cancelInformation": null,
	private boolean isDraft;
	//private isDraft isDraft; //"isDraft": false
   
}
