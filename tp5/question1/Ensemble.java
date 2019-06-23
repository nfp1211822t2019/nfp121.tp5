package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

    protected java.util.Vector<T> table = new java.util.Vector<T>();

    public int size() {
        return table.size();
    }

    public Iterator<T> iterator() {
        return table.iterator();
    }

    public boolean add(T t) {
    if(table.contains(t)){  
        return false;
    }
         else{
          table.add(t);
      return true;}
    }

    public Ensemble<T> union(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
          Ensemble<T> u= new Ensemble<T>();
          u.addAll(this);
          u.addAll(e);
          return u;
    }

    public Ensemble<T> inter(Ensemble<? extends T> e) {
        // à compléter pour la question1-2
           Ensemble<T> i= new Ensemble<T>();
           i.addAll(e);
           i.retainAll(this);
           i.toString();
           return i;
    }

    public Ensemble<T> diff(Ensemble<? extends T> e) {
          Ensemble<T> dif= new Ensemble<T>();
          dif.addAll(this);
          dif.removeAll(e);
          return dif;        
    }

    Ensemble<T> diffSym(Ensemble<? extends T> e) {
          Ensemble<T> d= new Ensemble<T>();
           Ensemble<T> i= new Ensemble<T>();
           

           i=this.inter(e);
           d=this.union(e);
           d.removeAll(i);

           return d;
    }
    
}
