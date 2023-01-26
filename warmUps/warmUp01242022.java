package warmUps;
public class warmUp01242022
{
    public static int return9(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i == 9) {
                count++;
            }
        }
        return count;
    }
}
