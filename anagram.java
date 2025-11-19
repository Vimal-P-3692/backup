public class anagram {

    public static void main(String [] args)
    {

        String s1="listen";
        String s2="silent";
        boolean isAnagram = true;
 
        if(s1.length() != s2.length()) {
            isAnagram = false;
        } else {
            
            for(int i=0;i<s1.length();i++)
            {
                if(!(s2.contains(String.valueOf(s1.charAt(i))))) {
                    isAnagram = false;
                    break;
                }
            }
            
        }
        if(isAnagram) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }
    
}
