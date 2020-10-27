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
public class FacilityInformationdto {

 private Long id;
 private String tenantId;
 private String tenantKey;
 private String clientName;
 private String region;
 private String locationName;
 private String practiceName;
 private String facilityCode;
 private String facility;
 private String facilityNPI;
 private String facilityAddress;
 private String facilityContact;
 private String facilityFax;
 private String facilityTaxId;
 private String facilityZip;
 private String facilityLocationMasterCode;


}
