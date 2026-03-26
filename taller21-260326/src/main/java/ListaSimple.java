class ListaSimple {
    Nodo cabeza;

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        Nodo temp = cabeza;
        while (temp.siguiente != null) {
            temp = temp.siguiente;
        }

        temp.siguiente = nuevo;
    }
}