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

public class InsuranceInformationdto {

	private Long id;
	private int payerType;
	private String groupNumber;
	private String groupName;
	private String masterPayerCode;
	private String payerName;
	private String memberId;
	private String contact;
	private String policyNumber;
	private String nameOfPrimaryInsured;
	private String relationship;
	private boolean active;
	private String tpa;
	private String masterPayerName;
	private String ivChangePayerCode;
	private String preChangePayerCode;
	private String payerId;
	private String updateStatus;
	private String comparableFieldsAsString;
	// comparabal string "com.infinx.ipa.dto.InsuranceInformation_UMR__20010__800-834-3482_"

		
}
