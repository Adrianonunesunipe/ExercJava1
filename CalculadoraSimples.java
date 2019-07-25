package com.db1.db1start;

public class CalculadoraSimples {
	
	private int numero1;
	
	private int numero2;
	
	private double numero3;
	
	private double numero4;
	
	private double numero5;
	
	public CalculadoraSimples (int numero1, int numero2, double numero3, double numero4, double numero5) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
		this.numero4 = numero4;
		this.numero5 = numero5;
		
	}
	
	
	public int somar() {
		return this.numero1 + this.numero2;
	}
	
	public int subtrair() {
		return this.numero1 - this.numero2;
	}
	
	public int multiplicar() {
		return this.numero1 * this.numero2;
	}
	
	public int dividir() {
		return this.numero1 / this.numero2;
	}
	
	public int par (){
		return this.numero1 % 2;
	}
	
	public int maior(){
		
		if (this.numero1 > this.numero2){
		return this.numero1;
		}
		else 
	     if(this.numero2 > this.numero1) {
	    return this.numero2;		
	    }
		return 0;
	}
		public int impar(){
			int count = 0;
			for (int i = this.numero1; i <=100; i++) { 
				if (i % 2 != 0){
					count++;
				}
			}

			return count;
		} 
		
		public double menorValorEntreDoisDoubles() {
			if (this.numero3 < this.numero4) {
				return this.numero3;
			}
			else if(this.numero4 < this.numero3) {
				return this.numero4;
			}
			return 0;
		}
		public double menorValorEntreTresDoubles() {
			if(this.numero3 < this.numero4 && this.numero3 < this.numero5) {
				return this.numero3;
			}
			else if(this.numero4 < this.numero3 && this.numero4 < this.numero5) {
				return this.numero4;
			}
			else if(this.numero5 < this.numero3 && this.numero5 < this.numero4) {
				return this.numero5;
			}
			return 0;
			
		}
		
		public double mediaDeTresValores() {
			return (this.numero3 + this.numero4 + this.numero5) / 3;
		}
		
		public double areaTriangulo() {
			return (this.numero3 * this.numero5) / 2;
			
		}
}	



