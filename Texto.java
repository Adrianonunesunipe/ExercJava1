package com.db1.db1start;

public class Texto {
	
	private String Texto;
	
		Texto (String Texto) {
			this.Texto = Texto;

}	
		
		public String letraMaiusculo() {
			return this.Texto.toUpperCase();
		}
		
		public String letraMinuscula() {
			return this.Texto.toLowerCase();
		}
		
		public int numeroLetras() {
			return this.Texto.length();
		}
		
		public int numeroLetrasEspaco() {
			return this.Texto.length();
		}
		
		public int numeroLetrasSemEspaco() {
			return this.Texto.replaceAll(" ", "").length();
		}
		
		public String quatroPrimeirasLetras() {
			return this.Texto.substring(0, 4);
		}
		
		public String apartirDaTerceiraLetra() {
			return this.Texto.substring(3);
		}
		
		public String quatroUltimasLetras() {
			return this.Texto.substring(10);
		}
		
		public String substituiPrimeiroNome() {
			return this.Texto = this.Texto.replace("Adriano", "ALUNO");
		}
		
		public String[] textoSeparadamente() {
			String[] arreyString = this.Texto.split(",");
			return arreyString;
		}
		
		public int numeroVogais() {
			int cont = 0;
			int i = 0;
			for(i = 0; i <= this.Texto.length() - 1; i++) {
				char c = this.Texto.charAt(i);
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				{
					cont++;
				}
				
			}
			return cont;
		}
		
		public String textoInvertido() {
			return this.Texto = new StringBuilder(Texto).reverse().toString();
		}

		
}

	
