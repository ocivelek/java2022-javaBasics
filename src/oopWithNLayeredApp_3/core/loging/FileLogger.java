package oopWithNLayeredApp_3.core.loging;

public class FileLogger implements Logger {
	@Override
	public void log(String data) {
		System.out.println("Dosyaya Loglandı : " + data) ;
		
	}
	

}
