package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar*1.18;
	}

}

//biz aksini belirtmediğimiz sürece javada classlar overrideable
//override yapılmasını istemediğimiz methodların başına final getiriyoruz.