package MySimpleGUI;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * MySimpleGUI
 */

class MySimpleGUI extends JFrame implements ActionListener {

    public MySimpleGUI() {
        initComponents();
    }

    double oper1, oper2, res;
    boolean calculado = false;

    JTextField campo = new JTextField("");

    JPanel panel = new JPanel();

    JButton mas = new JButton(" + ");
    JButton men = new JButton(" - ");
    JButton por = new JButton(" x ");
    JButton ent = new JButton(" / ");
    JButton pot = new JButton(" ^ ");
    JButton ac = new JButton("AC");
    JButton num7 = new JButton(" 7 ");
    JButton num8 = new JButton(" 8 ");
    JButton num9 = new JButton(" 9 ");
    JButton num4 = new JButton(" 4 ");
    JButton num5 = new JButton(" 5 ");
    JButton num6 = new JButton(" 6 ");
    JButton num1 = new JButton(" 1 ");
    JButton num2 = new JButton(" 2 ");
    JButton num3 = new JButton(" 3 ");
    JButton num0 = new JButton(" 0 ");
    JButton pun = new JButton(" . ");
    JButton igu = new JButton(" = ");

    private void initComponents() {
        campo.setEditable(false);
        setLocationRelativeTo(null);
        int w = 119, h = 45;

        panel.setLayout(null);
        setSize(392, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Calculadora");
        setVisible(true);
        setResizable(false);

        // Boton +
        mas.setBounds(10, 70, w, h);
        mas.addActionListener(this);
        // Boton -
        men.setBounds(129, 70, w, h);
        men.addActionListener(this);
        // Boton x
        por.setBounds(248, 70, w, h);
        por.addActionListener(this);
        // Boton /
        ent.setBounds(10, 115, w, h);
        ent.addActionListener(this);
        // Boton pot
        pot.setBounds(129, 115, w, h);
        pot.addActionListener(this);
        // Boton ac
        ac.setBounds(248, 115, w, h);
        ac.addActionListener(this);
        // Boton 7
        num7.setBounds(10, 160, w, h);
        num7.addActionListener(this);
        // Boton 8
        num8.setBounds(129, 160, w, h);
        num8.addActionListener(this);
        // Boton 9
        num9.setBounds(248, 160, w, h);
        num9.addActionListener(this);
        // Boton 4
        num4.setBounds(10, 205, w, h);
        num4.addActionListener(this);
        // Boton 5
        num5.setBounds(129, 205, w, h);
        num5.addActionListener(this);
        // Boton 6
        num6.setBounds(248, 205, w, h);
        num6.addActionListener(this);
        // Boton 1
        num1.setBounds(10, 250, w, h);
        num1.addActionListener(this);
        // Boton 2
        num2.setBounds(129, 250, w, h);
        num2.addActionListener(this);
        // Boton 3
        num3.setBounds(248, 250, w, h);
        num3.addActionListener(this);
        // Boton 0
        num0.setBounds(10, 295, w, h);
        num0.addActionListener(this);
        // Boton .
        pun.setBounds(129, 295, w, h);
        pun.addActionListener(this);
        // Boton =
        igu.setBounds(248, 295, w, h);
        igu.addActionListener(this);
        // Campo de texto
        campo.setBounds(10, 10, 358, 50);
        panel.add(campo);

        panel.add(mas);
        panel.add(men);
        panel.add(por);
        panel.add(ent);
        panel.add(pot);
        panel.add(ac);
        panel.add(num7);
        panel.add(num8);
        panel.add(num9);
        panel.add(num4);
        panel.add(num5);
        panel.add(num6);
        panel.add(num1);
        panel.add(num2);
        panel.add(num3);
        panel.add(num0);
        panel.add(pun);
        panel.add(igu);

        setContentPane(panel);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (calculado) {
            campo.setText("");
            calculado = false;
        }

        if (e.getSource() == num7) {
            if (campo.getText() == "")
                campo.setText("7");
            else
                campo.setText(campo.getText() + "7");
        }

        if (e.getSource() == num8)
            if (campo.getText() == "")
                campo.setText("8");
            else
                campo.setText(campo.getText() + "8");

        if (e.getSource() == num9)
            if (campo.getText() == "")
                campo.setText("9");
            else
                campo.setText(campo.getText() + "9");

        if (e.getSource() == num4)
            if (campo.getText() == "")
                campo.setText("4");
            else
                campo.setText(campo.getText() + "4");

        if (e.getSource() == num5)
            if (campo.getText() == "")
                campo.setText("5");
            else
                campo.setText(campo.getText() + "5");

        if (e.getSource() == num6)
            if (campo.getText() == "")
                campo.setText("6");
            else
                campo.setText(campo.getText() + "6");

        if (e.getSource() == num1)
            if (campo.getText() == "")
                campo.setText("1");
            else
                campo.setText(campo.getText() + "1");

        if (e.getSource() == num2)
            if (campo.getText() == "")
                campo.setText("2");
            else
                campo.setText(campo.getText() + "2");

        if (e.getSource() == num3)
            if (campo.getText() == "")
                campo.setText("3");
            else
                campo.setText(campo.getText() + "3");

        if (e.getSource() == num0)
            if (campo.getText() == "")
                campo.setText("0");
            else
                campo.setText(campo.getText() + "0");

        if (e.getSource() == pun)
            if (campo.getText() == "")
                campo.setText("0.");
            else
                campo.setText(campo.getText() + ".");

        if (e.getSource() == mas)
            campo.setText(campo.getText() + "+");

        if (e.getSource() == men)
            campo.setText(campo.getText() + "-");
        
        if (e.getSource() == por)
            campo.setText(campo.getText() + "x");
        
        if (e.getSource() == ent)
            campo.setText(campo.getText() + "/");

        if (e.getSource() == pot)
            campo.setText(campo.getText() + "^");

        if (e.getSource() == ac)
            campo.setText(null);
        
        if (e.getSource() == igu)
            calcular();
        
    }

    public void calcular(){
        String n1 = "", n2 = "", eq = campo.getText();
        boolean flag = true;
        int operadores = 0, puntos = 0;
        char oper=0;

        //Comienzo de las validaciones
        for (int i = 0; i < eq.length(); i++){
            if (eq.charAt(i) != 43 && (eq.charAt(i) < 45 || eq.charAt(i) > 57) && eq.charAt(i) != 120 && eq.charAt(i) != 94){
                JOptionPane.showMessageDialog(null, "Hay caracteres no válidos", "Error",JOptionPane.WARNING_MESSAGE);
                campo.setText("");
                return;
            }
            if (eq.charAt(i) == 43 || eq.charAt(i) == 45 || eq.charAt(i) == 47 || eq.charAt(i) == 94 || eq.charAt(i) == 120){
                operadores++;
                oper = eq.charAt(i);
            }
            if (eq.charAt(0) == 43 || eq.charAt(0) == 45 || eq.charAt(0) == 47 || eq.charAt(0) == 94 || eq.charAt(0) == 120 || eq.charAt(eq.length()-1) == 43 || eq.charAt(eq.length()-1) == 45 || eq.charAt(eq.length()-1) == 47 || eq.charAt(eq.length()-1) == 94 || eq.charAt(eq.length()-1) == 120){
                JOptionPane.showMessageDialog(null, "Error de sintaxis\nNo puede haber operadores en los extremos de la ecuación", "Error",JOptionPane.WARNING_MESSAGE);
                campo.setText("");
                return;
            }

        }
        if (operadores != 1){
            JOptionPane.showMessageDialog(null, "Error de sintaxis\nDebe haber solo un operador", "Error",JOptionPane.WARNING_MESSAGE);
            campo.setText("");
            return;
        }
        //Separando los numeros en dos variables string
        operadores = 0;
        for (int i = 0; i < eq.length(); i++) {
            if (eq.charAt(i) == oper)
                operadores++;
            else if (operadores == 0)
                n1 = n1 + eq.charAt(i);
            else
                n2 = n2 + eq.charAt(i);
        }

        //Comprobar que cada numero no tiene más de un punto
        //Primer numero
        for (int i = 0; i < n1.length(); i++){
            if (n1.charAt(i) == 46)
                puntos++;
        }
        if (puntos > 1) {
            JOptionPane.showMessageDialog(null, "Error de sintaxis\nSolo puede haber un punto por operando", "Error",JOptionPane.WARNING_MESSAGE);
            campo.setText("");
            return;
        }
        if (n1.charAt(0) == 46)
            n1 = "0" + n1;
        else if (n1.charAt(n1.length()-1) == 46)
            n1 = n1 + "0";
        //Segundo numero
        puntos = 0;
        for (int i = 0; i < n2.length(); i++){
            if (n2.charAt(i) == 46)
                puntos++;
        }
        if (puntos > 1) {
            JOptionPane.showMessageDialog(null, "Error de sintaxis\nSolo puede haber un punto por operando", "Error",JOptionPane.WARNING_MESSAGE);
            campo.setText("");
            return;
        }
        if (n2.charAt(0) == 46)
            n2 = "0" + n2;
        else if (n2.charAt(n2.length()-1) == 46)
            n2 = n2 + "0";
        
        oper1 = Double.parseDouble(n1);
        oper2 = Double.parseDouble(n2);
        
        //Final de las validaciones//Comienzo de las operaciones

        switch (oper) {
            case 43: //Suma
                res = oper1 + oper2 * 1.0;
                break;
            case 45: //Resta
                res = oper1 - oper2 * 1.0;
                break;
            case 47: //División
                res = oper1 / oper2 * 1.0;
                break;
            case 94: //Potencia
                res = Math.pow(oper1, oper2);
                break;
            case 120: //Multiplicación
                res = oper1 * oper2 * 1.0;
                break;
            
            default:
                break;
        }

        //Impresión del resultado:

        campo.setText(String.valueOf(res));
        calculado = true;

    }
}