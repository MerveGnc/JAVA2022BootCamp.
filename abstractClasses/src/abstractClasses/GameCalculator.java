package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun Bitti");
	}

}

//abstract methodlarda bütün inherit eden classlar o methodu kendi içinde kullanmak zorunda.
//bir classta abstract olmak zorunda değil.
//abstractlar basei saklamak istediğimiz zamanlarda kullanılır.
//abstract sınıflar newlenemez