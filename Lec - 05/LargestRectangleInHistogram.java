package grp3;
import java.util.*;
public class LargestRectangleInHistogram {
	public static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max=0;
        
        for(int i=0; i<heights.length; i++){
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                int r=i;
                int h=heights[st.pop()];
                if(st.isEmpty()){
                    max=Math.max(max,h*r);
                }
                else{
                    int l = st.peek();
                    max=Math.max(max,h*(r-l-1));
                }
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int r=heights.length;
            int h=heights[st.pop()];
            if(st.isEmpty()){
                max=Math.max(max,h*r);
            }
            else{
                int l = st.peek();
                max=Math.max(max,h*(r-l-1));
            }
        }
        return max;
    }
	public static void main(String[] args) {
		int[] arr= {2,1,5,6,2,3};
		int ans = largestRectangleArea(arr);
		System.out.println(ans);

	}

}
