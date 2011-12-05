package Vista;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;

public class Calendario extends javax.swing.JFrame {
	private JPanel panContenedor;
	private JTable tblListado;
	private JScrollPane scpListado;
	private JLabel lblTitulo;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public Calendario() {
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
					lblTitulo.setText("Calendario de Partidos");
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
	
	
   public void cargarCalendario(AbstractTableModel abstractTableModel)
   {
	   tblListado.setModel(abstractTableModel);
	   
   };
}
