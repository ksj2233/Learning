package sec02.optional;

public class Company {
	private String cName; // 회사이름
	ContInfo cInfo;

	public Company(String cName, ContInfo cInfo) {
		this.cName = cName;
		this.cInfo = cInfo;
	}

	public String getcName() {
		return cName;
	}

	public ContInfo getcInfo() {
		return cInfo;
	}

}
