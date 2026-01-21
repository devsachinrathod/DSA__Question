
class array{
  int val;

 array(int val){
   this.val = val;
  }
  int insert(int val){
    this.val = val;
    return this.val;
  }
int getVal(){
   return val;
}


  public static void main(String args[]){
    array obj = new array();
    obj.insert(10);
    obj.insert(15);
    System.out.println("Value: " + obj.getVal());
    int[] arr = {obj.getVal()};
    System.out.println("First element: " + arr[0]);
  }
}