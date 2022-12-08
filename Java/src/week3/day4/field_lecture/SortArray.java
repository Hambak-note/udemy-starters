package week3.day4.field_lecture;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        //입력변수 (최소 5 ~ 10개), 정수
        // 45 89 100 23 234 567
        //입력된 변수 갯수 오름차순 정렬 결과 출력

        int[] unsortedArr = new int[args.length];
        for(int i = 0; i < args.length; i++){
            unsortedArr[i] = Integer.parseInt(args[i]);
        }

        BubbleSort.bubbleSort(unsortedArr);

        System.out.println("==정렬 결과 출력==");
        for(int e : unsortedArr){
            System.out.print(e + " ");
        }
        System.out.println();
    }
}

class BubbleSort{

    public static void bubbleSort(int[] a){
        bubbleSort(a, a.length);
    }

    public static void bubbleSort(int[] a, int size){
        //라운드는 배열 크기 -1 만큼 진행
        for(int i = 1; i < size; i++){
            //각 라운드별 비교 횟수는 배열 크기에서 현재 라운드를 뺀 만큼 비교
            for(int j = 0; j <size-i; j++){
                //현재 원소가 다음 원소보다 클 경우 서로 원소의 위치를 교환한다.
                if(a[j] > a[j+1]){
                    swap(a, j, j+1);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}