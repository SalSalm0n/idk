import java.util.Scanner;
public class Escape
{
    public static void main(String[] args) {
        boolean isDoorOpen = false;
        boolean DoorKey = false;
        boolean DrawerKey = false;
        boolean GotThat2 = false;
        boolean GotThat3 = false;
        boolean GotThat4 = false;
        boolean GotThat5 = false;
        boolean GotThat6 = false;
        int VentOpen = 0;

        int artef = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("You seem to forget your name. What should it be?");
        String name = in.nextLine();
        while (!isDoorOpen){
            System.out.print("You're looking around. What can you do?\n ");
            System.out.print("1. Try to open the door \n 2. Look under the bed \n 3.Open the drawer in the corner of the room \n 4. Open the vent \n 5. Look at the nightstand \n 6. look at the statue next to the door \n");
            char op = in.next().charAt(0);
            switch (op){
                case '1':
                {
                    if (!DoorKey){
                        System.out.print("The door is closed. You need to find a key \n");
                    }
                    else {
                        System.out.print("You ran away. Get back to work!!!!! \n");
                        isDoorOpen=true;
                    }
                }
                break;
                case '2':
                {
                    if (!GotThat2){
                        artef +=1;
                        System.out.print(name + ", You found an artifact. You have "+ artef + " artifact(s) \n");
                        GotThat2=true;
                    }
                    else
                        System.out.print ("There's only dead rat under the bed \n");
                }
                break;
                case '3':{
                    if (!DrawerKey){
                        System.out.print("The drawer is closed. You need a key. \n");
                    }
                    else if (DrawerKey & !GotThat3){
                        System.out.print("You open the drawer. "+ name + ", you found the key! \n");
                        DoorKey=true;
                        GotThat3= true;
                    }
                }
                break;
                case '4':
                { if(!GotThat4 & VentOpen<2 ){
                    System.out.print("The vent is stuck. Maybe try again?\n");
                    VentOpen+=1;
                }
                else if (!GotThat4){
                    artef +=1;
                    System.out.print("You broke the ventilation grille. "+ name +", You found an artifact. You have "+ artef + " artifact(s) \n");
                    GotThat4 = true;
                }
                else
                    System.out.print("Only dust here. Nothing else. \n");
                }
                break;
                case '5':
                    if (!GotThat5){
                        artef +=1;
                        System.out.print(name + ",You found an artifact. You have " + artef + " artifact(s) \n");
                        GotThat5=true;
                    }
                    else
                        System.out.print ("There is only an old photograph in the nightstand. You can't recognize anyone there. \n");
                    break;
                case '6':
                {
                    if (!GotThat6){
                        if(artef==3){
                            DrawerKey=true;
                            System.out.print("You activate the statue. "+name+ ", you found thr drawer key! \n");
                            GotThat6 = true;
                        }
                        else
                            System.out.print("You can't activate the statue yet. \n");
                    }
                    else
                        System.out.print("Old statue. It stares back at you. \n");
                }
                break;
                default:
                    System.out.print("You can't do that... \n");
                    break;
            }
        }



    }
}