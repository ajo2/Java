import java.awt.*;
import java.awt.event.*;

class Login extends Frame{
    Login(){
        Label lb1 = new Label("Login");
        Label lb2 = new Label("Name : ");
        TextField tf1 = new TextField("USER");
        Label lb3 = new Label("Gender");
        Checkbox cb1 = new Checkbox("Male");
        Checkbox cb2 = new Checkbox("Female");
        Label lb4 = new Label("Age");
        TextField tf2 = new TextField();
        Label lb5 = new Label("Country");
        Choice ch = new Choice();
        ch.add("INDIA");
        ch.add("RUSSIA");
        ch.add("AMERICA");
        ch.add("CHINA");
        ch.add("SOUTH AFERIKA");
        Label lb6 = new Label("About YOU...");
        TextArea ta = new TextArea();
        Button btn = new Button("Submit");
        //adding in frame
        //setTittle("Login");
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setTitle("Login");
        add(lb1);
        lb1.setBounds(250,30,50,50);
        add(lb2);
        lb2.setBounds(50,65,50,50);
        add(tf1);
        tf1.setBounds(150,80,250,20);
        add(lb3);
        lb3.setBounds(50,100,50,50);
        add(cb1);
        cb1.setBounds(160,100,50,50);
        add(cb2);
        cb2.setBounds(240,100,50,50);
        add(lb4);
        lb4.setBounds(50,150,50,20);
        add(tf2);
        tf2.setBounds(150,150,200,20);
        add(lb5);
        lb5.setBounds(50,190,50,50);
        add(ch);
        ch.setBounds(150,200,100,50);
        add(lb6);
        lb6.setBounds(50,250,100,50);
        add(ta);
        ta.setBounds(150,250,200,100);
        add(btn);
        btn.setBounds(225,400,100,50);
        //action time
        ActionListener submitlisteran = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(tf1.getText());
                System.err.println(tf2.getText());
                System.out.println(ta.getText());
                System.out.println(ch);
                
            }
        };
        btn.addActionListener(submitlisteran);
    }

    public static void main(String args[]){
        new Login();
    }
}