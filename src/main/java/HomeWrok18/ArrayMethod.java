package HomeWrok18;

public class ArrayMethod {
    private int row;
    private int column;
    private int[][] sqArray;

    int[] array = {1,1,3,5,5};
    public void countArray(){
        for(int i = array.length - 1 ;i<array.length;i++){
            for(int j = 0;j<array.length - 1;j++) {
                array[i] += array[j]  ;

            }
            System.out.println(array[i]/array.length);
        }

    }
    public  void checkArray(int[][] sqArray) {
        this.sqArray = sqArray;
        this.row = this.sqArray.length;
        this.column = this.sqArray[0].length;
        if(this.row == this.column){
            System.out.println("ok");
        }else{
            System.out.println("no");
        }

    }


    public static void main(String[] args) {
        ArrayMethod arrayMethod = new ArrayMethod();
        int [][] x = new int[3][2];
        arrayMethod.countArray();
        arrayMethod.checkArray(x);


    }
}
