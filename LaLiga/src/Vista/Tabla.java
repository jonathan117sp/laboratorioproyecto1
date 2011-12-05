package Vista;
import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.WindowConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
public class Tabla extends javax.swing.JFrame {
	private JPanel panContenedor;
	private JTable tblListado;
	private JScrollPane scpListado;
	private JLabel lblTitulo;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public Tabla() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				panContenedor = new JPanel();
				getContentPane().add(panContenedor, BorderLayout.CENTER);
				panContenedor.setLayout(null);
				{
					lblTitulo = new JLabel();
					panContenedor.add(lblTitulo);
					lblTitulo.setText("Tabla de Posiciones");
					lblTitulo.setBounds(39, 17, 440, 18);
					lblTitulo.setFont(new java.awt.Font("Dialog",1,18));
				}
				{
					scpListado = new JScrollPane();
					panContenedor.add(scpListado);
					scpListado.setBounds(54, 58, 359, 188);
					{
						tblListado = new JTable();
						scpListado.setViewportView(tblListado);
					}
				}
			}
			pack();
			this.setSize(477, 299);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	
   public void cargarTabla(AbstractTableModel abstractTableModel)
   {
	   tblListado.setModel(abstractTableModel);
	   
   };
}
