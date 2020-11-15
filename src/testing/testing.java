package testing;

import Controller.ControladorRegistro;
import Controller.ControladorSGR;
import Socios.Accionista;
import Socios.Aportes;
import Socios.EstadoDocumentacion;
import Socios.SocioProtector;

import java.util.Date;

public class testing {
    public static void main(String[] args) {

        SocioProtector socPro1 = new SocioProtector("777-cuitsocPro1" ,"socPro1"
                ,new Date(110,10,10)
                ,"tipo"
                ,"actividad"
                ,"direccion"
                ,"telefono"
                ,"email"
                ,new Date (115,10,10)
                , EstadoDocumentacion.INGRESADO
                ,"usuarioIngreso"
                ,465);



        SocioProtector socPro2 = new SocioProtector("333-cuitsocPro2" ,"socPro2"
                ,new Date(110,10,10)
                ,"tipo"
                ,"actividad"
                ,"direccion"
                ,"telefono"
                ,"email"
                ,new Date (115,10,10)
                , EstadoDocumentacion.INGRESADO
                ,"usuarioIngreso"
                ,465);



        SocioProtector socPro3 = new SocioProtector("222-cuitsocPro3" ,"socPro3"
                ,new Date(110,10,10)
                ,"tipo"
                ,"actividad"
                ,"direccion"
                ,"telefono"
                ,"email"
                ,new Date (115,10,10)
                , EstadoDocumentacion.INGRESADO
                ,"usuarioIngreso"
                ,465);


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


        socPro1.agregaAporte(aportePrueba);
        socPro1.agregaAporte(aportePrueba2);
        socPro1.agregaAporte(aportePrueba3);
        socPro1.agregaAporte(aportePrueba4);
        socPro1.agregaAporte(aportePrueba4);
        socPro1.agregaAporte(aportePrueba4);

        sistemaPrincipal.agregaSocioProtector(socPro1);
        sistemaPrincipal.agregaSocioProtector(socPro2);
        sistemaPrincipal.agregaSocioProtector(socPro3);

        System.out.println("Probemos cargar un socio protector");

        sistemaPrincipal.printSocios();


        System.out.println(sistemaPrincipal.calculaFDR());

        System.out.println("BuscaRSociosPor");

        System.out.println(new Date());


    }


}
