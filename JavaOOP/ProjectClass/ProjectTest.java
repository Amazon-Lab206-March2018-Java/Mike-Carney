public class ProjectTest{
    public static void test(String[] args){
        ProjectTest create =  new ProjectTest("Create");
        System.out.println(create.elevatorPitch());
        System.out.println(create.getDesc());
        System.out.println(create.getName());
        create.setDesc("This is a test");
    }
}