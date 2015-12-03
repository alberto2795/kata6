package kata6;

import java.util.ArrayList;

public class HistogramBuilder <T>{
    
    private final ArrayList<T> lista;

    public HistogramBuilder(ArrayList<T> lista) {
        this.lista = lista;
    }
    
    public <A> Histogram<A> build (Attribute<T,A> attribute){
        Histogram<A> histogram = new Histogram<>();
        for (T lista1 : lista) {
            A value = attribute.get(lista1);
            histogram.increment(value);
        }
        
        return histogram;
    }
}
