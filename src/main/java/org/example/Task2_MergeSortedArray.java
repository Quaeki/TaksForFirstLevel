package org.example;

class Task2_MergeSortedArray {
    public void merge(int[] nums1, int[] nums2, int m, int n){
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (j >= 0){
            if (i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
    }
}
