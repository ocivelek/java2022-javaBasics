package oopWithNLayeredApp_3.core.loging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanına Loglandı : " + data) ;
		
	}

}
