public class  Selection_sort {
    public int minimum(int[] arr , int step) {
        int minimun = arr[step];
        int index = step;

        for (int i = step; i < arr.length; i++) {
            if(minimun > arr[i]){
                minimun = arr[i];
                index = i;
            }
        }

        return index;
    }

    public int[] sort(int[] arr){
        int index = 0;

        for (int step = 0; step < arr.length; step++) {
            index = minimum(arr, step);

            int tmp = arr[step];
            arr[step] = arr[index];
            arr[index] = tmp;
        }

        return arr;
    }
}
