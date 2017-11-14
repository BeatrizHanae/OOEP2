package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SimuladorHarmonico extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel PainelDeSimuladores;
	
	public static void main(String[] args) {
		SimuladorHarmonico frame = new SimuladorHarmonico();
		frame.setVisible(true);
	}
	
	public SimuladorHarmonico() {
		
		setTitle("Harmônicas");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		PainelDeSimuladores = new JPanel();
		PainelDeSimuladores.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PainelDeSimuladores);
		PainelDeSimuladores.setLayout(null);
		
		JPanel panelSimulaHarmonico = new JPanel();
		panelSimulaHarmonico.setBounds(6, 54, 426, 121);
		PainelDeSimuladores.add(panelSimulaHarmonico);
		
		
	}
}
