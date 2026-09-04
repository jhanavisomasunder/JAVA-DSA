/*public class string {
    public static void main(String[] args) {
       // String name=new String("Jhanavi");
        //System.out.println();
        String name="jhanavi";
        String name2="jhanavi";
        System.out.println(name);// same obj only both variables r present so acessing both var will give the same obj
        System.out.println(name2);
         name=name.concat("somasunder");// we have to give name= to tell which var. it should be updated so it will update name not name2
        System.out.println(name);
        System.out.println(name2);// will be jhanavi will not be updated
    }
    
}*/
/*public class string {
    public static void main(String[] args) {
        String name="jhanavi";
        String name2="jhanavi";
        if(name==name2)
         {
            System.out.println("true");
         }
         else{
            System.out.println("false");
         }
        System.out.println(name);
         name=name.concat("somasunder");
         if(name==name2)
         {
            System.out.println("true");
         }
         else{
            System.out.println("false");
         }
        }
    }

// answer willl be false as we have concat the name so name will be now jhanavisomasunder wheras name 2 will be jhanavi*/
public class string {
    public static void main(String[] args) {
        String name=new String("Jhanavi");
        String name2=new String("Jhanavi");
        System.out.println();
        System.out.println(name);
        System.out.println(name2);
        if(name==name2)// the ans will be false as it is not referenig the same object
         {
            System.out.println("true");
         }
         else{
            System.out.println("false");
         }
         name=name.concat("somasunder");
        System.out.println(name);
        if(name==name2)
         {// the ans will be false as it is not referenig the same object and concatinated also
            System.out.println("true");
         }
         else{
            System.out.println("false");
         }
        }
    }