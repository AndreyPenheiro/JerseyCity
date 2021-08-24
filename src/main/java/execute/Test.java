package execute;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static int findIndex(int arr[], int t)

    {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) {
                return i;
            }
            else { i = i + 1;
            }
        }
        return -1;
    }

    static boolean sumTarget(
            int A[],
            int arr_size, int sum){
        int l, r;
        Arrays.sort(A);
        l = 0;
        r = arr_size - 1;
        while (l < r) {
            if (A[l] + A[r] == sum)
                return true;
            else if (A[l] + A[r] < sum)
                l++;
            else
                r--;
        }
        return false;
    }

    public List<String> filterStrings(List<String> list){
        return list.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());

    }


    }

