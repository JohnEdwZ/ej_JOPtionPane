import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Entrada y verificación del número
        String inputNumero = JOptionPane.showInputDialog("Ingrese un número:");
        int numero = Integer.parseInt(inputNumero);

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "El número es positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "El número es negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "El número es cero.");
        }

        // Entrada y verificación del día
        String inputDia = JOptionPane.showInputDialog("Ingrese un número del día (1-7):");
        int dia = Integer.parseInt(inputDia);

        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Miércoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Día no válido");
                break;
        }
    }
}
