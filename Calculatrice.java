// 0e0e0e - Chiffre
// 171717 - Touches fonctionnel 
// 464746 - espace de selection
// 4f5255 - hover
// 383738 - forder
// 373638 - egale

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.*;
import javax.swing.*;


import jdk.jshell.JShell;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculatrice extends JFrame implements ActionListener {

    private JTextField txtChamp = new JTextField("0");
    private JTextField histChamp = new JTextField();

    private JButton btZero = new JButton("0");
    private JButton btEgale = new JButton("=");

    private JButton btUn = new JButton("1");
    private JButton btDeux = new JButton("2");
    private JButton btTrois = new JButton("3");
    private JButton btPlus = new JButton("+");

    private JButton btQuatre = new JButton("4");
    private JButton btCinq = new JButton("5");
    private JButton btSix = new JButton("6");
    private JButton btMoin = new JButton("-");

    private JButton btSept = new JButton("7");
    private JButton btHuit = new JButton("8");
    private JButton btNeuf = new JButton("9"); 
    private JButton btMultiplier = new JButton("x");

    private JButton btNeg = new JButton("+/-"); 
    private JButton btVirgule = new JButton(",");
    private JButton btCE = new JButton("CE");
    private JButton btDiviser = new JButton("÷");

    private JLabel labTextarea = new JLabel("0");

    public Calculatrice(){
        this.setTitle("Calculatrice");
        this.setBounds(200, 200, 376, 455);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.decode("#464746"));
        this.setResizable(false);


        this.histChamp.setBounds(0, 0, 360, 30);
        this.histChamp.setHorizontalAlignment(SwingConstants.RIGHT);
        this.histChamp.setBackground(Color.decode("#171717"));
        this.histChamp.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        this.histChamp.setForeground(Color.decode("#8F8F8F"));
        this.histChamp.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.histChamp);

        this.txtChamp.setBounds(0, 30, 360, 70);
        this.txtChamp.setHorizontalAlignment(SwingConstants.RIGHT);
        this.txtChamp.setBackground(Color.decode("#0e0e0e"));
        this.txtChamp.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
        this.txtChamp.setForeground(Color.WHITE);
        this.txtChamp.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.txtChamp);


        this.btZero.setBounds(0, 352, 270, 64);
        this.btZero.setFocusPainted(false);
        this.btZero.setBackground(Color.decode("#0e0e0e"));
        this.btZero.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btZero.setForeground(Color.WHITE);
        this.btZero.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btZero);
        btZero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btZero.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btZero.setBackground(Color.decode("#0e0e0e"));
            }
        });

        this.btEgale.setBounds(270, 352, 90, 64);
        this.btEgale.setFocusPainted(false);
        this.btEgale.setBackground(Color.decode("#373638"));
        this.btEgale.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btEgale.setForeground(Color.WHITE);
        this.btEgale.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btEgale);
        btEgale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEgale.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btEgale.setBackground(Color.decode("#373638"));
            }
        });


        this.btUn.setBounds(0, 289, 90, 64);
        this.btUn.setFocusPainted(false);
        this.btUn.setBackground(Color.decode("#0e0e0e"));
        this.btUn.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btUn.setForeground(Color.WHITE);
        this.btUn.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btUn);
        btUn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btUn.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btUn.setBackground(Color.decode("#0e0e0e"));
            }
        });

        this.btDeux.setBounds(90, 289, 90, 64);
        this.btDeux.setFocusPainted(false);
        this.btDeux.setBackground(Color.decode("#0e0e0e"));
        this.btDeux.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btDeux.setForeground(Color.WHITE);
        this.btDeux.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btDeux);
        btDeux.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDeux.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDeux.setBackground(Color.decode("#0e0e0e"));
            }
        });

        this.btTrois.setBounds(180, 289, 90, 64);
        this.btTrois.setFocusPainted(false);
        this.btTrois.setBackground(Color.decode("#0e0e0e"));
        this.btTrois.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btTrois.setForeground(Color.WHITE);
        this.btTrois.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btTrois);
        btTrois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btTrois.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btTrois.setBackground(Color.decode("#0e0e0e"));
            }
        });

        this.btPlus.setBounds(270, 289, 90, 64);
        this.btPlus.setFocusPainted(false);
        this.btPlus.setBackground(Color.decode("#171717"));
        this.btPlus.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btPlus.setForeground(Color.WHITE);
        this.btPlus.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btPlus);
        btPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btPlus.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btPlus.setBackground(Color.decode("#171717"));
            }
        });


        this.btQuatre.setBounds(0, 226, 90, 64);
        this.btQuatre.setFocusPainted(false);
        this.btQuatre.setBackground(Color.decode("#0e0e0e"));
        this.btQuatre.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btQuatre.setForeground(Color.WHITE);
        this.btQuatre.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btQuatre);
        btQuatre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btQuatre.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btQuatre.setBackground(Color.decode("#0e0e0e"));
            }
        });

        this.btCinq.setBounds(90, 226, 90, 64);
        this.btCinq.setFocusPainted(false);
        this.btCinq.setBackground(Color.decode("#0e0e0e"));
        this.btCinq.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btCinq.setForeground(Color.WHITE);
        this.btCinq.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btCinq);
        btCinq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCinq.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCinq.setBackground(Color.decode("#0e0e0e"));
            }
        });

        this.btSix.setBounds(180, 226, 90, 64);
        this.btSix.setFocusPainted(false);
        this.btSix.setBackground(Color.decode("#0e0e0e"));
        this.btSix.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btSix.setForeground(Color.WHITE);
        this.btSix.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btSix);
        btSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSix.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSix.setBackground(Color.decode("#0e0e0e"));
            }
        });

        this.btMoin.setBounds(270, 226, 90, 64);
        this.btMoin.setFocusPainted(false);
        this.btMoin.setBackground(Color.decode("#171717"));
        this.btMoin.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btMoin.setForeground(Color.WHITE);
        this.btMoin.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btMoin);
        btMoin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMoin.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMoin.setBackground(Color.decode("#171717"));
            }
        });


        this.btSept.setBounds(0, 163, 90, 64);
        this.btSept.setFocusPainted(false);
        this.btSept.setBackground(Color.decode("#0e0e0e"));
        this.btSept.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btSept.setForeground(Color.WHITE);
        this.btSept.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btSept);
        btSept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSept.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSept.setBackground(Color.decode("#0e0e0e"));
            }
        });

        this.btHuit.setBounds(90, 163, 90, 64);
        this.btHuit.setFocusPainted(false);
        this.btHuit.setBackground(Color.decode("#0e0e0e"));
        this.btHuit.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btHuit.setForeground(Color.WHITE);
        this.btHuit.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btHuit);
        btHuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btHuit.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btHuit.setBackground(Color.decode("#0e0e0e"));
            }
        });

        this.btNeuf.setBounds(180, 163, 90, 64);
        this.btNeuf.setFocusPainted(false);
        this.btNeuf.setBackground(Color.decode("#0e0e0e"));
        this.btNeuf.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btNeuf.setForeground(Color.WHITE);
        this.btNeuf.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btNeuf);
        btNeuf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNeuf.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNeuf.setBackground(Color.decode("#0e0e0e"));
            }
        });

        this.btMultiplier.setBounds(270, 163, 90, 64);
        this.btMultiplier.setFocusPainted(false);
        this.btMultiplier.setBackground(Color.decode("#171717"));
        this.btMultiplier.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.btMultiplier.setForeground(Color.WHITE);
        this.btMultiplier.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btMultiplier);
        btMultiplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMultiplier.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMultiplier.setBackground(Color.decode("#171717"));
            }
        });


        this.btCE.setBounds(0, 100, 90, 64);
        this.btCE.setFocusPainted(false);
        this.btCE.setBackground(Color.decode("#171717"));
        this.btCE.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        this.btCE.setForeground(Color.WHITE);
        this.btCE.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btCE);
        btCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCE.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCE.setBackground(Color.decode("#171717"));
            }
        });

        this.btNeg.setBounds(90, 100, 90, 64);
        this.btNeg.setFocusPainted(false);
        this.btNeg.setBackground(Color.decode("#171717"));
        this.btNeg.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        this.btNeg.setForeground(Color.WHITE);
        this.btNeg.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btNeg);
        btNeg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btNeg.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btNeg.setBackground(Color.decode("#171717"));
            }
        });

        this.btVirgule.setBounds(180, 100, 90, 64);
        this.btVirgule.setFocusPainted(false);
        this.btVirgule.setBackground(Color.decode("#171717"));
        this.btVirgule.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        this.btVirgule.setForeground(Color.WHITE);
        this.btVirgule.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btVirgule);
        btVirgule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btVirgule.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btVirgule.setBackground(Color.decode("#171717"));
            }
        });

        this.btDiviser.setBounds(270, 100, 90, 64);
        this.btDiviser.setFocusPainted(false);
        this.btDiviser.setBackground(Color.decode("#171717"));
        this.btDiviser.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        this.btDiviser.setForeground(Color.WHITE);
        this.btDiviser.setBorder(BorderFactory.createLineBorder(Color.decode("#383738")));
        this.add(this.btDiviser);
        btDiviser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDiviser.setBackground(Color.decode("#4f5255"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDiviser.setBackground(Color.decode("#171717"));
            }
        });


        // rendre les boutons cliquables
        this.btZero.addActionListener(this);
        this.btEgale.addActionListener(this);
        this.btUn.addActionListener(this);
        this.btDeux.addActionListener(this);
        this.btTrois.addActionListener(this);
        this.btPlus.addActionListener(this);
        this.btQuatre.addActionListener(this);
        this.btCinq.addActionListener(this);
        this.btSix.addActionListener(this);
        this.btMoin.addActionListener(this);
        this.btSept.addActionListener(this);
        this.btHuit.addActionListener(this);
        this.btNeuf.addActionListener(this);
        this.btMultiplier.addActionListener(this);
        this.btCE.addActionListener(this);
        this.btNeg.addActionListener(this);
        this.btVirgule.addActionListener(this);
        this.btDiviser.addActionListener(this);


        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculatrice();
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == this.btZero) {
            String s= this.txtChamp.getText();
            char c =s.charAt(0);
            if (s.contains("ERR.")) {
                this.txtChamp.setText("0");
            }
            else if (c == "0".charAt(0) && s.length()<2) {
                StringBuilder newString = new StringBuilder(s);
                newString.setCharAt(0, '0');
                this.txtChamp.setText(newString.toString());
            } else {
                this.txtChamp.setText(this.txtChamp.getText()+0);
            }
            
        }
        else if (e.getSource() == this.btEgale) {
            try {
                String chaine= this.txtChamp.getText();
                Expression express = new ExpressionBuilder(chaine).build();
                double result = express.evaluate();
                this.txtChamp.setText(String.valueOf(result));
                // Historique de calcule
                this.histChamp.setText(this.histChamp.getText()+"   "+chaine+"="+this.txtChamp.getText());
            } catch (Exception extxe) {
                this.txtChamp.setText("ERR.");
            }
        }
        else if (e.getSource() == this.btUn) {
            String s= this.txtChamp.getText();
            char c =s.charAt(0);
            if (s.contains("ERR.")) {
                this.txtChamp.setText("1");
            }
            else if (c == "0".charAt(0) && s.length()<2) {
                StringBuilder newString = new StringBuilder(s);
                newString.setCharAt(0, '1');
                this.txtChamp.setText(newString.toString());
            } else {
                this.txtChamp.setText(this.txtChamp.getText()+1);
            }
        }
        else if (e.getSource() == this.btDeux) {
            String s= this.txtChamp.getText();
            char c =s.charAt(0);
            if (s.contains("ERR.")) {
                this.txtChamp.setText("2");
            }
            else if (c == "0".charAt(0) && s.length()<2) {
                StringBuilder newString = new StringBuilder(s);
                newString.setCharAt(0, '2');
                this.txtChamp.setText(newString.toString());
            } else {
                this.txtChamp.setText(this.txtChamp.getText()+2);
            }
        }
        else if (e.getSource() == this.btTrois) {
            String s= this.txtChamp.getText();
            char c =s.charAt(0);
            if (s.contains("ERR.")) {
                this.txtChamp.setText("3");
            }
            else if (c == "0".charAt(0) && s.length()<2) {
                StringBuilder newString = new StringBuilder(s);
                newString.setCharAt(0, '3');
                this.txtChamp.setText(newString.toString());
            } else {
                this.txtChamp.setText(this.txtChamp.getText()+3);
            }
        }
        else if (e.getSource() == this.btPlus) {
            this.txtChamp.setText(this.txtChamp.getText()+"+");
        }
        else if (e.getSource() == this.btQuatre) {
            String s= this.txtChamp.getText();
            char c =s.charAt(0);
            if (s.contains("ERR.")) {
                this.txtChamp.setText("4");
            }
            else if (c == "0".charAt(0) && s.length()<2) {
                StringBuilder newString = new StringBuilder(s);
                newString.setCharAt(0, '4');
                this.txtChamp.setText(newString.toString());
            } else {
                this.txtChamp.setText(this.txtChamp.getText()+4);
            }
        }
        else if (e.getSource() == this.btCinq) {
            String s= this.txtChamp.getText();
            char c =s.charAt(0);
            if (s.contains("ERR.")) {
                this.txtChamp.setText("5");
            }
            else if (c == "0".charAt(0) && s.length()<2) {
                StringBuilder newString = new StringBuilder(s);
                newString.setCharAt(0, '5');
                this.txtChamp.setText(newString.toString());
            } else {
                this.txtChamp.setText(this.txtChamp.getText()+5);
            }
        }
        else if (e.getSource() == this.btSix) {
            String s= this.txtChamp.getText();
            char c =s.charAt(0);
            if (s.contains("ERR.")) {
                this.txtChamp.setText("6");
            }
            else if (c == "0".charAt(0) && s.length()<2) {
                StringBuilder newString = new StringBuilder(s);
                newString.setCharAt(0, '6');
                this.txtChamp.setText(newString.toString());
            } else {
                this.txtChamp.setText(this.txtChamp.getText()+6);
            }
        }
        else if (e.getSource() == this.btMoin) {
            this.txtChamp.setText(this.txtChamp.getText()+"-");
        }
        else if (e.getSource() == this.btSept) {
            String s= this.txtChamp.getText();
            char c =s.charAt(0);
            if (s.contains("ERR.")) {
                this.txtChamp.setText("7");
            }
            else if (c == "0".charAt(0) && s.length()<2) {
                StringBuilder newString = new StringBuilder(s);
                newString.setCharAt(0, '7');
                this.txtChamp.setText(newString.toString());
            } else {
                this.txtChamp.setText(this.txtChamp.getText()+7);
            }
        }
        else if (e.getSource() == this.btHuit) {
            String s= this.txtChamp.getText();
            char c =s.charAt(0);
            if (s.contains("ERR.")) {
                this.txtChamp.setText("8");
            }
            else if (c == "0".charAt(0) && s.length()<2) {
                StringBuilder newString = new StringBuilder(s);
                newString.setCharAt(0, '8');
                this.txtChamp.setText(newString.toString());
            } else {
                this.txtChamp.setText(this.txtChamp.getText()+8);
            }
        }
        else if (e.getSource() == this.btNeuf) {
            String s= this.txtChamp.getText();
            char c =s.charAt(0);
            if (s.contains("ERR.")) {
                this.txtChamp.setText("9");
            }
            else if (c == "0".charAt(0) && s.length()<2) {
                StringBuilder newString = new StringBuilder(s);
                newString.setCharAt(0, '9');
                this.txtChamp.setText(newString.toString());
            } else {
                this.txtChamp.setText(this.txtChamp.getText()+9);
            }
        }
        else if (e.getSource() == this.btMultiplier) {
            this.txtChamp.setText(this.txtChamp.getText()+"*");
        }
        else if (e.getSource() == this.btCE) {
            this.txtChamp.setText("0");
        }
        else if (e.getSource() == this.btNeg) {
            
            String s= this.txtChamp.getText();
            char c =s.charAt(0);          
            
            if (c == "-".charAt(0)) {
                StringBuilder newString = new StringBuilder(s);
                newString.setCharAt(0, ' ');
                this.txtChamp.setText(newString.toString());
            } else if (c == " ".charAt(0)) {
                StringBuilder newString = new StringBuilder(s);
                newString.setCharAt(0, '-');
                this.txtChamp.setText(newString.toString());
            } else if (c == "0".charAt(0)) {
                StringBuilder newString = new StringBuilder(s);
                newString.setCharAt(0, '0');
                this.txtChamp.setText(newString.toString());
            } else {
                StringBuilder newString = new StringBuilder(s);
                this.txtChamp.setText('-'+newString.toString());
            }
        }
        else if (e.getSource() == this.btVirgule) {
            this.txtChamp.setText(this.txtChamp.getText()+".");
        }
        else if (e.getSource() == this.btDiviser) {
            this.txtChamp.setText(this.txtChamp.getText()+"/");
        }
        
    }
}