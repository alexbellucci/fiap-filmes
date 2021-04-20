import java.awt.Dimension;




import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class MinhaImagem  extends JLabel {


private static final long serialVersionUID = 1L;



public MinhaImagem(ImageIcon imageIcon) {
super(imageIcon);
init();
}





private void init() {
this.setHorizontalAlignment(JLabel.CENTER);
this.setPreferredSize(new Dimension(200, 350));

}



}
