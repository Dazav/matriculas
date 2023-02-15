package matricula;

import java.util.List;

public class Estudiante extends Persona {
    private int numExpediente;
    private List<Matricula> matriculas;

    public void addMatricula(Matricula matricula) {
        // añadir matricula a la lista de matriculas
    }

    public void recibirBeca(float importe) {
        // recibir beca
    }

    public void dejarBeca() {
        // dejar de ser becario
    }
}