package com.gm;

public class employee {
	private int eid;
	private String ename;
	private String esalary;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsalary() {
		return esalary;
	}
	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

}
