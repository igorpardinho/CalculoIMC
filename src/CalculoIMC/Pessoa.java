package CalculoIMC;

public class Pessoa {

        private  float peso;
        private float altura;


        public  Pessoa(){
            System.out.println("IMC - Abaixo do peso = Menor que 18,5 - Normal = Entre 18,5 e 24,9 - " +
                    "Sobrepeso = Entre 25,0 a 29,9 - Obesidade = 30,0 a 39,9 - Obesidade Grave = Maior que 40,0");
        }


        public float calcularImc(){
            float imc = peso / (altura*altura);
            return imc;
        }

        public void getAltura(float altura) {
            this.altura = altura;
        }
        public void setAltura(float altura){
            this.altura = altura;
        }

        public void getPeso(float peso){
            this.peso = peso;
        }

        public void setPeso(float peso){
            this.peso = peso;
        }
    }


