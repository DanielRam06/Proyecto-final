import java.awt.event.ActionEvent; //Importa la clase ActionEvent del paquete awt.event
import java.awt.event.ActionListener; //Importa la clase ActionListener del paquete awt.event
import java.awt.event.MouseEvent; //Importa la clase MouseEvent del paquete awt.event
import java.awt.event.MouseListener; //Importa la clase MouseListener del paquete awt.event
import javax.swing.JButton; //Importa la clase JButton del paquete swing
import javax.swing.JFrame; //Importa la clase JFrame del paquete swing
import javax.swing.JPanel; //Importa la clase JPanel del paquete swing
import javax.swing.JSlider; //Importa la clase JSlider del paquete swing
import javax.swing.event.ChangeEvent; //Importa la clase ChangeEvent del paquete swing.event
import javax.swing.event.ChangeListener; //Importa la clase ChangeListener del paquete swing.event

public class SegundoCanvas extends JFrame implements ActionListener, ChangeListener, MouseListener{ //Declara la clase SegundoCanvas que extiende JFrame e implementa ActionListener, ChangeListener, MouseListener
	
		JButton nahButton; //Declara una variable JButton llamada nahButton
		JSlider sliding; //Declara una variable JSlider llamada sliding
		JPanel ventanota; //Declara una variable JPanel llamada ventanota
		
		public SegundoCanvas() { //Constructor de la clase SegundoCanvas
			
			ventanota = new JPanel(); //Crea una nueva instancia de JPanel llamada ventanota
			ventanota.setLayout(null); //Establece el diseño de ventanota como nulo
			nahButton = new JButton("Nah"); //Crea una nueva instancia de JButton llamada nahButton y establece su texto
			nahButton.setBounds(0, 450, 250, 100); //Establece los límites de nahButton
			nahButton.addActionListener(this); //Añade un ActionListener a nahButton
			sliding = new JSlider(0,255); //Crea una nueva instancia de JSlider llamada sliding con un rango de valores de 0 a 255
			sliding.setBounds(0,800, 300,100); //Establece los límites de sliding
			sliding.addChangeListener(this); //Añade un ChangeListener a sliding
			
			Canvas canvas = new Canvas(); //Crea una nueva instancia de Canvas llamada canvas
			canvas.setBounds(500, 200,500,500);//Establece los límites de canvas			
			canvas.addMouseListener(this); //Añade un MouseListener a canvas
			
			ventanota.add(canvas); //Añade canvas a ventanota
			ventanota.add(sliding); //Añade sliding a ventanota
			ventanota.add(nahButton);	//Añade nahButton a ventanota		
			add(ventanota); //Añade ventanota a la ventana
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Al cerrar la ventana, detiene el programa
			setSize(1500,900); //Establece el tamaño de la ventana
			setLocationRelativeTo(null); //Centra la ventana
			//setLayout(null); //Elimina las plantillas
			setResizable(false); //No permite modificar el tamaño de la ventana
			setVisible(true);	//Muestra la ventana	
		}

		@Override
		public void actionPerformed(ActionEvent e) { //Método para manejar eventos de acción en la ventana
			System.out.println("Necesito vacaciones"); //Imprime "Necesito vacaciones" en la consola
		}
		@Override
		public void stateChanged(ChangeEvent e) { //Método para manejar eventos de cambio en los JSliders
			System.out.println(sliding.getValue()); //Imprime el valor actual de sliding en la consola		
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub	
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub	
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub	
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub	
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub	
		}
	}

