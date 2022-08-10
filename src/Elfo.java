import UML.Personaje;

    public class Elfo extends Personaje implements Heroe{

        @Override
        public void atacar (){
            System.out.print("ATACANDO "+"\n");
        }
        @Override
        public void defender (){
            System.out.println("defendiendo "+"\n");
        }
        @Override
        public void recibir_ataque (){
            System.out.println("recibe ataque "+"\n" );
        }
}
