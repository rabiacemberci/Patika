import java.lang.reflect.Array;
import java.util.Arrays;

public class DiziTekrarEdenSayilar {
    static boolean isFind(int[] arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {22,5,3,6,6,6,22,8,9,4,1,4};
        int[] list = new int[array.length];
        int startIndex = 0;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                if ((i!=j) && array[i]==array[j] ){
                    if (!isFind(list,array[i])){
                        list[startIndex++] = array[i];
                    }
                    break;
                }
            }
        }
        for (int value : list){
            if (value !=0){
                System.out.println(value);
            }
        }
    }
}
