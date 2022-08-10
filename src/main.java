import UML.Personaje;

public class main {

    public static void main(String[] args) {

        Personaje enano = new Enano();
        System.out.print("Enano"+"\n");
        enano.setDescripcion("Pequeños");
        enano.setTamaño(10);
        enano.setPoder(80);
        enano.setVida(500);

        System.out.print("Descrpcion: "+enano.getDescripcion() +"\n");
        System.out.print("Tamaño del enano: "+enano.getTamaño()+"\n");
        System.out.print("Poder: "+enano.getPoder()+"\n");
        System.out.print("Total de vida: "+enano.getVida()+"\n");

        Elfo elfo1 = new Elfo();
        System.out.println("Elfo");
        elfo1.atacar();
        elfo1.defender();
        elfo1.recibir_ataque();

        Duende duende = new Duende ();
        System.out.println("Duende");
        duende.atacar();
        duende.destruir();





    }
    }

