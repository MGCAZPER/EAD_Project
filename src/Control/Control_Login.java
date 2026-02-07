
package Control;
import Modle.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Control_Login{
    Login_logic modle;
    Login view;
    public Control_Login(Login view,Login_logic modle)
        {
            this.modle=modle;
            this.view=view;
            view.getLogin().addActionListener(new LoginHandler());    
        }
        class LoginHandler implements ActionListener{
            @Override
                    public void actionPerformed(ActionEvent e) {
                        String result = modle.Login(view.getUsername(),view.getPassword());
                        if(result.equals("LS")){
                            JOptionPane.showMessageDialog(view,"LoginSucssesful");
                        }else if(result.equals("LF")){
                            JOptionPane.showMessageDialog(view,"Login Failed");
                        }else if(result.equals("EF")){
                            JOptionPane.showMessageDialog(view,"Please Fill All Feilds");
                        }else{
                            JOptionPane.showMessageDialog(view,"Database Failed");
                            
                            
                        }
                    }
        }
    }

