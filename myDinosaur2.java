/************************
A program of Jurassic Park
*************************/
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

class myDinosaur2 {
    public static void main(String[] a) throws IOException {
        myDinosaur2();
        return;
    }

    // Asks for an input from the user in string
    public static String inputString(String message) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        System.out.println(message);
        answer = scanner.nextLine();
        return answer;
    }

    // Asks for an input from the user in Integer
    public static int inputInt(String message) {
        String answer = inputString(message);
        return Integer.parseInt(answer);
    }

    // Greets the user
    public static void Greetings() {
        System.out.println("Hi! Welcome to Jurassic World Program.");
        String name = inputString("First of all, what should I call you?");
        String mood = inputString("How are you feeling today?");
        System.out.println("");
        System.out.println("Nice to meet you " + name + ".");
        System.out.println("This will be a program to look after your own dinosaur!");
        System.out.println("Now, let us get started!");
        return;
    }

    // Creates My Dinosaur
    public static String DinosaurCreate() {
        System.out.println("Now let us start by making our own dinosaur! So you better imagine what kind of dinosaur you have in mind.");
        System.out.println("");
        String dinosaur_name = inputString("What would you like to name your own dinosaur?");
        System.out.println("");
        System.out.println("Cool now your dinosaur is named " + dinosaur_name + ".");
        return dinosaur_name;
    }

    // Inputs Anger Scale
    public static int inputAnger() {
        Scanner scanner = new Scanner(System.in);
        int angry;
        System.out.println("Now for the next step your dinosaur will be registered with an ANGER ability.");
        System.out.println("The ANGER ability ranges from a scale of 1-5.");
        angry = scanner.nextInt();
        return angry;
    }

    // Gives a statement if the anger score is in values
    public static void IfAngerScore(int dinosaur_angry) {
        if (dinosaur_angry == 1) {
            System.out.println("Weak");
            System.out.println("");
        } else if (dinosaur_angry == 2) {
            System.out.println("Semi Weak");
            System.out.println("");
        } else if (dinosaur_angry == 3) {
            System.out.println("Medium");
            System.out.println("");
        } else if (dinosaur_angry == 4) {
            System.out.println("Strong");
            System.out.println("");
        } else if (dinosaur_angry == 5) {
            System.out.println("Super Strong");
            System.out.println("");
        } else {
            dinosaur_angry = 0;
            System.out.println("Please input a number from scale from 1 to 5.");
        }
        return;
    }

    // Inputs Hunger Scale
    public static int inputHunger() {
        Scanner scanner = new Scanner(System.in);
        int hungry;
        System.out.println("Now once your dinosaur is set for its anger, now it is time to set its HUNGER.");
        System.out.println("The HUNGER scale is also set from 1-5");
        hungry = scanner.nextInt();
        return hungry;
    }

    // Gives statements based on hunger score
    public static void IfHungerScore(int dinosaur_hunger) {
        if (dinosaur_hunger == 1) {
            System.out.println("Weak");
            System.out.println("");
        } else if (dinosaur_hunger == 2) {
            System.out.println(" Semi Weak");
            System.out.println("");
        } else if (dinosaur_hunger == 3) {
            System.out.println("Medium");
            System.out.println("");
        } else if (dinosaur_hunger == 4) {
            System.out.println("Strong");
            System.out.println("");
        } else if (dinosaur_hunger == 5) {
            System.out.println("Super Strong");
            System.out.println("");
        } else {
            dinosaur_hunger = 0;
            System.out.println("Please input a number from scale from 1 to 5.");
        }
        return;
    }

        // Follows the range if now the loop is true
        public static boolean FollowRange(int key) {
            if (key >= 6)
                return true;
            else
                return false;
        }
    
        // Computes Danger Scale = Hunger Scale + Anger Scale
        public static void Danger() {
            int anger_score = 6;
            int hunger_score = 6;
    
            // Anger Scale
            while (FollowRange(anger_score)) {
                anger_score = inputAnger();
                IfAngerScore(anger_score);
            }
    
            // Hunger Scale
            while (FollowRange(hunger_score)) {
                hunger_score = inputHunger();
                IfHungerScore(hunger_score);
            }
    
            // Danger Score
            int danger_score;
            danger_score = anger_score + hunger_score;
            System.out.println("Your dinosaur has a danger score of " + danger_score + ".");
            dangerscore(danger_score);
            return;
        }
    
        // Tells the TYPE of my dinosaur
        public static void dangerscore(int danger_score) {
            boolean found = true;
            if ((danger_score == 0) || (danger_score <= 3)) {
                System.out.println("Your dinosaur is CALM");
                System.out.println("");
            } else if ((danger_score == 4) || (danger_score == 5) || (danger_score == 6)) {
                System.out.println("Your dinosaur is MIFFED");
                System.out.println("");
            } else if ((danger_score == 7) || (danger_score == 8) || (danger_score == 9)) {
                System.out.println("Your dinosaur is DANGEROUS");
                System.out.println("");
            } else if ((danger_score == 10)) {
                System.out.println("Your dinosaur is A KILLER");
                System.out.println("");
            } else {
                found = false;
            }
            return;
        }
    
        // Sets a random danger score to my dinosaur
        public static int random_hunger_score() {
            Random hunger = new Random();
            int hunger_score = hunger.nextInt(5) + 1;
            return hunger_score;
        }
    
        // Sets a random anger score
        public static int random_anger_score() {
            Random anger = new Random();
            int anger_score = anger.nextInt(5) + 1;
            return anger_score;
        }
    
        // Quits loop at a given key based on the answer
        public static boolean quitLoop(int key, String answer) {
            if (key == 10)
                return false;
            else if (answer.equals("Let it starve") || answer.equals("let it starve") || answer.equals("LET IT STARVE"))
                return false;
            else
                return true;
        }
    
        // Gives statements by if statements based on danger score
        public static void IfDangerScore(int random_danger_score, String answer, int hunger_score, int anger_score) {
            if (random_danger_score < 10) {
                System.out.println(" ");
                System.out.println("Since you " + answer);
                System.out.println("Your dinosaur is now equipped with HUNGER SCORE " + hunger_score + " and ANGER SCORE of " + anger_score);
                System.out.println("Your dinosaur is now with DANGER SCORE " + random_danger_score);
                dangerscore(random_danger_score);
            } else {
                System.out.println(" ");
                System.out.println("YOU LOST with your dinosaur has a DANGER SCORE of " + random_danger_score);
                dangerscore(random_danger_score);
            }
        }
    
        // Plays a series
        public static int loopDanger(String name) {
            int hunger_score = random_hunger_score();
            int anger_score = random_anger_score();
            int random_danger_score = hunger_score + anger_score;
            int rounds = 0;
            System.out.println("OH NO!!!");
            String answer = "FEED IT";
            while (quitLoop(random_danger_score, answer)) {
                System.out.println(" ");
                System.out.println("Your dinosaur has a new DANGER SCORE of " + random_danger_score + ".");
                System.out.println("Your dinosaur has changed its HUNGER SCORE to " + hunger_score + " and ANGER SCORE to " + anger_score + ".");
                System.out.println(" ");
                answer = inputString("What would you do? Would you FEED IT or PLAY WITH IT or LET IT STARVE?");
                hunger_score = random_hunger_score();
                anger_score = random_anger_score();
                random_danger_score = hunger_score + anger_score;
                rounds = rounds + 1;
            }
            IfDangerScore(random_danger_score, answer, hunger_score, anger_score);
            System.out.println("You went for " + rounds + " rounds");
            return random_danger_score;
        }
    
        // returns random number
        public static int RandomPick() {
            Random size = new Random();
            int n = size.nextInt(3);
            return n;
        }
    
        // creates name
        public static String[] createName(int size) {
            String[] s = new String[size];
            for (int i = 1; i < size; i++) {
                s[i] = inputString("What is the name of your new dinosaur?");
            }
            return s;
        }
    
        // creates hunger score
        public static int[] createHungerScore(int size, String[] a) {
            int[] s = new int[size];
            int hunger_score = 6;
            for (int i = 1; i < size; i++) {
                while (FollowRange(hunger_score)) {
                    hunger_score = inputInt("Input Hunger Score: " + getDinosaurName(a, i));
                    IfHungerScore(hunger_score);
                    s[i] = hunger_score;
                }
                hunger_score = 6;
            }
            return s;
        }
    
        // creates anger score
        public static int[] createAngerScore(int size, String[] a) {
            int[] s = new int[size];
            int anger_score = 6;
            for (int i = 1; i < size; i++) {
                while (FollowRange(anger_score)) {
                    anger_score = inputInt("Input Anger Score: " + getDinosaurName(a, i));
                    IfAngerScore(anger_score);
                    s[i] = anger_score;
                }
                anger_score = 6;
            }
            return s;
        }
    
        // creates danger score
        public static int[] createDangerScore(int size, int[] a, int[] b) {
            int[] s = new int[size];
            for (int i = 1; i < size; i++) {
                s[i] = a[i] + b[i];
            }
            return s;
        }
    
        // returns dinosaur name
        public static String getDinosaurName(String[] s, int key) {
            return s[key];
        }
    
        // returns hunger score
        public static int getDinosaurHungerScore(int[] s, int key) {
            return s[key];
        }
    
        // returns anger score
        public static int getDinosaurAngerScore(int[] s, int key) {
            return s[key];
        }
    
        // returns danger score
        public static int getDinosaurDangerScore(int[] s, int key) {
            return s[key];
        }
    

        // prints the whole array
        public static void printArray(String[] s, int[] a, int[] b, int[] c) {
            System.out.println(" ");
            System.out.println("Current Dinosaurs: ");
            for (int i = 0; i < s.length; i++) {
                System.out.println("Dinosaur Name: " + s[i] + " | " +
                        "Dinosaur Hunger Score: " + a[i] + " | " +
                        "Dinosaur Anger Score: " + b[i] + " | " +
                        "Dinosaur Danger Score: " + c[i]);
            }
        }

        // 5 rounds to change
        public static void rounds(String[] s, int[] a, int[] b, int[] c) {
            System.out.println("You have 5 rounds to look after your dinosaur. This will be chosen at random");
            int round = 1;
            int score = 0;
            int pick = RandomPick();
            int hunger_score = 6;
            int anger_score = 6;

            while (score != 5) {
                System.out.print(" ");
                System.out.print("Round: " + round);
                System.out.println(" Your " + getDinosaurName(s, pick) + " is chosen !");

                while (FollowRange(hunger_score)) {
                    hunger_score = inputInt("Input HUNGER SCORE:");
                    a[pick] = hunger_score;
                }

                while (FollowRange(anger_score)) {
                    anger_score = inputInt("Input ANGER SCORE:");
                    b[pick] = anger_score;
                }

                c[pick] = getDinosaurHungerScore(a, pick) + getDinosaurAngerScore(b, pick);
                printArray(s, a, b, c);
                pick = RandomPick();
                score = score + 1;
                round = round + 1;
                hunger_score = 6;
                anger_score = 6;
            }
            return;
        }

        // creates dinosaurs of the records
        public static Dinosaurs createDinosaurs(String dinosaur_name, int hunger_score, int anger_score, int danger_score, int ID) {
            Dinosaurs s = new Dinosaurs();
            s.dinosaur_name = dinosaur_name;
            s.hunger_score = hunger_score;
            s.anger_score = anger_score;
            s.danger_score = danger_score;
            s.ID = ID;
            return s;
        }

        // returns the record name of dinosaur
        public static String getDinosaurName(Dinosaurs s) {
            return s.dinosaur_name;
        }

        // returns hunger score of dinosaur
        public static int getDinosaurHungerScore(Dinosaurs s) {
            return s.hunger_score;
        }

        // returns hunger score of dinosaur from records
        public static int getDinosaurAngerScore(Dinosaurs s) {
            return s.anger_score;
        }

        // returns danger score of dinosaur from records
        public static int getDinosaurDangerScore(Dinosaurs s) {
            return s.danger_score;
        }

        // returns dinosaur arrays which is the record of dinosaur by position
        public static Dinosaurs[] getDinosaurs(JurassicPark d) {
            return d.dinosaurs;
        }

        // returns the free ID of dinosaur from Jurassic Park class
        public static int getFreeID(JurassicPark d) {
            return d.FreeID;
        }

        // increases the ID which determines the position of the Dinosaur
        public static void IncreaseFreeID(JurassicPark d) {
            d.FreeID = d.FreeID + 1;
        }

        // creates a class of JurassicPark in the Array of Dinosaurs
        public static JurassicPark createJurassicPark(int size) {
            JurassicPark d = new JurassicPark();
            Dinosaurs[] dinosaurs = new Dinosaurs[size];
            d.dinosaurs = dinosaurs;
            d.FreeID = 0;
            return d;
        }

        // adds entries into the class Jurassic PArk
        public static void addDinosaurToJurassicPark(JurassicPark d, String dinosaur_name, int hunger_score, int anger_score, int danger_score) {
            int ID = getFreeID(d);
            Dinosaurs s = createDinosaurs(dinosaur_name, hunger_score, anger_score, danger_score, ID);
            Dinosaurs[] dinosaurs = getDinosaurs(d);
            dinosaurs[ID] = s;
            IncreaseFreeID(d);
            return;
        }

        // gives a statement by if statement based on the answer
        public static void IfAnswer(int answer, Dinosaurs[] s) {
            final int size = 3;
            if (answer == 1) {
                System.out.println(" Choose your dinosaur: ");
                int danger_score = 0;
                for (int i = 0; i < size; i++) {
                    System.out.println(i + ") " + getDinosaurName(s[i]));
                    String input = inputString("Yes / No");
                    if (input.equals("yes") | input.equals("Yes")) {
                        danger_score = loopDanger(getDinosaurName(s[i]));
                    }
                }
            } else if (answer == 2) {
                System.out.println("Current Dinosaur: ");
                for (int i = 0; i < size; i++) {
                    System.out.println("Name: " + getDinosaurName(s[i]) + "|" +
                            "Hunger Score: " + getDinosaurHungerScore(s[i]) + "|" +
                            "Anger Score: " + getDinosaurAngerScore(s[i]) + "|" +
                            "Danger Score: " + getDinosaurDangerScore(s[i]) + "|" +
                            "ID: " + s[i].ID);
                }
            } else if (answer == 3) {
                System.out.println(" ");
                System.out.println("Name 1 - Hungerscore - AngerScore - DangerScore");
                System.out.println("Name 2 - Hungerscore - AngerScore - DangerScore");
                System.out.println("Name 3 - Hungerscore - AngerScore - DangerScore");
            }
            return;
        }

        // assigns the dinosaur in the array by the array number by the user
        public static Dinosaurs AssignDinosaur(int pick, Dinosaurs[] s) {
            return s[pick];
        }

        // Executes an option to set the rounds
        public static void DinosaurRounds(JurassicPark d, Dinosaurs[] s) {
            int round = 1;
            System.out.println(" ");
            System.out.println("Choose an option.");
            int end = 0;
            while (end != 3) {
                System.out.println("Rounds: " + round);
                end = inputInt("(1) Look after your dinosaur | (2) Print Dinosaurs | (3) Exit ");
                IfAnswer(end, s);
                round = round + 1;
            }
            System.out.println("Bye");
            return;
        }

        // Stores and creates dinosaurs from the user
        public static JurassicPark createDinosaurArrayV2(String name, int danger_score, int hunger_score, int anger_score) {
            final int size = 3;
            JurassicPark test = createJurassicPark(size);
            Dinosaurs[] two = getDinosaurs(test);
            String[] dinosaur_name = createName(size);
            int[] dinosaur_hs = createHungerScore(size, dinosaur_name);
            int[] dinosaur_as = createAngerScore(size, dinosaur_name);
            int[] dinosaur_ds = createDangerScore(size, dinosaur_hs, dinosaur_as);
            dinosaur_name[0] = name;
            dinosaur_ds[0] = danger_score;
            dinosaur_hs[0] = hunger_score;
            dinosaur_as[0] = anger_score;
            for (int i = 0; i < size; i++) {
                name = dinosaur_name[i];
                hunger_score = dinosaur_hs[i];
                anger_score = dinosaur_as[i];
                danger_score = dinosaur_ds[i];
                addDinosaurToJurassicPark(test, name, hunger_score, anger_score, danger_score);
            }
            printArray(dinosaur_name, dinosaur_hs, dinosaur_as, dinosaur_ds);
            rounds(dinosaur_name, dinosaur_hs, dinosaur_as, dinosaur_ds);
            return test;
        }

        public static void InputAndWriteDinosaurs() throws IOException {
            final int size = 3;
            String filename = "dinosaur.csv";
            PrintWriter dinosaurs_file = new PrintWriter(new FileWriter(filename));
            DinosaurSave[] s = new DinosaurSave[size];
            for (int i = 0; i < size; i++) {
                DinosaurSave save = new DinosaurSave();
                save.dinosaur_name = inputString("Dinosaur Name:");
                save.hunger_score = inputInt("Hunger score:");
                save.anger_score = inputInt("Anger score:");
                save.danger_score = save.hunger_score + save.anger_score;
                s[i] = save;
            }
            for (int j = 0; j < size; j++) {
                dinosaurs_file.println(s[j].dinosaur_name + "," +
                        s[j].hunger_score + "," +
                        s[j].anger_score + "," +
                        s[j].danger_score + ",");
            }
            System.out.println("All dinosaurs are saved in " + filename + ".");
            dinosaurs_file.close();
        }

        public static void ReadAndPrintDinosaurs() throws IOException {
            final int size = 3;
            String filename = "dinosaur.csv";
            BufferedReader dinosaurs_file = new BufferedReader(new FileReader(filename));
            DinosaurSave[] s = new DinosaurSave[size];
            for (int i = 0; i < size; i++) {
                DinosaurSave save = new DinosaurSave();
                String savedline = dinosaurs_file.readLine();
                String[] savedline_contents = savedline.split(",");
                save.dinosaur_name = savedline_contents[0];
                s[i] = save;
            }
            dinosaurs_file.close();
            for (int j = 0; j < size; j++) {
                System.out.println("Dinosaur Name: " + s[j].dinosaur_name);
            }
        }

        // Runs the whole program.
        public static void myDinosaur2() throws IOException {
            int hunger_score = 0;
            int anger_score = 0;
            Greetings();
            String name = DinosaurCreate();
            Danger();
            int danger_score = loopDanger(name);
            JurassicPark DinosaurDatabase = createDinosaurArrayV2(name, hunger_score, anger_score, danger_score);
            Dinosaurs[] two = getDinosaurs(DinosaurDatabase);
            DinosaurRounds(DinosaurDatabase, two);
            InputAndWriteDinosaurs();
            ReadAndPrintDinosaurs();
            return;
        }
    }
        
class Dinosaurs {
    String dinosaur_name;
    int hunger_score;
    int anger_score;
    int danger_score;
    int ID;
}
        
class JurassicPark {
    Dinosaurs[] dinosaurs;
    int FreeID;
}

class DinosaurSave {
    String dinosaur_name;
    int hunger_score;
    int anger_score;
    int danger_score;
    int ID;
}
