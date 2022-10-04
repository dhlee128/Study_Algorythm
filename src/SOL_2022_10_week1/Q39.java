package SOL_2022_10_week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//39. Combination Sum
public class Q39 {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);//정렬
        combinationSumCal(resList, new ArrayList<>(), 0, candidates, target);

        return resList;
    }
    //백트래킹
    public static void combinationSumCal(List<List<Integer>> resList, List<Integer> list, int idx, int[] candidates, int target) {

        if(target == 0) { //target 과 일치
            resList.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx; i<candidates.length; i++) {
            if(target < 0) return;// 조합이 target 보다 큼

            list.add(candidates[i]); //조합에 원소 추가
            combinationSumCal(resList, list, i, candidates, target-candidates[i]); //백트래킹
            list.remove(list.size()-1); //조합에서 원소 하나 빼기
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;

        System.out.println(combinationSum(candidates, target));
    }

}
