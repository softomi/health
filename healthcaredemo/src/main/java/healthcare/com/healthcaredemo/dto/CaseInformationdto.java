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
public class CaseInformationdto {

	private Long id;                             //"id": null,
	private Long caseNumber;                     // "caseNumber": null,
	private int requestType;                     //"requestType": "1",
	private String draftId;                      //"draftId": null,
	private String caseStatus;                   //"caseStatus": null,
	private String accessionNumber;              //"accessionNumber": "5592034",
	private String speciality;                   //"speciality": null,
	private String priority;                     //"priority": "Normal",
	private String caseType;                     //"caseType": null,
	private String zone;                         //"zone": null,
	private String zoneCode;                     //"zoneCode": null,
	private String uploadTime;                   //"uploadTime": 1602242923491,
	private String dateOfService;                //"dateOfService": 1603737600000,
	private String dateOfServiceEndDate;         //"dateOfServiceEndDate": null,
	private String orderStatus;                  //"orderStatus": null,
	private String patientClass;                 //"patientClass": null,
	private String admissionType;                //"admissionType": null,
	private String processId;                    //"processId": null,
	private String dateOfServiceEndDateStr;      //"dateOfServiceEndDateStr": null,
	private String dateOfServiceStr;             //"dateOfServiceStr": "2020-10-26T18:40:00Z",
	private String updateType;                   //"updateType": null,
	private String followUp;                     //"followUp": null,
	private String createdOn;                    //"createdOn": null,
	private String createdBy;                    //"createdBy": null,
	private String lastModifiedOn;               //"lastModifiedOn": null,
	private String lastModifiedBy;               //"lastModifiedBy": null,
	private String tackNumber;                   //"tackNumber": null,
	private String reviewCaseUrl;                //"reviewCaseUrl": null,
	private String productType;                  //"productType": null,
	private String externalTransactionId;        //"externalTransactionId": null,
	private String subscriptionType;             //"subscriptionType": null,
	private boolean anyParComplete;              // "anyParComplete": false

}
