
/**
 * Write a description of class ListaDoble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaDoble
{
        private Nodo head;  // referencia al primer nodo de la lista

    public ListaDoble() {
        this.head = null;  // al inicio, la lista está vacía
    }

    // ... (otros métodos)

    // Método para buscar un nodo por el valor de su campo clave y devolver una referencia
    public Nodo buscarPorValor(String valor) {
        Nodo temp = this.head;
        while (temp != null && !temp.name.equals(valor)) {
            temp = temp.next;
        }
        return temp;
    }

    // Método para buscar un nodo por su campo clave e insertar un nuevo nodo después de él
    public void insertarDespuesDe(String clave, String nuevoValor) {
        Nodo nuevoNodo = new Nodo(nuevoValor);

        if (clave == null) {
            // Insertar al principio de la lista
            nuevoNodo.next = this.head;
            if (this.head != null) {
                this.head.prev = nuevoNodo;
            }
            this.head = nuevoNodo;
        } else {
            // Buscar el nodo con clave y insertar después de él
            Nodo temp = buscarPorValor(clave);
            if (temp != null) {
                nuevoNodo.next = temp.next;
                nuevoNodo.prev = temp;
                if (temp.next != null) {
                    temp.next.prev = nuevoNodo;
                }
                temp.next = nuevoNodo;
            }
        }
    }

  public boolean intercambiarNodos(String valor1, String valor2) {
    Nodo nodo1 = buscarPorValor(valor1);
    Nodo nodo2 = buscarPorValor(valor2);

    if (nodo1 != null && nodo2 != null) {
        // Intercambiar nodos
        if (nodo1.prev != null) {
            nodo1.prev.next = nodo2;
        } else {
            this.head = nodo2;
        }

        if (nodo2.prev != null) {
            nodo2.prev.next = nodo1;
        } else {
            this.head = nodo1;
        }

        Nodo tempPrev1 = nodo1.prev;
        Nodo tempNext1 = nodo1.next;
        nodo1.prev = nodo2.prev;
        nodo1.next = nodo2.next;
        nodo2.prev = tempPrev1;
        nodo2.next = tempNext1;

        if (tempPrev1 != null) {
            tempPrev1.next = nodo2;
        }

        if (tempNext1 != null) {
            tempNext1.prev = nodo2;
        }

        return true;
    }
    return false;
}
  // Método para imprimir la lista doblemente enlazada
    public void imprimir() {
        Nodo temp = this.head;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print("[ " + temp.name + " ] <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
