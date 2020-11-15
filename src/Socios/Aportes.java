package Socios;

//import java.time.LocalDate;
//import java.time.Period;
//import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Aportes {
    private double importe;
    private Date fechaAportado;

    public Aportes(double importe, Date fechaAportado) {
        this.importe = importe;
        this.fechaAportado = fechaAportado;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Date getFechaAportado() {
        return fechaAportado;
    }

    public void setFechaAportado(Date fechaAportado) {
        this.fechaAportado = fechaAportado;
    }

/*

    public boolean esVigente2() {
        Date fechaActual = new Date();

        LocalDate desde = this.fechaAportado.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate hasta = fechaActual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period period = Period.between(desde, hasta);

        if (period.getYears() <= 2) {
            return true;
        }

        return false;

    }
*/

    public boolean esVigente() {
        Calendar actual = Calendar.getInstance();
        Calendar aportado = Calendar.getInstance();
        aportado.setTime(this.fechaAportado);
        aportado.add(Calendar.YEAR,2);

        return actual.before(aportado);
    }



    @Override
    public String toString() {
        return "Aportes{" +
                "importe=" + importe +
                ", fechaAportado=" + fechaAportado +
                '}';
    }


}
