package edu.uade.ioo.testing;

import edu.uade.ioo.Controller.ControladorRegistro;
import edu.uade.ioo.Controller.ControladorSGR;

import edu.uade.ioo.socio.dominio.Accionista;
import edu.uade.ioo.socio.dominio.Aportes;
import edu.uade.ioo.socio.dominio.SocioParticipe;
import edu.uade.ioo.socio.dominio.SocioProtector;
import edu.uade.ioo.operacion.dominio.Cheque;
import edu.uade.ioo.operacion.dominio.Operacion;
import edu.uade.ioo.operacion.dominio.TipoOperacion;
import edu.uade.ioo.socio.dominio.TipoEmpresa;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

public class testing {
    public static void main(String[] args) {

        SocioProtector socPro1 = new SocioProtector("777-cuitsocPro1", "socPro1"
                , Instant.now()
                , TipoEmpresa.PEQUENA
                , "actividad"
                , "direccion"
                , "telefono"
                , "email"
                , 465);


        SocioProtector socPro2 = new SocioProtector("333-cuitsocPro2"
                , "socPro2"
                , Instant.now()
                , TipoEmpresa.MEDIANA
                , "actividad"
                , "direccion"
                , "telefono"
                , "email"
                , 12);


        SocioProtector socPro3 = new SocioProtector("222-cuitsocPro3"
                , "socPro3"
                , Instant.now()
                , TipoEmpresa.MEDIANA
                , "actividad"
                , "direccion"
                , "telefono"
                , "email"
                , 32);


        SocioParticipe socPar1 = new SocioParticipe("222-cuitParticipe11"
                , "socioparticipeRazon"
                , Instant.now()
                , TipoEmpresa.PEQUENA
                , "Venta insumos"
                , "direccion 124"
                , "telefono 532"
                , "email@lalal.com"
                , 13);


        SocioParticipe socPar2 = new SocioParticipe("432-cuitParticipe22"
                , "segundo socio participe"
                , Instant.now()
                , TipoEmpresa.MEDIANA
                , "Venta de Sal"
                , "otra dire 124"
                , "CABA 011 34223 2532"
                , "email@lalal.com"
                , 22);


        SocioParticipe socPar3 = new SocioParticipe("5234-cuitParticipe123"
                , "Ocho Anclas"
                , Instant.now()
                , TipoEmpresa.MEDIANA
                , "Alquiler de botes"
                , "Baiha Costa"
                , "CABA 011 34223 2532"
                , "email@lalal.com"
                , 22);


        Accionista accionista1 = new Accionista("Cuit accionista"
                , "razonSocial acc1"
                , 50.0);


        Accionista accionista2 = new Accionista("Cuit accionista"
                , "razonSocial acc2"
                , 30.0);

        socPro1.agregaAccionista(accionista1);
        socPro1.agregaAccionista(accionista2);
        socPro2.agregaAccionista(accionista1);
        socPro3.agregaAccionista(accionista2);


        System.out.println(" COMPARA ACCIONISTAS ");
        System.out.println(socPro2.comparteAccionista(socPro1));


        System.out.println("##########");
        System.out.println("##########");


        ControladorSGR sistemaPrincipal = new ControladorSGR();
        ControladorRegistro registroNuevo = new ControladorRegistro(sistemaPrincipal);

        Aportes aportePrueba = new Aportes(1000
                , new Date(10,
                10,
                10));

        Aportes aportePrueba2 = new Aportes(1000
                , new Date(100,
                10,
                10));

        Aportes aportePrueba3 = new Aportes(3000.51
                , new Date(119,
                10,
                10));

        Aportes aportePrueba4 = new Aportes(1650.65
                , new Date(119,
                01,
                10));
        Aportes aportePrueba5 = new Aportes(234650.65
                , new Date(119,
                01,
                10));


        socPro1.agregaAporte(aportePrueba);
        socPro1.agregaAporte(aportePrueba2);
        socPro1.agregaAporte(aportePrueba3);
        socPro1.agregaAporte(aportePrueba4);
        socPro1.agregaAporte(aportePrueba4);
        socPro1.agregaAporte(aportePrueba4);
        socPro2.agregaAporte(aportePrueba5);

        sistemaPrincipal.agregaSocioProtector(socPro1);
        sistemaPrincipal.agregaSocioProtector(socPro2);
        sistemaPrincipal.agregaSocioProtector(socPro3);


        sistemaPrincipal.agregaSocioParticipe(socPar1);
        sistemaPrincipal.agregaSocioParticipe(socPar2);
        sistemaPrincipal.agregaSocioParticipe(socPar3);
        sistemaPrincipal.agregaSocioParticipe(socPar3);
        sistemaPrincipal.agregaSocioParticipe(socPar3);


        System.out.println("Probemos cargar un socio protector");

        sistemaPrincipal.printSocios();


        System.out.println(sistemaPrincipal.calculaFDR());

        System.out.println("BuscaRSociosPor");

        System.out.println(sistemaPrincipal.getSocioParticipes().get(0));

        ArrayList<TipoOperacion> soloCheques = new ArrayList<>();
        soloCheques.add(TipoOperacion.CHEQUE);
        ArrayList<TipoOperacion> todasLasOperaciones = new ArrayList<>();
        todasLasOperaciones.add(TipoOperacion.CHEQUE);
        todasLasOperaciones.add(TipoOperacion.CUENTA);
        todasLasOperaciones.add(TipoOperacion.PRESTAMO);

        sistemaPrincipal.getSocioParticipes().get(0).activarSocio();
        sistemaPrincipal.getSocioParticipes().get(1).activarSocio();
        sistemaPrincipal.getSocioParticipes().get(2).activarSocio();

        sistemaPrincipal.getSocioParticipes().get(0).abrirLineaCredito(Instant.now().plus(30, ChronoUnit.DAYS),
                BigDecimal.valueOf(3000), soloCheques);

        sistemaPrincipal.getSocioParticipes().get(1).abrirLineaCredito(Instant.now().plus(30, ChronoUnit.DAYS),
            BigDecimal.valueOf(30000), todasLasOperaciones);


        sistemaPrincipal.getSocioParticipes().get(2).abrirLineaCredito(Instant.now().plus(30, ChronoUnit.DAYS),
            BigDecimal.valueOf(30000), todasLasOperaciones);

        System.out.println(socPar1.getLineaCredito().estaVigente());
        System.out.println(socPar2.getLineaCredito().estaVigente());
        System.out.println(socPar3.getLineaCredito().estaVigente());

        System.out.println(socPar1.getLineaCredito().getOperacionesValidas());
        System.out.println(socPar3.getLineaCredito().getOperacionesValidas());



        socPar1.getLineaCredito().crearOperacionCheque(
                                        BigDecimal.valueOf(1000)
                                        , Cheque.TipoCheque.PROPIO
                                        ,"Galicia"
                                        ,"Cheque Num 6351"
                                        ,new Date(121, 3, 3)
                                        ,"cuit32"
                                        ,0.5
                                            );



        socPar1.getLineaCredito().crearOperacionCheque(
                                        BigDecimal.valueOf(2000)
                                        , Cheque.TipoCheque.TERCERO
                                        ,"Galicia"
                                        ,"Cheque Num 6351"
                                        ,new Date(121, 3, 3)
                                        ,"cuit32"
                                        ,0.5
                                            );






        socPar3.getLineaCredito().crearOperacionCheque(
                                        BigDecimal.valueOf(200000000)
                                        , Cheque.TipoCheque.TERCERO
                                        ,"Galicia"
                                        ,"Cheque Num 6351"
                                        ,new Date(121, 3, 3)
                                        ,"cuit32"
                                        ,0.5
                                            );


        Operacion operacion1 =         socPar1.getLineaCredito().getOperaciones().get(0);
        System.out.println(operacion1);
        operacion1.emiteCertificado("cert-Num-42323");

        System.out.println(operacion1.getComision().calcularComision(Cheque.PORCENTAJE_COMISION, operacion1.getImporteDeOperacion()));



    }


}
