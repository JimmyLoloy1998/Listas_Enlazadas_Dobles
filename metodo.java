package ListasDobles;

public class metodo {
    NodoDoble primero, ultimo;
    
    public metodo(){
        primero = ultimo = null;
    }
    void agregar(int n){
        NodoDoble newNodo = new NodoDoble(n);
        if(primero == null){
            primero = ultimo = newNodo;
        }else{
            newNodo.sgte = ultimo;
            ultimo.ante = newNodo;
            ultimo = newNodo;
        }
    }
    void mostrarXPila(){
        NodoDoble temp = ultimo;
        while(true){
            if(temp == null)break;
            System.out.print(temp.dato + " ");
            temp = temp.sgte;
        }
    }
    void mostrarXCola(){
        NodoDoble temp = primero;
        while(true){
            if(temp == null)break;
            System.out.println(temp.dato + " ");
            temp = temp.ante;
        }
    }
    /*void eliminar(int n){
        NodoDoble newNodo = new NodoDoble(n);
        while(true){                        //////TAREA///////
            if()
        }
    }*/
}
