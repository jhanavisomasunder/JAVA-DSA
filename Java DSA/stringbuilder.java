// updating,insert,delet,append--all the operation is happening in the same obj using string builder


public class stringbuilder{
    public static void main(String[] args) {
        System.out.println("hello");
        StringBuilder s =new StringBuilder("Jhanavi");
        System.out.println(s);
        //char
        System.out.println(s.charAt(2));
        s.setCharAt(1, 'a');
        System.out.println(s);
        //insert//'' for only 1 letter char
        s.insert(1,'s');
        System.out.println(s);
        //delete
        s.delete(1,3);//1 included 3 not included so 3 rd pos will print
        System.out.println(s);
        s.append(" good" );
        System.out.println(s);
    }
}


