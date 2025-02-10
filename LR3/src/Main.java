public class Main {
    public static void main(String[] args) {
        int[] SortArr = {12, 6, 4, 3, 2, 14, 5, 25, 65, 43, 1, 23, 54, 20};
        SelectionSort(SortArr);
        for (int i = 0; i < SortArr.length; i++) {
            System.out.print(SortArr[i] + "\n");
        }
    }

    public static void SelectionSort(int[] SortArr) {
        for (int i = 0; i < SortArr.length; i++) {
            int poz = i;
            int max = SortArr[i];
            for (int j = i + 1; j < SortArr.length; j++) {
                if (SortArr[j]>max){
                    poz = j;
                    max = SortArr[j];
                }
            }
            SortArr[poz]= SortArr[i];
            SortArr[i]= max;
        }
    }
}
