public class User {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.isOn);
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume : " + smartTv.volume);
        smartTv.turnOn();

        System.out.println("TV Ligada ? " + smartTv.isOn);
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume : " + smartTv.volume);
    }
}
