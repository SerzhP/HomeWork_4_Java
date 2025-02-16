public class Pony extends Horse{
    public String getPonyColor(){
        return "White";
    }
    @Override
    void bite() {
        System.out.println("yamm");
    }
}
