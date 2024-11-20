package additionalTask;

public class AdditionalApp {

    public static void main(String[] args) {

        SpeedTest.findIndex(Lists.ARRAY_LIST, Lists.MIDDLE_ELEMENT);
        SpeedTest.findIndex(Lists.LINK_LIST, Lists.MIDDLE_ELEMENT);

        System.out.println();

        SpeedTest.findAdd(Lists.ARRAY_LIST, Lists.MIDDLE_ELEMENT);
        SpeedTest.findAdd(Lists.LINK_LIST, Lists.MIDDLE_ELEMENT);
    }
}
