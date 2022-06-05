import java.time.LocalDate;
import java.util.Objects;

class Aplicacao {
	
	
	
    public static void main(String[] args) {
        System.out.println(new Carro("a"));
        System.out.println(new Carro("x"));
        
        
        System.out.println(LocalDate.now());
        
    }
    static class Carro {
        private String marca;
        public Carro(String marca) {
            this.marca = marca;
        }
        public boolean equals(Object o) {
            Carro carro = (Carro) o;
            return Objects.equals(marca, carro.marca);
        }/*
        public int hashCode() {
            return 1;
        }*/
    }
}