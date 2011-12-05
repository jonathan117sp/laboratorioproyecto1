package Vista;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MenuPrincipal extends javax.swing.JFrame {
	private JButton jBtnRegistrar;
	private JButton jBtnGenerar;
	private JButton jBtnMostrar;
	private JButton jBtnTabla;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MenuPrincipal inst = new MenuPrincipal();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public MenuPrincipal() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				{
					jBtnRegistrar = new JButton();
					getContentPane().add(jBtnRegistrar);
					jBtnRegistrar.setText("Registrar datos");
					jBtnRegistrar.setBounds(12, 37, 146, 54);
				}
				{
					jBtnGenerar = new JButton();
					getContentPane().add(jBtnGenerar);
					jBtnGenerar.setText("Generar partidos");
					jBtnGenerar.setBounds(184, 36, 138, 56);
				}
				{
					jBtnMostrar = new JButton();
					getContentPane().add(jBtnMostrar);
					jBtnMostrar.setText("Mostrar Calendario");
					jBtnMostrar.setBounds(349, 35, 153, 58);
				}
				{
					jBtnTabla = new JButton();
					getContentPane().add(jBtnTabla);
					jBtnTabla.setText("Tabla de Posiciones");
					jBtnTabla.setBounds(526, 36, 166, 57);
				}
			}
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			pack();
			this.setSize(734, 186);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public void agregarListener(ActionListener accion)
	{
		jBtnGenerar.addActionListener(accion);
		jBtnMostrar.addActionListener(accion);
		jBtnRegistrar.addActionListener(accion);
		jBtnTabla.addActionListener(accion);
		
	}
	
	public void mostrarMensaje(String mensaje){
		JOptionPane.showMessageDialog(this, mensaje);
	}

}
