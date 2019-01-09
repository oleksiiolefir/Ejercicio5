package ejercicio5;

public class Satelite {

		public double meridiano;
		public double paralelo;
		public double distancia_tierra;
		
		public Satelite (double m,double p,double d){
			this.meridiano=m;
			this.paralelo=p;
			this.distancia_tierra=d;
		}
		public Satelite (){
			this.meridiano=paralelo=distancia_tierra=0;
		}
		
		public void setPosicion(double m,double p,double d){
			this.meridiano=m;
			this.paralelo=p;
			this.distancia_tierra=d;
		}
		
		public void printPosicion(){
			System.out.println("El satelite se encuentra en el paralelo"+this.paralelo+"Meridiano"+this.meridiano+"a una distancioa de la tierra de "+this.distancia_tierra+"Kilometros");
		}
		
		public void variaAltura(double desplazamiento) {
			this.distancia_tierra = this.distancia_tierra + desplazamiento;
		}
		
		public boolean enOrbita() {
			
			boolean orbita = true;
			if(this.distancia_tierra==0)
				orbita = false;
			else
				orbita = true;
			
			return orbita; 
					
		}
		
		public void variaPosicion(double variap, double variam) {
			this.meridiano=this.meridiano + variam;
			this.paralelo=this.paralelo + variap;
		}
		
	}


