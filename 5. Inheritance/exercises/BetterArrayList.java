import java.util.ArrayList;

public class BetterArrayList extends ArrayList{

    // Implement pop and print methods 
    public Object pop() {
        if (this.size() == 0) {
            return null;
        }
        return this.remove(this.size() - 1);
    }

    public void print() {
        for (Object item : this) {
            System.out.println(item);
        }
    }
}
