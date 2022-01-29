
public class parse {

    public int toInt(String s) throws NumberFormatException {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (((int)s.charAt(i)>=48) && ((int)s.charAt(i)<=57)) {
                
                num = num*10+ ((int)s.charAt(i)-48);
            } else {
                throw new NumberFormatException();
                
            }
        }
        
        return num;

    }

    public static void main(String[] args) {
        
    }
    
}
