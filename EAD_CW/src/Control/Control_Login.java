
package Control;
import Modle.*;
import View.*;

public class Control_Login{
    Login_logic modle;
    Login view;
    public Control_Login(Login view,Login_logic modle)
    {
        this.modle=modle;
        this.view=view;
        
        
    }
}
