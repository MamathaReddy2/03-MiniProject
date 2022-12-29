package com.app.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "User_DTLS")
@Data
public class UserEntity {
	@Id
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "FNAMEE")
	private String userFirstName;

	@Column(name = "LNAME")
	private String userLastName;

	@Column(name = "EMAIL", unique = true)
	private String userEmail;

	@Column(name = "PHNO")
	private Long userPhno;

	@Column(name = "DOB")
	private LocalDate userDob;

	@Column(name = "GENDER")
	private String userGender;

	@Column(name = "COUNTRY")
	private Integer userCountry;

	@Column(name = "STATE")
	private Integer userState;

	@Column(name = "CITY")
	private Integer userCity;

	@Column(name = "PWD")
	private String userPwd;

	@Column(name = "STATUS")
	private String userAccStatus;

}
