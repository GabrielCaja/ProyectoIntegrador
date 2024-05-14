import javax.swing.JOptionPane;

public class ModeloLogin {
    public static void iniciarSesion(String nickname, String contrasena) {
        boolean usuarioEncontrado = false;
        for (ModeloRegistro registro : ModeloRegistro.getListaClientes()) {
            if (registro.getNickname().equals(nickname) && registro.getContrasena().equals(contrasena)) {
                JOptionPane.showMessageDialog(null, "Bienvenido de nuevo: " + registro.getNombre());
                usuarioEncontrado = true;
                break;
            }
        }
        // En caso de no encontrar al usuario
        if (!usuarioEncontrado) {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Por favor, inténtalo de nuevo.");
        }
    }
}
