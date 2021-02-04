import javax.swing.JOptionPane;
public class Ejercicio4 {
	
	public static void main(String args[]) {
		
		double radio;
		 
		radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
		JOptionPane.showMessageDialog(null, "El area es:"+Math.pow(radio, 2)*Math.PI);
	}
}
		
		

