package com.bl;

public class BinarySearch {
    public static int binarySearch(String arr[], String x) {
        int first = 0, last = arr.length - 1;

        while (first <= last) {
            int mid = first + (last - 1) / 2;
            int res = x.compareTo(arr[mid]);
            if (res == 0)
                return mid;
            if (res > 0) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }

        }

        return -1;
    }
}