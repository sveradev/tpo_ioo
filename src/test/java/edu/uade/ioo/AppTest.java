package edu.uade.ioo;

import edu.uade.ioo.socio.dominio.Accionista;
import edu.uade.ioo.socio.dominio.SocioProtector;
import edu.uade.ioo.socio.dominio.TipoEmpresa;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void givenSocioProtectoWhenAgregar1AccionistaThenAccionesTiene1SoloValor() {
        //GIVEN
        SocioProtector socioProtector = new SocioProtector("777-cuitsocPro1", "socPro1"
            , Instant.now()
            , TipoEmpresa.PEQUENA
            , "actividad"
            , "direccion"
            , "telefono"
            , "email"
            , 465);

        Accionista accionista1 = new Accionista("Cuit accionista"
            , "razonSocial acc1"
            , 50.0);

        //WHEN
        socioProtector.agregaAccionista(accionista1);

        //THEN
        assertTrue(socioProtector.getAccionistas().size() == 1);
    }
}
