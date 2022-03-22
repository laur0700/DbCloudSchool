package tema2;

import java.util.ArrayList;

public class MyList <T>{
    ArrayList<T> array;

    public MyList(int dimension){
        this.array = new ArrayList<>(dimension);
    }

    public void add(T element){
        array.add(element);
    }

    public void print(){
        String consoleMessage = "[ ";
        for(T elementInArray : array){
            if(array.indexOf(elementInArray) == array.size()-1)
                consoleMessage = consoleMessage + elementInArray + " ]";
            else
                consoleMessage = consoleMessage + elementInArray + ", ";
        }

        System.out.println(consoleMessage);
    }

    public boolean lookup(T element){
        return array.contains(element);
    }
}
