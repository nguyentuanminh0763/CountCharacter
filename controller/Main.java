package CountCharacter.controller;

import CountCharacter.common.Library;
import CountCharacter.model.Valuesss;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Valuesss valuesss = new Valuesss();
        valuesss.setValuesss(library.getString("Enter String Input"));
        new CountProgramming(valuesss).run();

    }

}
