
/**
 * Write a description of class Sequence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Sequence
{
    private int[] values;
    public Sequence(int size){
        values = new int[size];
    }
    public void set(int i, int n){
        values[i] = n;
    }
    public int get(int i){
        return values[i];
    }
    public int size(){
        return values.length;
    }
    public boolean equal(Sequence other){
        if(values.length == other.size()){
            int count = 0;
            for(int i = 0; i < values.length; i++){
                if(values[i] == other.get(i)){
                    count++;
                }
            }
            if(count == values.length){
                return true;
            }
        }
        return false;
    }
    public boolean sameValues(Sequence other){
        for(int i = 0; i < this.size(); i++){
            boolean found = false;
            for(int j = 0; j < other.size(); j++){
                if (other.get(j) == this.get(i)){
                    found = true;
                }
            }
            if(!found){
                return false;
            }
        }
        for(int i = 0; i < other.size(); i++){
            boolean found = false;
            for(int j = 0; j < this.size() && !found; j++){
                if(this.get(j) == other.get(i)){
                    found = true;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
    public Sequence sum(Sequence other){
        if(this.size() > other.size()){
            other.values = Arrays.copyOf(other.values, this.size());
        }
        else{
            this.values = Arrays.copyOf(this.values, other.size());
        }
        
        Sequence sum = new Sequence(this.size());
        for (int i = 0; i < this.size(); i++){
            sum.set(i, this.get(i) + other.get(i));
        }
        return sum;
    }
}
