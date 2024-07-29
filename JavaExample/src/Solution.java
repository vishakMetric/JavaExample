import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class Solution {

    public static void main(String[]args) {

        String title="test us test ";

        String [] values = title.trim().split("\\s+");
        StringBuffer sb = new StringBuffer();
        for(String value: values) {
            int length = value.length();
            sb.append(value);
           // sb.append(value.subString(0, length-1));
           // sb.append(value[length].toUpperCase()).append(" ");
        }
        System.out.println(sb.toString());

        //xtitle.trim().split()

        Solution.reverse(123);
       // System.out.println(Solution.reverse("All is Well"));
        HashMap<Integer, Integer> newMap = new HashMap<>();
        int[] numbers = {2,7,11,15};

        System.out.println(Solution.twoSum(numbers, 9)[0]);

        HashSet<Integer> intSet = new HashSet<>();
        int[] nums = {1,2,3,1,1};

        for(int num:nums) {
            if(!intSet.add(num)) {
                System.out.println("Duplicate Found");
            } else {
                System.out.println("No Duplicate Found");
            }
        }

       // List<Integer> list = IntStream.of(nums).collect(Collectors.toList());
        List<Integer> intList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        final boolean b = intSet.addAll(intList);
        System.out.println(intSet.size());
        System.out.println( Arrays.stream(nums).count());

        List<Integer> intList1 = new LinkedList<>();
        intList1.add(10);
        intList1.add(20);
        intList1.add(30);
        intList1.add(1,20);
        System.out.println(intList1);

    }

    public static int reverse(int x) {

        long rev = 0;
        int digit;

        while(x!=0) {
            digit = x%10;
            //System.out.println(digit);
            rev = rev * 10 +digit;
            //System.out.println(rev);
            x = x/10;
        }
        return -1;
    }

    public static String reverse(String s) {
        StringBuffer sb = new StringBuffer();

        String[] words = s.trim().split("\\s+");
        for(int i = words.length-1;i>=0;i--) {
            sb.append(words[i]).append(" ");
        }
return sb.toString();

    }

    public static int[] twoSum(int[] numbers, int target) {

        int arrLength = numbers.length;

        for(int i=0;i<arrLength;i++) {
            for(int j = i+1; j<arrLength;j++) {
                if(numbers[i]+numbers[j] == target) {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return  new int[]{-1,-1};
    }

    public void rotate(int[] nums, int k) {

        int length = nums.length;
        int remainIndex = length - k;




    }


}
