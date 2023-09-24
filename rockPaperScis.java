import java.util.*;
public class rockPaperScis {
    int move;
    HashMap<Integer, String> hm=new HashMap<>();
        
    void pcTurn()
    {
        Random rdm=new Random();
        int pcMove=rdm.nextInt(1,4);
        System.out.println("-----Computer's Move-----\n"+pcMove+". "+hm.get(pcMove));

        if(move==pcMove)System.out.println("Tie !!!");

        else if((move==1 && pcMove==2) || (move==2 && pcMove==3)||(move==3 && pcMove==1))System.out.println("-----Computer wins !!!-----");

        else if((move==1 && pcMove==3)||(move==2 && pcMove==1)||(move==3 && pcMove==2))System.out.println("-----User wins !!!-----");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rockPaperScis rps=new rockPaperScis();
        rps.hm.put(1, "Rock");
        rps.hm.put(2, "Paper");
        rps.hm.put(3, "Scissor");
        
        char key;

        while(true)
        {
            System.out.println("-----Play your move-----\n1. Rock\n2. Paper\n3. Scissor");
            rps.move=sc.nextInt();
            rps.pcTurn();
            System.out.println("Press 'q' to exit. otherwise press 'e'");
            key=sc.next().charAt(0);
            if(key=='q')break;
            else continue;
        }
        sc.close();
    }
}
