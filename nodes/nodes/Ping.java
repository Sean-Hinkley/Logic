package nodes;

import java.util.ArrayList;

public class Ping {
    private boolean state;//state of object (on or off)
    ArrayList<Ping> sendTo;
    String s;

    public Ping(String str) {
        state = false;
        sendTo = new ArrayList<Ping>();
        s = str;
    }

    public void addSend(Ping add) {
        sendTo.add(add);
    }

    public Ping removeSend(int ind) {
        Ping tmp = sendTo.remove(ind);
        return tmp;
    }

    public void recieve(boolean s) {
        state = s;
    }

    public boolean send() {
        return state;
    }

    public boolean ping(boolean s) {
        recieve(s);
        for(int x = 0; x < sendTo.size(); x++) {
            sendTo.get(x).ping(s);
        }
        return send();
    }

    public String toString() {
        String str = new String();
        str += "\n"+ "Name: " + s + " State: " + state;
        for(int x = 0; x < sendTo.size(); x++) {
            
            str += "  " + sendTo.get(x).toString() ;
            
        }
        return str;
    }



    

    
    


}
