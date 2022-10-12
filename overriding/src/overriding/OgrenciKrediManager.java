package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) {
		return tutar*1.10;
		//özel olarak burada verilidiğinde extends edilen değil buradaki çalışır overriding
	}
	
	

}
