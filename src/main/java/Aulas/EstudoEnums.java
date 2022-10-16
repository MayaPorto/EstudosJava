package Aulas;
//Enums são estruturas com constantes definidas
    //dias da semana, turnos do dia, estações, feriados...

    public class EstudoEnums {
        public static void  main (String [] args) {
            enum DiaDaSemana {
                Segunda,
                Terca,
                Quarta,
                Quinta,
                Sexta,
                Sabado,
                Domingo
            }
            DiaDaSemana hoje = DiaDaSemana.Domingo;
            System.out.println(hoje);

            enum NivelDev { Junior, Pleno, Senior}
            NivelDev nivel = NivelDev.Senior;
            NivelDev nivel2 = NivelDev.valueOf("Junior");

            switch (nivel) {
                case Junior:
                    System.out.println(("Seu nível é Junior"));
                    break;
                case Pleno:
                    System.out.println(("Seu nível é Pleno"));
                    break;
                case Senior:
                    System.out.println(("Seu nível é Senior"));
                    break;
            }
            // VERSÃO ENHANCED
            switch(nivel) {
                case Junior -> {
                    System.out.println("Seu nível é JUNIOR");
                }
                case Pleno -> {
                    System.out.println("Seu nível é PLENO");
                }
                case Senior -> {
                    System.out.println("Seu nível é SENIOR");
                }
                default -> {
                    System.out.println("Nunca executa");
                }
            }
        }

    }

