package leetcode._1089_duplicate_zeros;

/**
 * @author luyao
 * @description 复写零
 * @date 2022/6/17 14:10
 */

/*
 * 给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
 *
 * 注意：请不要在超过该数组长度的位置写入元素。
 *
 * 要求：请对输入的数组 **就地** 进行上述修改，不要从函数返回任何东西。
 *
 * 输入：[1,0,2,3,0,4,5,0]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
 */
public class DuplicateZeros {

    /*
     * 暴力解法，遍历数组，碰到 0 就把后面的元素都往后移动
     */
    public void solution(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                if (arr.length - 1 - i >= 0) System.arraycopy(arr, i, arr, i + 1, arr.length - 1 - i);
                arr[i + 1] = 0;
                i++;
            }
        }
    }

    public void solution2(int[] arr) {
        int i;
        int count = 0;
        int arrSize = arr.length;
        // 先找到添加 0 之后数组的结尾元素 arr[i]
        for (i = 0; i < arrSize; i++) {
            count++;
            if (arr[i] == 0) count++;
            if (count >= arrSize) break;
        }

        for (int j = arrSize - 1; j >= 0; j--) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
            } else if (arr[i] == 0 && count > arrSize && j == arrSize - 1) {
                // 最后一个数字是 0，且再添加一个 0 会超出数组长度的情况
                arr[j] = 0;
            } else {
                arr[j] = 0;
                arr[j - 1] = 0;
                j--;
            }
            i--;
        }
    }

}
