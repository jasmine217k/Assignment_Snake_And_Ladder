
public class SnakeAndLadder {
    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder game");

        //Player 1 starts from zero
        int playerOnePosition=0;


        //Number of times dice is rolled for Player1
        int numberOfRoll1=0;

        while(playerOnePosition !=100) {

            //diceRoll between 1 and 6
            int diceRoll=(int)(Math.random()*10)%6 +1;

            numberOfRoll1++;

            //Get options between noPlay, Snake and Ladder
            int option = (int) (Math.random() * 10) % 3;


             if(option==1) //Snake
            {
                playerOnePosition-=diceRoll;
                if(playerOnePosition <0)
                    playerOnePosition=0;
            }
            else if(option==2){
                playerOnePosition+=diceRoll;
                if(playerOnePosition >100)
                    playerOnePosition-=diceRoll;
            }

            //Printing position after every dice roll
            System.out.println("The position of dice after roll No. "+numberOfRoll1+" is "+playerOnePosition);


        }

        //Total number of times the dice is rolled
        System.out.println("Total number of times the dice is rolled by Player1 is : "+numberOfRoll1);


        /********************* -- TWO -- PLAYER -- GAME -- *********************/

        System.out.println("THE TWO PLAYER GAME STARTED");
        //Number of dice roll by Player2
        int numberOfRoll2=0;

        //Player 2 starts from position 0
        int playerTwoPosition=0;

        //Player 1 starts the game and plays the first move
        int chance=1;

        playerOnePosition=0;
         numberOfRoll1=0;

        while(playerOnePosition !=100 && playerTwoPosition!=100)
        {

            //diceRoll between 1 and 6
            int diceRoll=(int)(Math.random()*10)%6 +1;

            if(chance==1)
                numberOfRoll1++;
            else
                numberOfRoll2++;

            //Get options between noPlay, Snake and Ladder
            int option = (int) (Math.random() * 10) % 3;


            if(option==0) //No Play
            {
                if(chance==1)
                    chance=2;
                else
                    chance=1;

            }
            else if(option==1) //Snake
            {
                if(chance==1) {
                    playerOnePosition -= diceRoll;
                    if (playerOnePosition < 0)
                        playerOnePosition = 0;

                    chance=2;
                }
                else
                {
                    playerTwoPosition -= diceRoll;
                    if (playerTwoPosition < 0)
                        playerTwoPosition = 0;

                    chance=1;

                }
            }
            else {
                if(chance==1) {
                    playerOnePosition += diceRoll;
                    if (playerOnePosition > 100)
                        playerOnePosition -= diceRoll;
                }

                else
                {
                    playerTwoPosition += diceRoll;
                    if (playerTwoPosition >100)
                        playerTwoPosition -=diceRoll;
                }
            }
      

        }

        if(playerOnePosition==100)
            System.out.println("The winner is Player 1 with "+numberOfRoll1+" moves");
        else
            System.out.println("The winner is Player 2 with "+numberOfRoll2+" moves");
    }
    }
