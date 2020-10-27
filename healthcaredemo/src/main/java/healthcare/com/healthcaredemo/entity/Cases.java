package healthcare.com.healthcaredemo.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
public class Cases {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/*
	@OneToMany
	private List<DignosisInformation> dignosis = new ArrayList<DignosisInformation>();
	
	@OneToMany
	private List<ProcedureInformation> procedure = new ArrayList<ProcedureInformation>();
	
	

	
	@OneToMany
	private List<InsuranceInformation> insurance = new ArrayList<InsuranceInformation>();

	
	@OneToOne
	private PatientInformation patientinfo;
	
	@OneToOne
	private FacilityInformation facilityinfo;

	@OneToOne
	private PhysicianInformaton physician;
	
	@OneToOne
	private Workflow workflow;
	
	@OneToOne
	private UserInformation user;
	
	*/
	@OneToOne (mappedBy = "case1" )
	private CaseInformation caseinfo;
	
	private boolean isDraft;

//	private AuthDeterminationAgentRequestList authDeterminationAgentRequestList; //"authDeterminationAgentRequestList": null,
//	private AttachmentInformation attachment;
//	private Comment comment;	
//	private ProcedureAuth procedureAuth;
//	private ProcedureAuthorizationInfo procedureAuthorizationInfo; 
//	private NotificationInfo notificationInfo; //"notificationInfo": null,
//	private EligiblityBenefitsDetails eligiblityBenefitsDetails; //"eligiblityBenefitsDetails": null,
//	private PpeInformation ppeInformation; //"ppeInformation": null,
//	private CertificateInformation certificateInformation; //"certificateInformation": null,
//	private ProviderBMInformation providerBMInformation; //"providerBMInformation": null,

	//private CancelInformation cancelInformation; //"cancelInformation": null,
	
	//private isDraft isDraft; //"isDraft": false
   
}
