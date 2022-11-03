package sec02.optional;

import java.util.Optional;

public class NullPointerCaseStudy2 {

	public static void main(String[] args) {
		ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
		Company cp = new Company("YaHo Co., Ltd.", ci);
		Friend frn = new Friend("Lee Su", cp);
		showCompAddr(Optional.of(frn));

	}

	public static void showCompAddr(Optional<Friend> frn) {
		String addr = frn.map(Friend::getCmp).map(Company::getcInfo).map(ContInfo::getAdrs).orElse("주소가 없어요.");
		System.out.println(addr);
	}

}
