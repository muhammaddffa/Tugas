import java.util.ArrayList;

public class BisKota {
    public static void main(String[] args) {
        ArrayList<int[]> StopGo = new ArrayList<int[]>();
        StopGo.add(new int[] {10, 0});
        StopGo.add(new int[] {3, 5});
        StopGo.add(new int[] {2, 5});

        System.out.println(getPassenger(StopGo));
    }

    public static int getPassenger(ArrayList<int[]> biskota) {
        int result = 0;
        for (int[] array : biskota) {
            for (int element : array) {
                if (element == array[0]) {
                    result += element;
                } else {
                    result -= element;
                }

            }
        }
        return result;
    }

}
