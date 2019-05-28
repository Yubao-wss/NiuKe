package com.waston.niuke;

/**
 * @Description: 寻找数组中第K大元素
 * @Author: Waston
 * @Date: 2019/5/22 10:14
 */
public class Finder {
    public int findKth(int[] a, int n, int k) {
        return findKth(a,0,n-1,k);
    }

    public int findKth(int[] a,int low,int high,int k){
        int part = partation(a,low,high);

        if(k == part - low + 1){
            return a[part];
        }else if(k > part - low + 1){
            return findKth(a,part + 1,high,k - part + low - 1);
        }else {
            return findKth(a,low,part - 1,k);
        }
    }

    // 快排
    public int partation(int[] a,int low,int high){
        int key = a[low];
        while (low < high){
            while (low < high && a[high] <= key){
                high--;
            }
            a[low] = a[high];
            while(low < high && a[low] >= key){
                low++;
            }
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }
}


