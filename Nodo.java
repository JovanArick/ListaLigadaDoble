
/**
 * Write a description of class Nodo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nodo
{
   String name;
    Nodo prev;
    Nodo next;

    public Nodo(String name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }
       
}
