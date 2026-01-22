class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for( int num:nums){
            list.add(num);
        } var count =0;
          
           while(list.size()>1){
             var min=Integer.MAX_VALUE;
           var target=-1;
           var isAscending=true;
              for(int i=0;i<list.size()-1;i++){
                var sum=list.get(i)+list.get(i+1);
              
                if(list.get(i)>list.get(i+1)){
                    isAscending=false;
                    
                }
                if(sum<min){
                    min=sum;
                    target=i;
                }
              }
               if (isAscending) {
                break;
            }

                count++;
                list.set(target,min);
                list.remove(target+1);
            
           }
           return count;

            
    }
}
       