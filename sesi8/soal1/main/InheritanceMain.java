package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain {

	public static void main(String[] args) throws ParseException {
		Student s = new Student();
		s.setNim("12101011");
		s.setNama("Dadang Iswanto");
		s.setAlamat("jl.Taman Bunga No. 2");
		s.setTglLahir(new SimpleDateFormat("dd-mm-yyyy").parse ("20-06-1990"));
		s.setNoHp("081122334455");
		
		Employee e = new Employee();
		e.setNip("21100989");
		e.setNama("Adi Sulistiono");
		e.setAlamat("jl.Asam Ajar No. 6");
		e.setTglLahir(new SimpleDateFormat("dd-mm-yyyy").parse ("13-06-1986"));
		e.setNoHp("085210831766");
		
		showData(s);
		System.out.println("\n===========================================\n");
		showData(e);
	}
	
	static void showData(Student s) {
		System.out.println("Class Stringt");
		System.out.println("Nim : " + s.getNim());
		System.out.println("Nama : " + s.getNama());
		System.out.println("Alamat : " + s.getAlamat());
		System.out.println("TglLahir : " + new SimpleDateFormat("dd MMMMM YYYY").format(s.getTglLahir()));
		System.out.println("No HP : " + s.getNoHp());
	}
	
	static void showData(Employee e) {
		System.out.println("Class Employee");
		System.out.println("Nip : " + e.getNip());
		System.out.println("Nama : " + e.getNama());
		System.out.println("Alamat : " + e.getAlamat());
		System.out.println("TglLahir : " + new SimpleDateFormat("dd MMMMM YYYY").format(e.getTglLahir()));
		System.out.println("No HP : " + e.getNoHp());
	}
}
		
		