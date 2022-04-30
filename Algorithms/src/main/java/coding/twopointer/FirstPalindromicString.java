package coding.twopointer;

public class FirstPalindromicString {

    public static void main(String[] args) {
        String [] words = new String[]{"abd", "car", "adm", "racecarp", "aaa"};

        String outString = "";
        for(int i = 0; i < words.length; i++){
            if(isPandindromeString(words[i])){
                outString = words[i];
                break;
            }
        }

        System.out.println(outString);
    }

    public static boolean isPandindromeString(String s){
        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length -1;
        while(i < j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
