package com.siwieg.intelligentattendance.api.dtos;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

public class ContractorRegistrationDTO {
	
	private Long id;
	private String name;
	private String email;
	private String password;
	private String socialNumber;
	private String dbaName;
	private String nationalIdentificationNumber;

	public ContractorRegistrationDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@NotEmpty(message = "Name can't be empty.")
	@Length(min = 3, max = 200, message = "Name should contain between 3 e 200 characters.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotEmpty(message = "Email can't be empty.")
	@Length(min = 5, max = 200, message = "Email should contain between 5 e 200 characters.")
	@Email(message="Invalid email.")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@NotEmpty(message = "Password can't be empty.")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@NotEmpty(message = "Social number can't be empty.")
	@CPF(message="Invalid social number")
	public String getSocialNumber() {
		return socialNumber;
	}

	public void setCpf(String socialNumber) {
		this.socialNumber = socialNumber;
	}

	@NotEmpty(message = "DBA name can't be empty.")
	@Length(min = 5, max = 200, message = "DBA name should contain between 5 e 200 characters.")
	public String getDBAName() {
		return dbaName;
	}

	public void setDBAName(String dbaName) {
		this.dbaName = dbaName;
	}

	@NotEmpty(message = "nation")
	@CNPJ(message="Invalid National Identification Number.")
	public String getNationalIdentificationNumber() {
		return nationalIdentificationNumber;
	}

	public void setNationalIdentificationNumber(String nationalIdentificationNumber) {
		this.nationalIdentificationNumber = nationalIdentificationNumber;
	}

	@Override
	public String toString() {
		return "CadastroPJDto [id=" + id + ", nome=" + name + ", email=" + email + ", senha=" + password + ", cpf=" + socialNumber
				+ ", razaoSocial=" + dbaName + ", cnpj=" + nationalIdentificationNumber + "]";
	}

}
