package dataArray;

public class main {
    public static void main(String[] args){

        Array arr = new Array(20);
        for(int i=0; i<10; i++){
            arr.addLast(i);
        }
        arr.add(3,6);
        System.out.println(arr);
//        int [] arr = new int[10];
//        for(int i=0 ;i<arr.length;i++){
//            arr[i] = i;
//        }
//
//        int[] scores = new int[]{100,99,66};
//        for (int i=0;i<scores.length;i++)
//            System.out.println(scores[i]);
//        for(int score : scores)
//            System.out.println(score);
//
//        scores[0] = 98;
//        for(int score : scores)
//            System.out.println(score);
    }
}
