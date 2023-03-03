
package fungsi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import barang.mybarang;


public class JTableBarang extends AbstractTableModel {
   List<mybarang> list = new ArrayList<>();
   
   public void add(mybarang bar)
   {
       list.add(bar);
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
       return 4;
   }
   
   @Override
   public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex)
       {
           case 0 : return list.get(rowIndex).getKode();
           case 1 : return list.get(rowIndex).getNama();
           case 2 : return list.get(rowIndex).getHarga();
           case 3 : return list.get(rowIndex).getStok();

           
           default : return null;
       }
   }
   
   @Override
   public String getColumnName (int column)
   {
       switch(column)
       {
           case 0 : return "KODE BARANG";
           case 1 : return "NAMA BARANG";
           case 2 : return "HARGA";
           case 3 : return "STOK";
           default : return null;
       }
   }
   
   public void removeRow(int i, int l)
   {
       list.remove(i);
       fireTableRowsDeleted(i,l);
   }
}
