package com.example.Spring_boot_MVC_Validation_CWD.entity;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginData {
	@NotBlank(message="UserName must Not be blank OR empty")
	@Size(min=3 ,max=12,message="Name must be 3 -12 char ")
	private String userName;
//	@Email(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" ,message="Invalid email")
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" ,message="Invalid email")
	private String email;
	@AssertTrue(message="must Agreed terms and conditions")//if it is true to succes page otherwise errors
	private boolean agred;

}
