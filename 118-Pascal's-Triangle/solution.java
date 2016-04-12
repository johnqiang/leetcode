public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(numRows == 0)
			return result;
        ArrayList<Integer> row = new ArrayList<Integer>();
        row.add(0, 1);
        result.add(row);
        for(int i = 1; i < numRows; i++) {
        	ArrayList<Integer> temp = new ArrayList<Integer>();
        	temp.add(0, 1);
            for(int j = 1; j < i; j++) {
                List<Integer> preRow = result.get(i-1);
                temp.add(preRow.get(j-1) + preRow.get(j));
            }
            temp.add(i, 1);
            result.add(temp);
        }
        return result;
    }
}