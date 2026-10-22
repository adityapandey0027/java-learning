class LockParity {
    public static void main(String [] args){

        int [] arr = {41,54, 15,4, 54, 4};
        int min_cost = Integer.MAX_VALUE;
        for(int i = arr.length -1; i > 0; i--){

            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]) continue;
                int cost = Math.abs(arr[i] - arr[j]);
                if(cost % 2 == 0){
                    min_cost = Math.min(min_cost, cost);
                }
            }
        }
        System.out.println(min_cost);
    }
}