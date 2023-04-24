package vn.ivs.beans;

public class Student {
	private String name;
	private Double mark;
	private String major;
	
	public Student() {}

	public Student(String name, Double mark, String major) {
		this.name = name;
		this.mark = mark;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
}
