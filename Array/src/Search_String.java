public class Search_String {
    public static void main(String[] args) {
    String name="kunal";
    char target='b';

    boolean result=string_search(name,target);
        System.out.println(result);

    }
    static boolean string_search(String str,char target){
        if(str.length()==0){
            return false;
        }
        else{
            for(int i=0;i<str.length();i++){
                if(target==str.charAt(i)){
                    return true;
                }
            }
            return false;
        }
    }
}
