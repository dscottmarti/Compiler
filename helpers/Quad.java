package helpers;
public class Quad{
    public String cmd;
    public String op1;
    public String op2;
    public String dest;

    public Quad(String c, String o1, String o2, String d){
        cmd = c;
        op1 = o1;
        op2 = o2;
        dest = d;
    } 

    public String toString(){
        return "("+cmd+","+op1+","+op2+","+dest+")";
    }
}   