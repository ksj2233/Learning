package sec02.optional;

public class NullPointerCaseStudy {

	public static void main(String[] args) {
		ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
		Company cp = new Company("YaHo Co., Ltd.", ci);
		Friend frn = new Friend("Lee Su", cp);
		showCompAddr(frn);

	}

	public static void showCompAddr(Friend frn) {
		String addr = null;

		if (frn != null) {
			Company com = frn.getCmp();
			if (com != null) {
				ContInfo info = com.getcInfo();
				if (info != null) {
					addr = info.getAdrs();
				}
			}

			if (addr != null) {
				System.out.println(addr);
			} else {
				System.out.println("주소 정보가 없습니다.");
			}

		}

	}

}
