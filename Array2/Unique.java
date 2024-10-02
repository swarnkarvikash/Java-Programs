public class Unique {

    public class ReturnUnique(arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
