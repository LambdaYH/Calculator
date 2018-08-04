import javax.swing.*;

public class Rua {
    static double[] num={0,0};
    static double result_temp; //更高精度可以考虑BigDecimal
    public static void main(String[] args) {
        JFrame frame = new JFrame("计算器");
        frame.setContentPane(new UI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,400);
        frame.setVisible(true);
    }

}
