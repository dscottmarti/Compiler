package helpers;
import java.util.*;
//This class functions as a symbol table for the compiler, storing symbols as they are found.
public class SymTab{
    private int nextTemp;
    public HashMap<String,Symbol> table;

    public SymTab(){
        nextTemp = 1;
        table = new HashMap<String,Symbol>();
    }
    //Generate a new temporary variable
    public String newTemp(){
        String s = "T"+nextTemp;
        nextTemp++;
        System.out.println(nextTemp);
        table.put(s, new Symbol(s, "int", true));
        return s;
    }

}