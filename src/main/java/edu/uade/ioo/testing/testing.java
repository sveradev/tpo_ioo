package edu.uade.ioo.testing;

import edu.uade.ioo.Controller.ControladorRegistro;
import edu.uade.ioo.Controller.ControladorSGR;

import edu.uade.ioo.Socios.Accionista;
import edu.uade.ioo.Socios.Aportes;
import edu.uade.ioo.Socios.EstadoDocumentacion;
import edu.uade.ioo.Socios.SocioParticipe;
import edu.uade.ioo.Socios.SocioProtector;
import edu.uade.ioo.lineasYoperaciones.Cheque;
import edu.uade.ioo.lineasYoperaciones.Operacion;
import edu.uade.ioo.lineasYoperaciones.TipoOperacion;

import java.util.ArrayList;
import java.util.Date;

public class testing {
    public static void main(String[] args) {

        SocioProtector socPro1 = new SocioProtector("777-cuitsocPro1", "socPro1"
                , new Date(110, 10, 10)
                , "tipo"
                , "actividad"
                , "direccion"
                , "telefono"
                , "email"
                , new Date(115, 10, 10)
                , EstadoDocumentacion.INGRESADO
                , "usuarioIngreso"
                , 465);


        SocioProtector socPro2 = new SocioProtector("333-cuitsocPro2"
                , "socPro2"
                , new Date(110, 10, 10)
                , "tipo"
                , "actividad"
                , "direccion"
                , "telefono"
                , "email"
                , new Date(115, 10, 10)
                , EstadoDocumentacion.INGRESADO
                , "usuarioIngreso"
                , 12);


        SocioProtector socPro3 = new SocioProtector("222-cuitsocPro3"
                , "socPro3"
                , new Date(110, 10, 10)
                , "tipo"
                , "actividad"
                , "direccion"
                , "telefono"
                , "email"
                , new Date(115, 10, 10)
                , EstadoDocumentacion.INGRESADO
                , "usuarioIngreso"
                , 32);


        SocioParticipe socPar1 = new SocioParticipe("222-cuitParticipe11"
                , "socioparticipeRazon"
                , new Date(110, 10, 10)
                , "Pequenna"
                , "Venta insumos"
                , "direccion 124"
                , "telefono 532"
                , "email@lalal.com"
                , new Date(115, 10, 10)
                , EstadoDocumentacion.INGRESADO
                , "usuarioIngreso"
                , 13);


        SocioParticipe socPar2 = new SocioParticipe("432-cuitParticipe22"
                , "segundo socio participe"
                , new Date(110, 10, 10)
                , "Mediana"
                , "Venta de Sal"
                , "otra dire 124"
                , "CABA 011 34223 2532"
                , "email@lalal.com"
                , new Date(115, 10, 10)
                , EstadoDocumentacion.INGRESADO
                , "sebasTopu"
                , 22);


        SocioParticipe socPar3 = new SocioParticipe("5234-cuitParticipe123"
                , "Ocho Anclas"
                , new Date(110, 10, 10)
                , "Mediana"
                , "Alquiler de botes"
                , "Baiha Costa"
                , "CABA 011 34223 2532"
                , "email@lalal.com"
                , new Date(114, 10, 10)
                , EstadoDocumentacion.INGRESADO
                , "sebasTopu"
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

        sistemaPrincipal.getSocioParticipes().get(0).setPleno(true);
        sistemaPrincipal.getSocioParticipes().get(1).setPleno(true);
        sistemaPrincipal.getSocioParticipes().get(2).setPleno(true);

        sistemaPrincipal.getSocioParticipes().get(0).abrirLineaCredito(new Date(124, 01, 01),
                3000, soloCheques);

        sistemaPrincipal.getSocioParticipes().get(1).abrirLineaCredito(new Date(125, 01, 01),
                30000, todasLasOperaciones);


        sistemaPrincipal.getSocioParticipes().get(2).abrirLineaCredito(new Date(100, 01, 01),
                30000, todasLasOperaciones);

        System.out.println(socPar1.getLineaCredito().estaVigente());
        System.out.println(socPar2.getLineaCredito().estaVigente());
        System.out.println(socPar3.getLineaCredito().estaVigente());

        System.out.println(socPar1.getLineaCredito().getOperacionesValidas());
        System.out.println(socPar3.getLineaCredito().getOperacionesValidas());



        socPar1.getLineaCredito().crearOperacionCheque(
                                        1000
                                        , Cheque.TipoCheque.PROPIO
                                        ,"Galicia"
                                        ,"Cheque Num 6351"
                                        ,new Date(121, 3, 3)
                                        ,"cuit32"
                                        ,0.5
                                            );



        socPar1.getLineaCredito().crearOperacionCheque(
                                        2000
                                        , Cheque.TipoCheque.TERCERO
                                        ,"Galicia"
                                        ,"Cheque Num 6351"
                                        ,new Date(121, 3, 3)
                                        ,"cuit32"
                                        ,0.5
                                            );






        socPar3.getLineaCredito().crearOperacionCheque(
                                        200000000
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
