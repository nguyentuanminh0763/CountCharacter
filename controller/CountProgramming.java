package CountCharacter.controller;



import CountCharacter.common.Algorithm;
import CountCharacter.common.Library;
import CountCharacter.model.Valuesss;
import CountCharacter.view.Menu;

public class CountProgramming extends Menu<String>{
    static String[] mc= {"Count word", "Count character", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected String valuesss;

    public CountProgramming(Valuesss valuesss) {
        super("Count Character Project", mc);
        this.library = new Library();
        this.algorithm = new Algorithm();
        this.valuesss = valuesss.getValuesss();
    }


    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                countWord();
                break;
            }
            case 2: {
                countCharacter();
                break;
            }
            case 3: {
                System.exit(0);
            }

        }
    }

    public void countWord(){
        algorithm.tachTu(valuesss);
    }

    public void countCharacter(){
        algorithm.tachKitu(valuesss);
        
    }
    

}
