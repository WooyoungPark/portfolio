package com.portfolio.dto;

public class UserVO {
	
	private String id;
	private String pwd;
	private int pwdQ;
	private String pwdA;
    private String name;
	private String zip;
	private String add1;
	private String add2;
	private String tel;
	private String phone;
    private String email;
    private String authority;
	private int type;
    
	public UserVO() {
    }
    
    public UserVO(String... strs) {
    	setId(strs[0]);
    	setPwd(strs[1]);
    	setPwdQ(Integer.parseInt(strs[2]));
    	setPwdA(strs[3]);
    	setName(strs[4]);
    	setZip(strs[5]);
    	setAdd1(strs[6]);
    	setAdd2(strs[7]);
    	setTel(strs[8]);
    	setPhone(strs[9]);
    	setEmail(strs[10]);
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getPwdQ() {
		return pwdQ;
	}

	public void setPwdQ(int pwdQ) {
		this.pwdQ = pwdQ;
	}

	public String getPwdA() {
		return pwdA;
	}

	public void setPwdA(String pwdA) {
		this.pwdA = pwdA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
    public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
    public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
