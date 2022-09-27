package aula;

public class Circunferencia extends Forma{
		
	//atributos 
	private float raio;
	
	//construtores
	public Circunferencia(float r) {
		raio = r;
	}
	
	//metodos de acesso
	public void setRaio(float r) {
		raio = r;
	}
	
	public float getRaio(){
		return raio;
	}
	
	public float area(){
		return raio;
	}
	
	public float perimetro(){
		return 2*raio*3.14f;
	}
	
	public void mostra(){
		System.out.println("Raio: "+raio);
		System.out.println("Area: "+area());
		System.out.println("Perimetro: "+perimetro());
	}
	
}
