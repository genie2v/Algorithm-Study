class Solution {
    public String solution(String new_id) {
        String answer = "";
        // 1단계
        new_id = new_id.toLowerCase();
        // 2단계
        new_id = new_id.replaceAll("[^a-z0-9-_.]","");
        // 3단계
        new_id = new_id.replaceAll("\\.{2,}",".");
        // 4단계
        new_id = new_id.replaceAll("^\\.","");
        new_id = new_id.replaceAll("\\.$","");
        // 5단계
        if(new_id.length()==0) new_id = "a";
        // 6단계
        if(new_id.length()>=16){
            new_id = new_id.substring(0,15);
            new_id = new_id.replaceAll("\\.$","");
        }
        // 7단계
        if(new_id.length()<=2) {
            int len = new_id.length();
            String lastChar = new_id.substring(new_id.length()-1);
            for(int i=0;i<3-len;i++) {
                new_id += lastChar;
            }
        }

        answer = new_id;
        return answer;
    }
}