package Suspencion;
import Componentes.ISuspencion;


public abstract class Suspencion implements ISuspencion{
	//immutable
	public final void print() {
	  System.out.println(tipo());
	}
}
