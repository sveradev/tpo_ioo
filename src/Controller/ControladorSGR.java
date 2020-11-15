package Controller;

import Socios.Aportes;
import Socios.Socio;
import Socios.SocioParticipe;
import Socios.SocioProtector;

import java.util.ArrayList;
import java.util.List;

public  class  ControladorSGR {
    private static List<SocioParticipe> socioParticipes;
    private static List<SocioProtector> socioProtectores;

    public ControladorSGR() {
        socioParticipes = new ArrayList<>();
        socioProtectores = new ArrayList<>();
    }

    public List<SocioParticipe> getSocioParticipes() {
        return socioParticipes;
    }

    public List<SocioProtector> getSocioProtectores() {
        return socioProtectores;
    }

    public static double calculaFDR() {
        double totalFdr = 0;
        for (SocioProtector socioProtector : socioProtectores) {
            for (Aportes aporte : socioProtector.getAportes()) {
                if (aporte.esVigente()){
                    totalFdr += aporte.getImporte();
                }
            }
        }
        return totalFdr;
    }

    public boolean agregaSocioParticipe(SocioParticipe nuevoSocioParticipe) {
        if (socioParticipes.contains(nuevoSocioParticipe)) {
            return false;
        } else {
            socioParticipes.add(nuevoSocioParticipe);
            return true;
        }
    }

    public boolean agregaSocioProtector(SocioProtector nuevoSocioProtector) {
        if (socioProtectores.contains(nuevoSocioProtector)) {
            return false;
        } else {
            socioProtectores.add(nuevoSocioProtector);
            return true;
        }
    }


    public void printSocios() {
        System.out.println("Socios Participes");
        for (Socio socio : socioParticipes) {
            System.out.println(socio);
        }
        System.out.println("Socio Protectores");
        for (Socio socio : socioProtectores) {
            System.out.println(socio);
        }

    }
}
