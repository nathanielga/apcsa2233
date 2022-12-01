package apcsaProjects2233;
import java.util.ArrayList;


public class project21different1172022
{
    public static void main(String[] args) {
        ArrayList<Boolean> bools = new ArrayList<Boolean>();
        bools.add(true);
        bools.add(false);
        bools.add(true);
        bools.add(false);

        int size = bools.size();


        for (int i = 0; i < size; i++) {
            if (bools.get(i) == false) {
                bools.remove(i);
            }
        }
    }
}
