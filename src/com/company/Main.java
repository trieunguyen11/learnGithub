package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        increaseArray(arr);
        printArr(arr);
    }

    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void increaseArray(int arr[]){
        int temp = arr[0];
        for(int i = 0; i < arr.length -1 ; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    static void printArr(int arr[]){
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i] + ", ");
        }
    }

}
