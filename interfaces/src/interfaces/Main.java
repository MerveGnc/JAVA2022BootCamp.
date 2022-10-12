package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		
		

	}

}

//bir class birden fazla interfacei inherit(implement) edebilir.
//interfacler newlenemez
