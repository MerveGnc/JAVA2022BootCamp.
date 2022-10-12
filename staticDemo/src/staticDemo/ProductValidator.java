package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static Yapıcı blok çalıştı.");
	}
	//static yapıcı blok çalışır.
	
	public ProductValidator(){
		System.out.println("Yapıcı blok çalıştı.");
	}
	//newlenmediği için bu yapıcı blok çalışmaz.Sadece newlendiği durumlarda yapıcı bloklar çalışır.
	
	
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}



//burada static yaptığımız zaman ProductValidator bir kere oluşur ve bütün kullanıcılar o şekilde kullanır.
//static kullanımı çok yaygın değildir.
//static tanımladığımızda karşıda oluşan bellekten kullanıldıktan sonra atılmıyor.
