package Clases.ito.poo;
import java.time.LocalDate;
import Clases.ito.poo.Instrumento;
public class MyInstrumento {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       run();
	}
	static void run() {
		System.out.println(new Instrumento("Bateria","Percucion",1,"Jose Alfredo",LocalDate.of(2019,1,04)));

}
}
