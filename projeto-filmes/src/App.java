import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class App {
	
	public static void main(String[] args) {
	JFrame frame = new JFrame("Movies");
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(800, 500);
	
	JPanel janela = new JPanel(new BorderLayout(20,0));
	JPanel icon = new JPanel();
	JPanel info = new JPanel(new GridLayout(0,1));
	JPanel rate = new JPanel(new GridLayout(0,1));
	rate.setPreferredSize(new Dimension(130,400));
	JPanel botao = new JPanel();
	
	janela.add(icon, BorderLayout.WEST);
	janela.add(info, BorderLayout.CENTER);
	janela.add(rate, BorderLayout.EAST);
	janela.add(botao, BorderLayout.SOUTH);
		
	//imagem
	icon.add(new Imagem(new ImageIcon("D:\Documentos\FIAP\ProjetoFilmes\fiap-filmes\projeto-filmes\Imagens\toystory.jpg")));
		
	//titulo
	info.add(new Label("Titulo"));
	info.add(new TextField());
	
	//sinopse
	info.add(new Label("Sinopse"));
	info.add(new TextField());
	
	//genero
	info.add(new Label("Genero"));
	String[] genero = {"Animação", "Comedia", "Ação"};
	info.add(new JComboBox<String>(genero));
	
	//onde assistir
	rate.add(new Label("Onde assistir?"));
	List<String> listaOpcoes = List.of("Disney Plus", "Amazon Prime", "Netflix");
	RadioGroup group = new RadioGroup(listaOpcoes);
	rate.add(group);
	
	//assistido
	rate.add(new CheckBox("Assistido"));
	rate.add(new Label("Avaliacao"));
	rate.add(new StarRater(5, 0));
	JButton salvar = new JButton("Salvar");
	JButton cancelar = new JButton("Cancelar");
	botao.add(salvar);
	botao.add(cancelar);
	
	JTabbedPane abas = new JTabbedPane();
	
	abas.add("cadastro", janela);
	abas.add("lista", new JPanel());
	
	frame.add(abas);
	frame.setVisible(true);	
	}
}
