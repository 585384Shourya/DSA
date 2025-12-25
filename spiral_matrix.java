import java.util.ArrayList;
class Solution {

    static List<Integer> pspiral(int[][] matrix,int row,int col,List<Integer> l,int count){

        for(int i=row;i<=col;i++){
            l.add(matrix[row][i]);
            count++;
            if(count==(matrix.length*matrix[0].length)){
                return l;
            }
        }

        for(int i=row+1;i<=(matrix.length-1)-row;i++){
            l.add(matrix[i][col]);
            count++;
            if(count==(matrix.length*matrix[0].length)){
                return l;
            }            
        }

        for(int i=col-1;i>=row;i--){
            l.add(matrix[matrix.length-1-row][i]);
            count++;
            if(count==(matrix.length*matrix[0].length)){
                return l;
            }            
        }

        for(int i=(matrix.length-1)-row-1;i>=row+1;i--){
            l.add(matrix[i][row]);
            count++;
            if(count==(matrix.length*matrix[0].length)){
                return l;
            }            
        }

         pspiral(matrix,row+1,col-1,l,count);
         return l;
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        int count=0;
        return pspiral(matrix,0,matrix[0].length-1,l,count);
    }
}
