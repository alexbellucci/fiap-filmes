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
	JFrame frame = new JFrame("Filmokas");
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(800, 500);
	
	
	JPanel janela = new JPanel(new BorderLayout(20,0));
	JPanel icone = new JPanel();
	JPanel informacoes = new JPanel(new GridLayout(0,1));
	JPanel avaliacoes = new JPanel(new GridLayout(0,1));
	avaliacoes.setPreferredSize(new Dimension(130,400));
	JPanel botao = new JPanel();
	
	janela.add(icone, BorderLayout.WEST);
	janela.add(informacoes, BorderLayout.CENTER);
	janela.add(avaliacoes, BorderLayout.EAST);
	janela.add(botao, BorderLayout.SOUTH);
	
		
	//imagem
	icone.add(new MinhaImagem(new ImageIcon("C:\\FIAP\\2021\\JAVA\\Filmokas\\Imagens\\leao2.jpg")));
	
	
	
	//titulo
	informacoes.add(new MeuLabel("Titulo"));
	informacoes.add(new MeuTextField());
	
	//sinopse
	informacoes.add(new MeuLabel("Sinopse"));
	informacoes.add(new MeuTextField());
	
	//genero
	informacoes.add(new MeuLabel("Genero"));
	String[] genero = {"comédia", "drama", "terror"};
	informacoes.add(new JComboBox<String>(genero));
	
	//onde assistir
	avaliacoes.add(new MeuLabel("Onde assistir?"));
	List<String> listaDeOpcoes = List.of("Netflix", "Amazon", "Pirate Bay");
	MeuRadioGroup group = new MeuRadioGroup(listaDeOpcoes );
	avaliacoes.add(group);
	
	//assistido
	avaliacoes.add(new MeuCheckBox("assistido"));
	avaliacoes.add(new MeuLabel("Avaliacao"));
	avaliacoes.add(new StarRater(5, 0));
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
