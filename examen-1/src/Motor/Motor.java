package Motor;

import Componentes.IMotor;

public abstract class Motor implements IMotor{

	//immutable
	public final void print() {
		  System.out.println(tipo());
	}
}
