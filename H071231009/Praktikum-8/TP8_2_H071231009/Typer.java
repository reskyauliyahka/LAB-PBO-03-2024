package TP8_2_H071231009;

public class Typer extends Thread{
    private String botName, wordsTyped;
    private double wpm;
    private TyperRacer typerRacer;
    
    public Typer(String botName, double wpm, TyperRacer typerRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typerRacer = typerRacer;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public void setWordsTyped(String wordsTyped) {
        this.wordsTyped = wordsTyped;
    }

    public double getWpm() {
        return wpm;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    @Override
    public void run(){
        String [] wordsToTyper = typerRacer.getWordsToType().split(" ");
        // TODO 1
        int howLongToType = (int) (60000 / wpm);
        // int kecepatan = (int) (60000 / wpm);

        // TODO 2
        for (String word : wordsToTyper){
            addWordTyped(word);
            try {
                Thread.sleep((long)howLongToType);
            } catch (InterruptedException e) {  
                e.printStackTrace();
            }
        }

        this.addWordTyped("(Selesai)");
        
        // TODO 3
        typerRacer.addResult(new Result(botName, (int) ((howLongToType* wordsToTyper.length)/1000)  ));
    }
    
    
}
