import java.util.*;
//This class is used to store the relationship between tokens and intermediate code commands, e.g. ('+', 'add').
//It is used in quad generation
public class CmdTable{
    private HashMap<String, String> table;
    public CmdTable(){
        table = new HashMap<String, String>();
    }
}