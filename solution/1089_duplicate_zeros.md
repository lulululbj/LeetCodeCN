# 1089. 复写零

`Easy`

给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。

注意：请不要在超过该数组长度的位置写入元素。

要求：请对输入的数组 **就地** 进行上述修改，不要从函数返回任何东西。

示例 1：
```
输入：[1,0,2,3,0,4,5,0]
输出：null
解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
```
示例 2：
```
输入：[1,2,3]
输出：null
解释：调用函数后，输入的数组将被修改为：[1,2,3]
```

提示：

* 1 <= arr.length <= 10000
* 0 <= arr[i] <= 9

> 来源：力扣（LeetCode）
> 
> 链接：https://leetcode.cn/problems/duplicate-zeros
> 
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

## 题解

### 解法1

暴力循环。遍历数组，碰到 0 就把后面的元素都往后移动

```java
    public void solution(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                if (arr.length - 1 - i >= 0) System.arraycopy(arr, i, arr, i + 1, arr.length - 1 - i);
                arr[i + 1] = 0;
                i++;
            }
        }
    }
```

* 时间复杂度：O(n^2)
* 空间复杂度：O(1)

### 解法2

1. 遍历 arr，非零元素 count 加 1，为零 count + 2。当 count  >= arrSize 时，退出循环。
这时的 i 处对应的元素，就是复写 0 之后的数组最后的元素
2. 倒序遍历数组，将 i 处的元素写到元素末尾 j 处，如果 i 处元素为 0，需要写两个 0。每次循环将 i 和 j 往前推。
3. 注意 count > arrSize 时，末尾为 0 时，添加的 0 会超出数组长度范围。这是不需要复写 0 。

```java
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
```

* 时间复杂度：O(n)
* 空间复杂度：O(1)