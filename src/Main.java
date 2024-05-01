import com.albani.producto.controller.ControladorEstudiante;
import com.albani.producto.controller.ControladorProfesor;
import com.albani.producto.model.repository.EstudianteRepository;
import com.albani.producto.model.repository.ProfesorRepository;
import com.albani.producto.view.Consola;

public class Main {
    public static void main(String[] args) {

        EstudianteRepository estudianteRepository = new EstudianteRepository();
        ProfesorRepository profesorRepository = new ProfesorRepository();
        Consola consola = new Consola();
        ControladorProfesor controladorProfesor = new ControladorProfesor(profesorRepository, consola);

        ControladorEstudiante controladorEstudiante = new ControladorEstudiante(estudianteRepository, consola, controladorProfesor);

        controladorEstudiante.menuPrincipal();

    }
}