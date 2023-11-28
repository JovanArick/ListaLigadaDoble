public class Main {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();

        // Insertar nodos en la lista
        lista.insertarDespuesDe(null, "A");  // Insertar al principio
        lista.insertarDespuesDe("A", "B");
        lista.insertarDespuesDe("B", "C");
        lista.insertarDespuesDe("C", "D");

        // Imprimir la lista
        System.out.println("Lista original:");
        lista.imprimir();

        // Buscar un nodo por valor
        Nodo nodoBuscado = lista.buscarPorValor("B");
        if (nodoBuscado != null) {
            System.out.println("Nodo encontrado: " + nodoBuscado.name);
        } else {
            System.out.println("Nodo no encontrado");
        }

        // Insertar un nuevo nodo despu�s de un nodo buscado
        lista.insertarDespuesDe("B", "E");
        System.out.println("Lista despu�s de la inserci�n:");
        lista.imprimir();

        // Intercambiar nodos
        lista.intercambiarNodos("B", "D");
        System.out.println("Lista despu�s del intercambio:");
        lista.imprimir();
    }
}


