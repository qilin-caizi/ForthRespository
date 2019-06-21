package com.qf.pojo;

public class ManBean {
   
	private Integer cid;
	private String man;
	private String gender;
	private String job;
	private Integer phone;
	private Integer tel;
	private String remark;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getMan() {
		return man;
	}
	public void setMan(String man) {
		this.man = man;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel = tel;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public ManBean(Integer cid, String man, String gender, String job, Integer phone, Integer tel, String remark) {
		super();
		this.cid = cid;
		this.man = man;
		this.gender = gender;
		this.job = job;
		this.phone = phone;
		this.tel = tel;
		this.remark = remark;
	}
	public ManBean() {
		super();
	}
	
}
