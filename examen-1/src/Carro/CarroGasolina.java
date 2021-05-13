package Carro;

import Componentes.IMotor;
import Componentes.IRelacionesDiferenciales;
import Componentes.ISuspencion;

//2 subclase CarroGasolina
public class CarroGasolina extends Carro {
	private IRelacionesDiferenciales relacion;
	private IMotor motor;
	private ISuspencion suspencion;
	
	public CarroGasolina( ISuspencion suspencion,IMotor motor ,IRelacionesDiferenciales relacion){
		this.relacion = relacion;
		this.motor = motor;
		this.suspencion = suspencion;
	}
	//2 se sobreescribe el metodo tipoCarroOffRoad
	@Override
	public String tipoCarroOffRoad() {
		System.out.println("---------------------------------------------");
		System.out.println("Carro de gasolina");
		System.out.println(suspencion.tipo());
		System.out.println(motor.tipo());
		System.out.println("Relacion " + relacion.tipo());
		System.out.println("---------------------------------------------");
	return tipo();
	}
	
	public String tipo() {
		// TODO Auto-generated method stub
		return "Carro de Gasolina";
	}	

}
