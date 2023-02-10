import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Кликер");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int width = 500, height = 500;
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height);
        JPanel panel = new JPanel ();
        JLabel label = new JLabel("0", SwingConstants.CENTER); // Надпись
        JButton button = new JButton("Нажми меня"); // Кнопка
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(String.valueOf(Integer.valueOf(label.getText())+1)); // Прибавляем + 1 к надписи на кнопке
            }
        });
        frame.add(panel);
        panel.setLayout(new BorderLayout()); // Устанавливаем разметку для панели, чтобы надпись поместилась в центр
        panel.add(label,BorderLayout.CENTER); // Добавляем надпись (по центру)
        panel.add(button,BorderLayout.SOUTH); // Добавляем кнопку (вниз)
        frame.setVisible(true);
    }
}