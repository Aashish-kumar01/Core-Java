package OOPS07.enumsExample;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants 
        // public, static and final
        // since its final you can't create child enums
        // type is Week

        @Override
        public void hello(){
            System.out.println("Hey how are you?");
        }

        Week(){
            System.out.println("Constructor called for " + this);
        }
        // this is not public or protected, only private or default
        // why? we don't want to create new objects
        // this is not the enum concepts, that's why

        // internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Tuesday")); // it will return the enum constant value
        // for(Week day: Week.values()){
        //     System.out.println(day);
        // }

        System.out.println(week.ordinal());
    }
}
