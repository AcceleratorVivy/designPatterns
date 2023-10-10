import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class T111 {
    @Test
    void f11(){
        class Solution {
            List<List<Integer>> res = new ArrayList<>();
            Deque<Integer> path = new ArrayDeque<>();
            int[] nums;
            public List<List<Integer>> subsets(int[] nums) {
                this.nums = nums;
                transerval(0);
                return res;
            }
            void transerval(int index){
                if(index == nums.length){
                    res.add(new ArrayList<>(path));
                    return ;
                }

                transerval(index + 1);
                path.addLast(nums[index]);
                transerval(index+1);
                path.removeLast();
            }
        }

        Solution solution = new Solution();
        long l = System.currentTimeMillis();
        System.out.println(l);
        solution.subsets(arr);
        long r = System.currentTimeMillis();
        System.out.println(r);
        System.out.println(r-l);
    }

    @Test
    void f56(){
        int[] arr = new int[]{1,25,-4};
        ff(arr,0,arr.length-1);
    }


    Integer ff(int[] arr,int l,int r){
        if(l>r)
            return null;
        if( l == r)
            return arr[l];
        int mid = l + ( r - l >>1);
        Integer lmax = ff(arr,l,mid-1);
        Integer rmax = ff(arr,mid + 1 ,r);

        int i = mid ;
        int sum = 0 ;
        Integer maxl = null;
        while(i>=l){
            sum += arr[i];
            i--;
            maxl = maxl == null ? sum : Math.max(maxl , sum);
        }
        Integer maxr = null;
        i = mid;
        sum = 0 ;
        while(i<=r){
            sum += arr[i];
            i++;
            maxr = maxr == null ? sum : Math.max(maxr , sum);
        }
        int mmid = maxr + maxl - arr[mid];
        if(lmax == null && rmax == null){
            return mmid;
        }
        if(lmax == null ){
            return Math.max(mmid,rmax);
        }
        if( rmax == null){
            return Math.max(mmid,lmax );
        }
        return Math.max(Math.max(lmax,rmax),mmid);
    }

    @Test
    void f44(){
        class Solution {
            List<List<Integer>> res = new ArrayList<>();
            Deque<Integer> path = new ArrayDeque<>();
            int[] nums;
            public List<List<Integer>> subsets(int[] nums) {
                this.nums = nums;
                transerval(0);
                return res;
            }
            void transerval(int index){
                if(index == nums.length){
                    res.add(new ArrayList(path));
                    return ;
                }

                transerval(index + 1);
                path.addLast(nums[index]);
                transerval(index+1);
                path.removeLast();
            }
        }

        Solution solution = new Solution();
        long l = System.currentTimeMillis();
        System.out.println(l);
        solution.subsets(arr);
        long r = System.currentTimeMillis();
        System.out.println(r);
        System.out.println(r-l);
    }

    @Test
    void f5() {
        class Solution {

            public List<List<Integer>> subsets(int[] nums) {
                List<List<Integer>> res = new ArrayList<List<Integer>>();
                for (int i = 0; i < (1 << nums.length); i++) {
                    List<Integer> sub = new ArrayList<Integer>();
                    for (int j = 0; j < nums.length; j++)
                        if (((i >> j) & 1) == 1) sub.add(nums[j]);
                    res.add(sub);
                }
                return res;
            }

        }
        Solution solution = new Solution();
        long l = System.currentTimeMillis();
        System.out.println(l);
        solution.subsets(arr);
        long r = System.currentTimeMillis();
        System.out.println(r);
        System.out.println(r-l);
    }
    @Test
    void f55(){
        class Solution {

            public List<List<Integer>> subsets(int[] nums) {
                List<List<Integer>> res = new ArrayList<List<Integer>>();
                for (int i = 0; i < (1 << nums.length); i++) {
                    List<Integer> sub = new ArrayList<Integer>();
                    for (int j = 0; j < nums.length; j++)
                        if (((i >> j) & 1) == 1) sub.add(nums[j]);
                    res.add(sub);
                }
                return res;
            }

        }      Solution solution = new Solution();
        long l = System.currentTimeMillis();
        System.out.println(l);
        solution.subsets(arr);
        long r = System.currentTimeMillis();
        System.out.println(r);
        System.out.println(r-l);
    }

    @Test
    void f2(){
        class Solution {
            List<List<Integer>> res = new ArrayList<>();
            Deque<Integer> path = new ArrayDeque<>();
            int[] nums;
            public List<List<Integer>> subsets(int[] nums) {
                this.nums = nums;
                transerval(0);
                return res;
            }
            void transerval(int index){
                if(index == nums.length){
                    res.add(new ArrayList(path));
                    return ;
                }


                path.addLast(nums[index]);
                transerval(index+1);
                path.removeLast();

                transerval(index + 1);
            }
        }

        Solution solution = new Solution();
        long l = System.currentTimeMillis();
        System.out.println(l);
        solution.subsets(arr);
        long r = System.currentTimeMillis();
        System.out.println(r);
        System.out.println(r-l);
    }
    @Test
    void f3(){
        class Solution {
            List<List<Integer>> res = new ArrayList<>();
            Deque<Integer> path = new ArrayDeque<>();
            int[] nums;
            public List<List<Integer>> subsets(int[] nums) {
                this.nums = nums;
                transerval(0);
                return res;
            }
            void transerval(int index){
                if(index == nums.length){
                    res.add(new ArrayList(path));
                    return ;
                }


                path.addLast(nums[index]);
                transerval(index+1);
                path.removeLast();

                transerval(index + 1);
            }
        }

        Solution solution = new Solution();
        long l = System.currentTimeMillis();
        System.out.println(l);
        solution.subsets(arr);
        long r = System.currentTimeMillis();
        System.out.println(r);
        System.out.println(r-l);
    }

    static int[] arr;
    static  int count = 20;
    @BeforeAll
    public static void before(){
        arr =new int[count];
        for(int i =0  ; i< count; i++){
            arr[i] = (int)(Math.random()*50);
        }
    }
}
