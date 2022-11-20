package grp3;
import java.util.*;
public class ValidSubarrays {
	public static int validSubarrays(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int sum=0;
        
        for(int i=0; i<nums.length; i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }
            st.push(i);
            sum+=st.size();
        }
        return sum;
    }
	public static void main(String[] args) {
		int[] arr = {1,4,2,5,3};
		System.out.println(validSubarrays(arr));
	}

}
