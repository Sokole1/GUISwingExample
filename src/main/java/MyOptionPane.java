import javax.swing.*;

public class MyOptionPane {

    MyOptionPane() {

        // JOptionPane = pop up a standard dialog box that prompts users for a value
        //               or informs them of something.


        JOptionPane.showMessageDialog(null, "This is some useless info",
                "title here", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "More some useless info",
                "title here", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Question?",
                "title here", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your computer has a virus!",
                "title here", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "ERROR!",
                "title here", JOptionPane.ERROR_MESSAGE);

        int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?",
                "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(answer);
        String name = JOptionPane.showInputDialog("What is your name?: ");

        String[] responses = {"No you", "Thanks!", "teehee", "hahah"};
        JOptionPane.showOptionDialog(null, "You are awesome!", "Secret message",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
    }
}
