package Aulas.Poo;

// Na interface você define um conjunto de métodos (sem corpo)
    // E a classe que "herda" deve implementar estes métodos
    public interface Animal {
        void dormir(); // definição do método apenas

        void fazerSom();

        void comer(String comida);
    }

    // Gato precisa implementar os métodos
    class Gato implements Animal {
        @Override
        public void dormir() {
            System.out.println("zzzzzz Miau");
        }

        @Override
        public void fazerSom() {
            System.out.println("Miau");
        }

        @Override
        public void comer(String comida) {
            if (comida.equals("Peixe")) {
                System.out.println("Hummm gosto de peixe");
            } else {
                System.out.println("Só como peixe");
            }
        }
    }

    class Galinha implements Animal {
        @Override
        public void dormir() {
            System.out.println("Có có zzzzzz");
        }

        @Override
        public void fazerSom() {
            System.out.println("Có có có có");
        }

        @Override
        public void comer(String comida) {
            System.out.println("Hummm có có " + comida);
        }

        public static void main(String[] args) {
            Galinha galinha = new Galinha();//variavel galinha guarda um objeto Galinha()
            Gato gato = new Gato();

            galinha.fazerSom();
            galinha.dormir();
            galinha.comer("Milho");

            gato.fazerSom();
            gato.dormir();
            gato.comer("Peixe");

            //Interface não cria objeto (Animal novoAnimal = new Animal())

            Animal animalGalinha = new Galinha();
            Animal animalGatinho = new Gato();
            System.out.println("===== POLIMORFISMO =====");
            animalGalinha.fazerSom();
            animalGatinho.fazerSom();

        }
    }

