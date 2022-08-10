import UML.Personaje;
    public class Duende extends Personaje implements Villano {


            @Override
            public void atacar() {
                System.out.print("Duende Atacando "+"\n");

            }

            @Override
            public void destruir() {
                System.out.print("Destruyendo"+"\n");

            }
        }
