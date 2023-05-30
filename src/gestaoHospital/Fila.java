package gestaoHospital;
public class Fila<T> {
    T val;
    ListaEncad<T> lista = new ListaEncad<>(); 
    public void enqueue(T add){
        if(add == null){
            System.out.println("elemento invalido");
            return;
        }
        lista.InserirUlt(add);
    }
    public T dequeue(){
        if(!isEmpty()){
            val = lista.getTail().getValue();
            lista.DeletarPrim();
            return val;
        }
        System.out.println("esta vazia!");
        return null;
    }
    public int size(){
        return lista.getSize();
    }
    public boolean isEmpty(){
        if(lista.getSize()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public T front(){
        return lista.getTail().getValue();
    }
    public Fila() {
    }
    
}
