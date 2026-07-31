class Solution {
    public List<List<Integer>> subsets(int[] num) {
        List<List<Integer>> a =new ArrayList<>();
        a.add(new ArrayList<>());
        for(int c: num){
            int d=a.size();
            for(int i=0;i<d;i++){
                List<Integer> z= new ArrayList<>(a.get(i));
                z.add(c);
                a.add(z);
            }
        }
        return a;
    }
}