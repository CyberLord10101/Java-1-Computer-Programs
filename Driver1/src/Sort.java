/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author student
 */
public class Sort {
    private static int quickMoveCount;
    private static int mergeMoveCount = 0;
    //Bubble sort
    public static void bubble(int[] a){
        boolean madeSwap = false;
        int counter = 0;
        int endIndex = a.length - 1, temp = 0;
        do{
            madeSwap = false;
            for(int i = 0; i < endIndex;i++){
                if(a[i] > a[i +1]){
                   temp = a[i];
                   a[i] = a[i + 1];
                   a[i +1] = temp;
                   madeSwap = true;
                   counter++;
               }
           }
           endIndex--;
        }
        while(madeSwap);
        System.out.println("Total number of swaps = " + counter);
    }
    //Seletion Sort
    public static void selection(int[] a){
        int minIndex = 0, temp = 0, swap = 0;
        int endIndex = a.length - 1;
        for(int i = 0; i < endIndex; i++){
            minIndex = i;
            for(int j = i + 1; j < a.length;j++ ){
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                    temp = a[i];
                    a[i] = a[minIndex];
                    a[minIndex] = temp;
                    swap++;
                }        
        }
        System.out.println("Total swaps: " + swap);
    }
    
    //Insertion Sort
    public static void insertion(int[] a){
        int temp = 0, index = 0, move = 0; ;
        for(int i = 1; i < a.length; i++){
            index = i - 1;
            temp = a[i];
            while(index >= 0 && a[index] > temp){
                a[index + 1] = a[index];
                index--;
                move++;
            }
            a[index + 1] = temp;
        }
        System.out.println("Number of moves: " + move);
    }
    //Quick Sort
    
    public static void quick(int[] a){
        quickMoveCount = 0;
        quickSort(a, 0, a.length - 1);
        System.out.println("Number of moves : " + quickMoveCount);
        
    }
    private static void quickSort(int[] a, int lo, int hi){
        int pivotIndex = partition(a, lo, hi);
        if(lo < pivotIndex)
            quickSort(a,lo, pivotIndex -1);
        if(hi > pivotIndex)
            quickSort(a, pivotIndex + 1,hi);
    }
    
    private static int partition(int[] a, int lo, int hi){
        int pivotValue = a[lo];
        while(lo < hi){
            while(a[hi] >= pivotValue && lo < hi)
                hi--;

            if(lo != hi){
                a[lo] = a[hi];
                lo++;
                quickMoveCount++;
            }
            while(a[lo] <= pivotValue && lo < hi)
                lo++;

            if(lo != hi){
                a[hi] = a[lo];
                hi--;
                quickMoveCount++;
            }
        }
        a[lo] = pivotValue;
        
        return lo;
    }
    //Merge Sort
    public static void mergeSort(int[] a){
        int[] myCopy = a.clone();   
        order(myCopy, a , 0, a.length - 1);
        System.out.println("Number of moves: " + mergeMoveCount);
        
        
    }
    private static void order(int[] source, int[] dest, int lo, int hi){
        int mid = (lo + hi)/2;
        if(lo != hi){
            order(dest, source, lo ,mid );
            order(dest, source, mid + 1, hi);
            merge(source, dest, lo, mid, hi);         
        }
    }
    private static void merge(int[] source, int[] dest, int lo, int mid, int hi){
        int l = lo, h = mid + 1, destIndex = lo;
        
        do{
            if(source[l] < source[h])
                dest[destIndex++] = source[l++];
            else 
                dest[destIndex++] = source[h++];
            mergeMoveCount++;
        }while(l <= mid && h <= hi);
        
        if(l > mid){
            do{
                dest[destIndex++] = source[h++];
                mergeMoveCount++;
            }while(h <= hi);
        }
        else{
            do{
                dest[destIndex++] = source[l++];
                mergeMoveCount++;
            }while(l <= mid);
        }
    }
    //Java Sort
    public static void javaSort(int[] arr){
        Arrays.sort(arr);
    }
}