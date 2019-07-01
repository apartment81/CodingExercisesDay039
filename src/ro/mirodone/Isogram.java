package ro.mirodone;

import java.util.Arrays;

public class Isogram {

    boolean isIsogram(String str) {

        str = str.toLowerCase();
        int len = str.length();

       // System.out.println(len);
       // System.out.println(str);

        char arr[] = str.toCharArray();

       Arrays.sort(arr);

/*       for (int j = 0; j<= len-1 ; j++){
            System.out.println(arr[j]);
        }*/

        for (int i = 0; i <len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
            return true;
    }

}
