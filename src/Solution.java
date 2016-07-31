import java.io.*;
import java.util.*;

/**
 * Created by i.viktor on 28/07/16.
 */
public class Solution {
    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());


        for (int i = 0; i < n ; i++) {
            String line = reader.readLine();
            String[] strArr = line.split(" ");
            if(strArr.length == 2) {
                addNum(Integer.parseInt(strArr[1]));
            } else delNum();
        }

    }

    public static void addNum(int n) {
        if(list.size()==0){
            list.add(n);
        } else if(list.get(0)>n) list.add(0, n);
        else list.add(n);
    }

    public static void delNum() {
            System.out.println(Collections.min(list));
            list.remove(Collections.min(list));
    }
}
