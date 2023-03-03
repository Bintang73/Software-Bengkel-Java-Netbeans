
package fungsi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import montir.mymontir;


public class JTableMontir extends AbstractTableModel {
   List<mymontir> list = new ArrayList<>();
   
   public void add(mymontir mon)
   {
       list.add(mon);
       fireTableRowsInserted(getRowCount(), getColumnCount());
   }
   
   @Override
   public int getRowCount()
   {
       return list.size();
   }
   
   @Override
   public int getColumnCount()
   {
       return 5;
   }
   
   @Override
   public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex)
       {
           case 0 : return list.get(rowIndex).getKode();
           case 1 : return list.get(rowIndex).getNama();
           case 2 : return list.get(rowIndex).getAlamat();
           case 3 : return list.get(rowIndex).getTelp();
           case 4 : return list.get(rowIndex).getEmail();

           
           default : return null;
       }
   }
   
   @Override
   public String getColumnName (int column)
   {
       switch(column)
       {
           case 0 : return "KODE MONTIR";
           case 1 : return "NAMA MONTIR";
           case 2 : return "ALAMAT";
           case 3 : return "NO TELEPON";
           case 4 : return "EMAIL";
           
           default : return null;
       }
   }
   
   public void removeRow(int i, int l)
   {
       list.remove(i);
       fireTableRowsDeleted(i,l);
   }

    public int getSelectedRow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}