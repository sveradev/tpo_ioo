package edu.uade.ioo.utils;

import edu.uade.ioo.usuario.dominio.Historial;
import edu.uade.ioo.usuario.dominio.Registro;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class MiTableModel extends AbstractTableModel {
    private List<Registro> lista= new ArrayList<Registro>();

    protected String[] columnNames = new String[] {"UUID"
            , "Fecha"
            , "Usuario"
            , "Estado Anterior"
            , "Estado Nuevo"};
    protected Class[] columnClasses = new Class[] {String.class
            , String.class
            , String.class
            , String.class
            , String.class
            , String.class};

    public String getColumnName(int col){
        return columnNames[col];
    }

    public Class getColumnClass(int col){
        return columnClasses[col];
    }


    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return lista.get(rowIndex).getReferencia();
            case 1: return lista.get(rowIndex).getFechaRegistro();
            case 2: return lista.get(rowIndex).getUsuario();
            case 3: return lista.get(rowIndex).getEstadoAnterior();
            case 4: return lista.get(rowIndex).getEstadoNuevo();
            default: return null;
        }
    }

    public void cargarSocios(){
        lista = Historial.registroSocios;
    }
}
