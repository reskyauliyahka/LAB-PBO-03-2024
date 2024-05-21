package TP8_2_H071231009;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        TyperRacer typerRacer = new TyperRacer();
        typerRacer.setNewsWordsToType();
        System.out.println("|| Text to Type ||");
        System.out.println("\"" + typerRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Mansur", 80, typerRacer);
        typers[1] = new Typer("Bot ToKu", 72, typerRacer);
        typers[2] = new Typer("Bot Yukiao", 70, typerRacer);

        typerRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typerRacer.startRace();
    }

    // public static void incrementFailedLoad() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'incrementFailedLoad'");
    // }
}
