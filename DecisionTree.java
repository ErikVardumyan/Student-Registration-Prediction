// DECISION TREE  APPLICATION




import java.io.*;

class DecisionTreeApp {

    /* ------------------------------- */
    /*                                 */
    /*              FIELDS            yes */
    /*                                 */
    /* ------------------------------- */

    static BufferedReader keyboardInput = new
            BufferedReader(new InputStreamReader(System.in));
    static DecisionTree newTree;

    /* --------------------------------- */
    /*                                   */
    /*               METHODS             */
    /*                                   */
    /* --------------------------------- */

    /* MAIN */

    public static void main(String[] args) throws IOException {

        // Create instance of class DecisionTree

        newTree = new DecisionTree();

        // Generate tree

        generateTree();

        // Output tree

        System.out.println("\nOUTPUT DECISION TREE");
        System.out.println("====================");
        newTree.outputBinTree();

        // Query tree

        queryTree();
    }

    /* GENERATE TREE */

    static void generateTree() {
        System.out.println("\nGENERATE DECISION TREE");
        System.out.println("======================");
        newTree.createRoot(1,"Are you a Senior");

        newTree.addYesNode(1,2,"Are you in any special groups (Lab assistant, Veteran, Student Aid, etc.)?");
        newTree.addNoNode(1,3,"Are you a Junior");

        newTree.addYesNode(2,4,"Has your gpa for the past 2 semester's been higher 2.0?");
        newTree.addNoNode(2,5,"Has your gpa for the past 2 semester's been higher 2.0?");

        newTree.addYesNode(4, 8, "Your Predicted Registration date is 03/02/2021");
        newTree.addNoNode(4,9,"Your Predicted Registration date is 06/25/2021 - 06/30/2021");

        newTree.addYesNode(5,10,"Your Predicted Registration date is 06/14/2021 - 06/18/2021");
        newTree.addNoNode(5,11,"Your Predicted Registration date is 06/25/2021 - 06/30/2021");

        newTree.addYesNode(3,6,"Are you in any special groups (Lab assistant, Veteran, Student Aid, etc.)?");
        newTree.addNoNode(3,7,"Are you a sophomore?");

        newTree.addYesNode(6,12,"Has your gpa for the past 2 semester's been higher 2.0?");
        newTree.addNoNode(6,13,"Has your gpa for the past 2 semester's been higher 2.0?");

        newTree.addYesNode(12,16,"Your Predicted Registration date is 06/16/2021");
        newTree.addNoNode(12,17,"Your Predicted Registration date is 06/25/2021 - 06/30/2021");

        newTree.addYesNode(13,18,"Your Predicted Registration date is 06/20/2021 - 06/25/2021");
        newTree.addNoNode(13,19,"Your Predicted Registration date is 06/25/2021 - 06/30/2021");

        newTree.addYesNode(7,14,"Are you in any special groups (Lab assistant, Veteran, Student Aid, etc.)?");
        newTree.addNoNode(7,15,"You're a Freshman. Are you in any special groups (Lab assistant, Veteran, Student Aid, etc.)?");

        newTree.addYesNode(14,20,"Has your gpa for the past 2 semester's been higher 2.0?");
        newTree.addNoNode(14,21,"Has your gpa for the past 2 semester's been higher 2.0?");

        newTree.addYesNode(20,24,"Your Predicted Registration date is 04/05/2021");
        newTree.addNoNode(20,25,"Your Predicted Registration date is 06/25/2021 - 06/30/2021");

        newTree.addYesNode(21,26,"Your Predicted Registration date is 04/12/2021 - 04/17/2021");
        newTree.addNoNode(21,27,"Your Predicted Registration date is 06/25/2021 - 06/30/2021");

        newTree.addYesNode(15,22,"Has your gpa for the past 2 semester's been higher 2.0?");
        newTree.addNoNode(15,23, "Has your gpa for the past 2 semester's been higher 2.0?");

        newTree.addYesNode(22,28,"Your Predicted Registration date is 06/20/2021 - 06/25/2021");
        newTree.addNoNode(22,29,"Your Predicted Registration date is 06/25/2021 - 06/30/2021");

        newTree.addYesNode(23,30,"Your Predicted Registration date is 06/20/21 - 06/25/21");
        newTree.addNoNode(23,31, "Your Predicted Registration date is 06/25/2021 - 06/30/2021");
    }

    /* QUERY TREE */

    static void queryTree() throws IOException {
        System.out.println("\nQUERY DECISION TREE");
        System.out.println("===================");
        newTree.queryBinTree();

        // Option to exit

        optionToExit();
    }

    /* OPTION TO EXIT PROGRAM */

    static void optionToExit() throws IOException {
        System.out.println("Exit? (enter \"Yes\" or \"No\")");
        String answer = keyboardInput.readLine();
        if (answer.equals("Yes")) return;
        else {
            if (answer.equals("No")) queryTree();
            else {
                System.out.println("ERROR: Must answer \"Yes\" or \"No\"");
                optionToExit();
            }
        }
    }
}