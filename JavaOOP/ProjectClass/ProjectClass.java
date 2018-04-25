class Project{
    private String name;
    private String desc;
    
    public elevatorPitch(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    public Project(){
        this("John", "Tester");
    }
    public Project(String name){
        this.name= name;
    }
    public Project(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    public String getName(){
        return name;
    }
    public void createName(String name){
        this.name= name;
    }
    public String getDesc(){
        return description;
    }
    public void setDesc(String desc){
        this.desc= desc;
    }
}