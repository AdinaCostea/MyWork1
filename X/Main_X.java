import java.util.Scanner;
public class Main_X {
 static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduceti dimensiunea sirului:");
		int dim=scan.nextInt();
		char a[]=new char[dim];
		System.out.println("Introduceti caracterele sirului:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.next().charAt(0);
		}
		X ob1=new X(a,"Ana",4);
        System.out.println("Primul obiect:");
        System.out.println(ob1.get_sir_caractere());
        System.out.println(ob1.get_str());
        System.out.println(ob1.get_n());
        ob1=null;
        System.gc();
        System.runFinalization();
        X ob2 =new X();
		char[] s1={'x','y','z'};
		ob2.set_sir_caractere(s1);
		ob2.set_str("Ana are mere");
		System.out.println("Introduceti o valoare:");
		int val=scan.nextInt();
		ob2.set_n(val);
		System.out.println("Noul obiect creat");
		 System.out.println(ob2.get_sir_caractere());
	     System.out.println(ob2.get_str());
	    System.out.println(ob2.get_n());
	    ob2=null;
	    System.gc();
	    System.runFinalization();
	}

}
