package com.neu.entity;

import java.util.Date;

public class Empl {
	private Integer employeeId;
	private String name;
	private String gender;
	private Date birthDate;
	private String idNumber;
	private String emp;
	private String job;
	  private Date hiredate;
	  private Date startJobDate;
	  private String employmentForm;
	  private String personSource;
	  private String politicsStatus;
	  private String nation;
	  private String nativePlace;
	  private String telephone;
	  private String email;
	  private String height;
	  private String bloodType;
	  private String maritalStatus;
	  private String naPlace;
	  private String birthPlace;
	  private String hkadr;
	  private String highestEducation;
	  private String highestDegree;
	  private String graduateSchool;
	  private String major;
	  private String graduationDate;
	public Empl() {
		super(); 
		// TODO Auto-generated constructor stub
	}
	public Empl(Integer employeeId, String name, String gender, Date birthDate, String idNumber,
			String emp, String job, Date hiredate, Date startJobDate, String employmentForm, String personSource,
			String politicsStatus, String nation, String nativePlace, String telephone, String email, String height,
			String bloodType, String maritalStatus, String naPlace, String birthPlace, String hkadr,
			String highestEducation, String highestDegree, String graduateSchool, String major, String graduationDate) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.idNumber = idNumber;
		this.emp = emp;
		this.job = job;
		this.hiredate = hiredate;
		this.startJobDate = startJobDate;
		this.employmentForm = employmentForm;
		this.personSource = personSource;
		this.politicsStatus = politicsStatus;
		this.nation = nation;
		this.nativePlace = nativePlace;
		this.telephone = telephone;
		this.email = email;
		this.height = height;
		this.bloodType = bloodType;
		this.maritalStatus = maritalStatus;
		this.naPlace = naPlace;
		this.birthPlace = birthPlace;
		this.hkadr = hkadr;
		this.highestEducation = highestEducation;
		this.highestDegree = highestDegree;
		this.graduateSchool = graduateSchool;
		this.major = major;
		this.graduationDate = graduationDate;
	}
	@Override
	public String toString() {
		return "Employeeinformation [employeeId=" + employeeId + ", name=" + name + ", gender=" + gender
				+ ", birthDate=" + birthDate + ", idNumber=" + idNumber + ", emp=" + emp + ", job=" + job
				+ ", hiredate=" + hiredate + ", startJobDate=" + startJobDate + ", employmentForm=" + employmentForm
				+ ", personSource=" + personSource + ", politicsStatus=" + politicsStatus + ", nation=" + nation
				+ ", nativePlace=" + nativePlace + ", telephone=" + telephone + ", email=" + email + ", height="
				+ height + ", bloodType=" + bloodType + ", maritalStatus=" + maritalStatus + ", naPlace=" + naPlace
				+ ", birthPlace=" + birthPlace + ", hkadr=" + hkadr + ", highestEducation=" + highestEducation
				+ ", highestDegree=" + highestDegree + ", graduateSchool=" + graduateSchool + ", major=" + major
				+ ", graduationDate=" + graduationDate + "]";
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		this.emp = emp;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Date getStartJobDate() {
		return startJobDate;
	}
	public void setStartJobDate(Date startJobDate) {
		this.startJobDate = startJobDate;
	}
	public String getEmploymentForm() {
		return employmentForm;
	}
	public void setEmploymentForm(String employmentForm) {
		this.employmentForm = employmentForm;
	}
	public String getPersonSource() {
		return personSource;
	}
	public void setPersonSource(String personSource) {
		this.personSource = personSource;
	}
	public String getPoliticsStatus() {
		return politicsStatus;
	}
	public void setPoliticsStatus(String politicsStatus) {
		this.politicsStatus = politicsStatus;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getNaPlace() {
		return naPlace;
	}
	public void setNaPlace(String naPlace) {
		this.naPlace = naPlace;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getHkadr() {
		return hkadr;
	}
	public void setHkadr(String hkadr) {
		this.hkadr = hkadr;
	}
	public String getHighestEducation() {
		return highestEducation;
	}
	public void setHighestEducation(String highestEducation) {
		this.highestEducation = highestEducation;
	}
	public String getHighestDegree() {
		return highestDegree;
	}
	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}
	public String getGraduateSchool() {
		return graduateSchool;
	}
	public void setGraduateSchool(String graduateSchool) {
		this.graduateSchool = graduateSchool;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGraduationDate() {
		return graduationDate;
	}
	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}
	
}
