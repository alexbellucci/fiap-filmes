import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class MeuLabel extends JLabel {
	
	private static final long serialVersionUID = 1L;
	
	public MeuLabel(String texto) {
		super(texto);
		init();		
	}
	
	
	private void init() {
		this.setHorizontalAlignment(JLabel.LEFT);
		this.setForeground(new Color(96, 52, 219));
		this.setPreferredSize(new Dimension(100,200));
		this.setFont(new Font(null, Font.BOLD, 15));
	}
		
	
}
