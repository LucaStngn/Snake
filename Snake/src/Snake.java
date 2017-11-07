import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/* |-Projektname-|: 	
 * |-Aufgabe-|: 		
 * |-Status-|: 		Nicht Fertig
 */




public class Snake extends JFrame {
	public Snake() {
		
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 36, 438, 200);
		getContentPane().add(panel);
		
		JLabel lblSnakeByLuca = new JLabel("Snake by Luca");
		lblSnakeByLuca.setBounds(180, 8, 89, 16);
		getContentPane().add(lblSnakeByLuca);
		
		JLabel lblPunkte = new JLabel("Punkte:");
		lblPunkte.setBounds(16, 248, 89, 16);
		getContentPane().add(lblPunkte);
		
		JLabel lblZeit = new JLabel("Zeit:");
		lblZeit.setBounds(180, 248, 89, 16);
		getContentPane().add(lblZeit);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnStart.setBounds(327, 243, 117, 29);
		getContentPane().add(btnStart);
	}

	private JPanel contentPane;

	public static void main(String[] args) {

	}
}
