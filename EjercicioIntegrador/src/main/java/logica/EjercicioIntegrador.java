package logica;

public class EjercicioIntegrador {
    public static void main(String[] args) {

        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();

        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();

        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();

        pikachu.atacarAraniazo();
        pikachu.atacarImpactTrueno();
    }
}