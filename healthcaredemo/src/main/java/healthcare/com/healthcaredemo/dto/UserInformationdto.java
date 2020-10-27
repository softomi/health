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

public class UserInformationdto {

	private Long id;
	private Long userId;
	private String userName;
	private String email;
	
}
