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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FacilityInformation {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
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
