package helpers;
//This class is an element of the SymTab class
public class Symbol{
    public String name;
    public String type;
    public int nextUse;
    public String location;
    public Boolean temp;

    public Symbol(String n, String t){
        name = n;
        type = t;
        nextUse = -1;
        location = "";
        temp = false;
    }
    public Symbol(String n, String t, Boolean tmp){
        name = n;
        type = t;
        nextUse = -1;
        location = "";
        temp = tmp;
    }
}