
public class SnakeAndLadder {
    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder game");

        //Player 1 starts from zero
        int playerOnePosition=0;


        //Number of times dice is rolled
        int numberOfRoll=0;

        while(playerOnePosition !=100) {

            //diceRoll between 1 and 6
            int diceRoll=(int)(Math.random()*10)%6 +1;

            numberOfRoll++;

            //Get options between noPlay, Snake and Ladder
            int option = (int) (Math.random() * 10) % 3;


            if(option==0) //No Play
                continue;
            else if(option==1) //Snake
            {
                playerOnePosition-=diceRoll;
                if(playerOnePosition <0)
                    playerOnePosition=0;
            }
            else {
                playerOnePosition+=diceRoll;
                if(playerOnePosition >100)
                    playerOnePosition-=diceRoll;
            }

            //Printing position after every dice roll
            System.out.println("The position of dice after roll No. "+numberOfRoll+" is "+playerOnePosition);


        }

        //Total number of times the dice is rolled
        System.out.println("Total number of times the dice is rolled is: "+numberOfRoll);
    }
    }
