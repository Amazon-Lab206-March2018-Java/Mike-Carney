class StringManipulator {
    public String trimAndConcat(String A, String B){
        StringManipulator manipulator = new StringManipulator();
        String STR  = A.trim() + B.trim();
        return STR;
    }

    public Integer getIndexOrNull(String A, char B){
        StringManipulator manipulator = new StringManipulator();
            if(A.indexOf(B) > 0){
                return A.indexOf(B);
            }
            else {
               return null; 
            }
    }

    public Integer getIndexOrNull(String A, String B){
        StringManipulator manipulator = new StringManipulator();
            if (A.indexOf(B) > 0){
                return A.indexOf(B);
            }
            else {
                return null;
            }
    }

    public String concatSubstring(String A, int X, int Y, String B){
        StringManipulator manipulator = new StringManipulator();
            String str = A.substring(X,Y).concat(B);{
            }
            return str;
    }
}