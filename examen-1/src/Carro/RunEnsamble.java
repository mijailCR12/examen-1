package Carro;

import Motor.*;
import Suspencion.*;
import RelacionesDiferenciales.*;

public class RunEnsamble {

	public static void main(String[] args) {
		//Carro dieles
		new CarroDiesel(createSuspencionType(SuspencionType.ARB), createMotorType(MotorType.M5000),createRelacionType(RelacionType.R47)).tipoCarroOffRoad();;
		//Carro gasolina
		new CarroGasolina(createSuspencionType(SuspencionType.TJM), createMotorType(MotorType.M6000),createRelacionType(RelacionType.R49)).tipoCarroOffRoad();;
		
	}
	
	private enum SuspencionType {
		ARB,
		TJM
	}
	
	private static Suspencion createSuspencionType(SuspencionType type) {
		if (type.equals(SuspencionType.ARB)) {
			return new SuspencionARB();
		}
		return new SuspencionTJM(); 
	}
	
	private enum MotorType {
		M5000,
		M6000
	}
	
	private static Motor createMotorType(MotorType type) {
		if (type.equals(MotorType.M5000)) {
			return new Motor5000cc();
		}
		return new Motor6000cc(); 
	}
	
	private enum RelacionType {
		R47,
		R49
	}
	
	private static RelacionesDiferenciales createRelacionType(RelacionType type) {
		if (type.equals(RelacionType.R47)) {
			return new Relacion47();
		}
		return new Relacion49(); 
	}
}
