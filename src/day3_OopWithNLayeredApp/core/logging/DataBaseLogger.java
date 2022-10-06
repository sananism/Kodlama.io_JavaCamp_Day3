package day3_OopWithNLayeredApp.core.logging;

public class DataBaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanina loglandi : " + data);
		
	}

}
