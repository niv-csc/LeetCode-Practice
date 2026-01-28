class Q1_Build_an_Array_With_Stack_Operations{
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int pointer = 0; 
        for (int num = 1; num <= n && pointer < target.length; num++) {
            operations.add("Push"); 
            if (num == target[pointer]) {
                pointer++;
            }else{
                operations.add("Pop");
            }
        }
        return operations;
    }


        
}