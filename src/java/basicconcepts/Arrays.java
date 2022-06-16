package basicconcepts;

public class Arrays {

    public static void main(String[] args) {
        int i[] = {10, 20, 30};
        int j = 20;

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        String[] aStringArr = new String[15];

        for (int index =0; index < arr.length; index++){
            System.out.println(arr[index]);
        }

        for (int a : arr){
            System.out.println(a);
        }



    }
}
