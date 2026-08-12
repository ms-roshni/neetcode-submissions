class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> list = new ArrayList<>();

        while(i<str.length()){
            int j = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i,j));
            String s = str.substring(j+1, j+1+length);
            list.add(s);
            i = j+length+1;
        }
        return list;
    }
}
