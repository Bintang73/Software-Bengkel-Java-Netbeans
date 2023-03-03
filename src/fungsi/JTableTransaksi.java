package fungsi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import transaksi.mytransaksi;

public class JTableTransaksi extends AbstractTableModel {
   List<mytransaksi> list = new ArrayList<>();
   
   public void add(mytransaksi trn)
   {
       list.add(trn);
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
       return 13;
   }
   
   @Override
   public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex)
       {
           case 0 : return list.get(rowIndex).getKodeTransaksi();
           case 1 : return list.get(rowIndex).getKodeBarang();
           case 2 : return list.get(rowIndex).getId();
           case 3 : return list.get(rowIndex).getNamaBarang();
           case 4 : return list.get(rowIndex).getNamaPembeli();
           case 5 : return list.get(rowIndex).getHarga();
           case 6 : return list.get(rowIndex).getJumlah();
           case 7 : return list.get(rowIndex).getTotal();
           case 8 : return list.get(rowIndex).getUang();
           case 9 : return list.get(rowIndex).getKembalian();
           case 10 : return list.get(rowIndex).getNamaMontir();
           case 11 : return list.get(rowIndex).getKodeMontir();
           case 12 : return list.get(rowIndex).getTanggal();
           
           

           
           default : return null;
       }
   }
   
   @Override
   public String getColumnName (int column)
   {
       switch(column)
       {
           case 0 : return "Kode Transaksi";
           case 1 : return "KODE BARANG";
           case 2 : return "ID";
           case 3 : return "NAMA BARANG";
           case 4 : return "NAMA PEMBELI";
           case 5 : return "HARGA";
           case 6 : return "JUMLAH";
           case 7 : return "TOTAL BAYAR";
           case 8 : return "UANG PEMBELI";
           case 9 : return "KEMBALIAN";
           case 10 : return "NAMA MONTIR";
           case 11 : return "KODE MONTIR";
           case 12 : return "TANGGAL";
           
           
           default : return null;
       }
   }
   
   public void removeRow(int i, int l)
   {
       list.remove(i);
       fireTableRowsDeleted(i,l);
   }
}