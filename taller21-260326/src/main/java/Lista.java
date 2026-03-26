class Lista {
    Nodo cabeza;

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }
    
    public int sumar() {
        int suma = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            suma = suma + actual.dato;
            actual = actual.siguiente;
        }
    

    }
}