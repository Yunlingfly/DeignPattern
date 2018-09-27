package test3;

import java.util.ArrayList;

public class AbstractSubject implements ISubject{
    private ArrayList<IObserver> array = new ArrayList<IObserver>();

    @Override
    public void register(IObserver obs) {
        // TODO Auto-generated method stub
        array.add(obs);
        
    }
    @Override
    public void unregister(IObserver obs) {
        // TODO Auto-generated method stub
        array.remove(obs);
        
    }
    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for(int i=0;i<array.size();i++){
            IObserver  obs = array.get(i);
            obs.refresh(this);
        }    
    }
}