package lineasYoperaciones;


import java.util.ArrayList;
import java.util.Date;

public class LineaCredito {


    private Date fechaVencimiento;
    private double montoMaximo;
    private ArrayList<TipoOperacion> operacionesValidas;
    private ArrayList<Operacion> operaciones;


    public LineaCredito(Date fechaVencimiento
            , double montoMaximo
            , ArrayList<TipoOperacion> operacionesValidas) {
        this.fechaVencimiento = fechaVencimiento;
        this.montoMaximo = montoMaximo;
        this.operacionesValidas = operacionesValidas;
        this.operaciones = new ArrayList<>();
    }




}