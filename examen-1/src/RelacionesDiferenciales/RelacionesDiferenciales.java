package RelacionesDiferenciales;
import Componentes.IRelacionesDiferenciales;

public abstract class RelacionesDiferenciales implements IRelacionesDiferenciales {
	//immutable
	public final void print() {
	  System.out.println(tipo());
	}
}
