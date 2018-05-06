package swortoffercode;

/**
 * 二叉树组中的查找
 * @title  在一个二维数组中，每一行都按照从左到右递增的顺序排序
 *          每一列都按照从上到下递增的顺序排序。请完成一个函数，
 *          输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author rainyday
 * @createTime 2018/5/6.
 */
public class BinaryTree {

    /**
     *
     把每一行看成有序递增的数组，
     利用二分查找，
     通过遍历每一行得到答案，
     时间复杂度是nlogn
     */
        public boolean Find(int target,int [][] array) {

            if (array[0].length <=0 || target > array[array.length-1][array[0].length-1] || target < array[0][0] ){
                return false;
            }

            for(int i=0;i<array.length;i++){
                int low=0;
                int high=array[i].length-1;
                while(low<=high){
                    int mid=(low+high)/2;
                    if(target>array[i][mid]) {
                        low=mid+1;
                    }
                    else if(target<array[i][mid]) {
                        high=mid-1;
                    }
                    else {
                        return true;
                    }
                }
            }
            return false;
        }
}
