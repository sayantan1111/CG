import java.util.Scanner;

public class Program9 {
    public static String generateComputer(){
        String[] choices={"Rock","Paper","Scissor"};
        int index = (int)(Math.random()*3);
        return choices[index];
    }
    public static String determineWinner(String user,String computer){
        if(user.equals(computer)) return "Draw";
        else if((user.equals("Rock")&&computer.equals("Scissor")) ||
            (user.equals("Paper")&&computer.equals("Rock")) ||
            (user.equals("Scissor")&&computer.equals("Paper"))) return "User";
        else return "Computer";
    }
    public static String[][] findAvgAndPercentage(int userwins,int computerwins,int totalgames){
        String[][] statistics=new String[4][2];
        statistics[0][0]="User Wins";
        statistics[0][1]=String.valueOf(userwins);
        statistics[1][0]="Computer Wins";
        statistics[1][1]=String.valueOf(computerwins);
        statistics[2][0]="Average";
        statistics[2][1]=String.format("User:%.2f, Computer:%.2f",(double)userwins/totalgames,(double)computerwins/totalgames);
        statistics[3][0]="percentage";
        statistics[3][1]=String.format("User:%.2f%%, Computer:%.2f%%",userwins*100.0/totalgames,computerwins*100.0/totalgames);
        return statistics;
    }
    public static void printResult(String[][] result){
        System.out.println("\nGame Results:");
        System.out.println("_________________________________________");
        for(String[] entry:result){
            System.out.println(entry[0]+" : "+entry[1]);
        }
        System.out.println("_________________________________________");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total games");
        int total=sc.nextInt();
        sc.nextLine();
        int usercount=0,computercount=0;
        for(int i=0;i<total;i++){
            System.out.println("Enter Rock/Paper/Scissor");
            String userchoice=sc.nextLine();
            String computerchoice=generateComputer();
            String winner=determineWinner(userchoice, computerchoice);
            if(winner.equals("User")) usercount++;
            else if(winner.equals("Computer")) computercount++;
            System.out.println("Winner is "+(winner.equals("Draw")?"Draw Match":winner));
            System.out.println("________________________________________");
        }
        String[][] statistics=findAvgAndPercentage(usercount, computercount, total);
        printResult(statistics);
        
    }
}
