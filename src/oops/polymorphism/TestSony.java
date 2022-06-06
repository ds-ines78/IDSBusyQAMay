package oops.polymorphism;

public class TestSony {

    public static void main(String[] args) {
        String clientReq = "sony";
        Sony s;

        /*if (clientReq.equals("sony")) {
            Sony s = new Sony();
            s.program();
            s.volume();
        } else if (clientReq.equals("sonypro")) {
            SonyPro sp = new SonyPro();
            sp.program();
            sp.volume();
        } else {
            SonyMax sm = new SonyMax();
            sm.program();
            sm.volume();
        }*/

        if(clientReq.equals("sony")) {
            s = new Sony();
        } else if(clientReq.equals("sonypro")) {
            s = new SonyPro();
        } else {
            s = new SonyMax();
        }

        s.volume();
        s.program();
    }
}
