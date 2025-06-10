import java.util.ArrayList;
import java.util.List;

// Array Line Sweep

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < firstList.length; ++i) {
            while (secondList[k][1] < firstList[i][0]) {
                k++;
            }
            if (firstList[i][1] >= secondList[k][0]) {
                //getIntersect;
            }
        }

    }
}