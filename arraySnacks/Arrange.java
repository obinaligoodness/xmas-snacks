package arraySnacks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrange {
    public static void arrange (String word, int[]index){
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            int indexForArranging = index[i];
            newWord += word.charAt(indexForArranging);
        }
        System.out.println(newWord);
    }

    public static void main(String[] args) {
        int [] index = {0,3,2,4,5,1,6,7,8};
     Arrange.arrange("someiclon",index);
    }
}
