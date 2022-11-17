
package ProjetoIMC;


public class Pessoa {
    
   private float peso;
   private float altura;
   
   
   public Pessoa(){
       System.out.println("IMC - Normal = Entre 18,5 e 24,9 - Sobrepeso = "
               + "Entre 25,0 e 29,9 - Obesidade = Acima de 30,0 - "
               + "Obesidade grave = Acima de 40,0");
   } 
            
   public float calcularIMC(){
       
       float imc = peso / (altura*altura);
       
               return imc;
   }         
   
   public void setPeso(float peso){
       this.peso = peso;
   }
   
   public void getPeso(float peso){
       this.peso = peso;
   }
   
   public void setAltura(float altura){
       this.altura = altura;
   }
   
   public void getAltura(float altura){
       this.altura = altura;
   }
            
    
}
