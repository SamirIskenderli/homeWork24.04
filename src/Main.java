import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int [] array = {1,2,3,4,5,6,7,8,9,10};

deleteElementInArray(array);
    }
    public static void deleteElementInArray(int [] array){
        int [] array2 = new int[array.length - 1];
        for(int i = 0; i < array.length - 1;i++){
            if(i<array.length/2){
                array2[i] = array[i];
            }else {
                array2[i] = array[i + 1];
            }
        }
        System.out.println(Arrays.toString(array2));
    }


}