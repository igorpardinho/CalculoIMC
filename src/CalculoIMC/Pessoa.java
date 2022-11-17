package CalculoIMC;

public class Pessoa {

        private  float peso;
        private float altura;


        public Pessoa(){
            System.out.println("Construtor iniciado");
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


