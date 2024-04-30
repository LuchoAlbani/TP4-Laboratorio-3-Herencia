import com.albani.producto.controller.ControladorEstudiante;
import com.albani.producto.model.repository.EstudianteRepository;
import com.albani.producto.view.Consola;

public class Main {
    public static void main(String[] args) {

        EstudianteRepository estudianteRepository = new EstudianteRepository();
        Consola consola = new Consola();

        ControladorEstudiante controladorEstudiante = new ControladorEstudiante(estudianteRepository, consola);

        controladorEstudiante.menuPrincipal();

    }
}