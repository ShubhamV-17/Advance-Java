interface chessplayer {
    void moves();
}

class queen implements chessplayer {
    public void moves() {
        System.out.println("up , down , right , left , digonally");
    }
}

class rook implements chessplayer {
    public void moves() {
        System.out.println("up , down , right , left");
    }
}

class king implements chessplayer {
    public void moves() {
        System.out.println("up , down , right , left");
    }
}

public class interfaceskiclass {
    public static void main(String[] args) {
        queen q = new queen();
        q.moves();
    }
}