class Solution {
    public int[] singleNumber(int[] nums) {
                Map<Integer,Integer>map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int arr[]=new int[2];
        int i=0;
        for(int b:nums){
            if(map.get(b)==1) arr[i++]=b;
        }
return arr;
    }
}