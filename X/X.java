/**Definiți o clasă X care va avea ca atribute un șir de caractere privat, un obiect de tip String cu specificatorul 
protected și un întreg fără specificator de acces. Clasa va conține un constructor explicit cu parametri, care va 
inițializa atributele, metode accesor și mutator pentru câmpurile care nu pot fi accesate din afara clasei și va 
redefini metoda finalize() moștenită din clasa Object, care va afișa un mesaj corespunzător.
În metoda main(), plasată în altă clasă, creați un obiect din clasa X, afișați valorile atributelor, apoi pregătiți 
obiectul pentru a fi eliminat de garbage collector. Creați apoi un nou obiect X, modificați valorile atributelor și 
afișați pe ecran valorile acestora.**/
public class X  {
private char [] sir_caractere;
protected String str;
int n;

  public X() {
	super();
}
X(char []sir_caractere,String str,int n){
	  this.sir_caractere=sir_caractere;
	  this.str=str;
	  this.n=n;
  }
  public char[] get_sir_caractere() {
      return sir_caractere;
  }

  public void set_sir_caractere(char[] sir_caractere) {
      this.sir_caractere = sir_caractere;
  }
  public String get_str() {
	  return str;
  }
  public void set_str(String str) {
	  this.str=str;
  }
  public int get_n() {
	  return n;
  }
  public void set_n(int n) {
	  this.n=n;
  }
  @Override
  protected void finalize()
	{ 
		System.out.println("Obiect distrus.");
	}
}
