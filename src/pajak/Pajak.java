
package pajak;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pajak {
    public enum jabatan {
        GENERALMANAGER, MANAGER, ASSISTANTMANAGER, SENIORMANAGER, JUNIORMANAGER, TEKNISI, DRIVER
    }
    public double hitungBiayaJabatan(jabatan namaJabatan, String tanggalPengangkatan, String tanggalPerhitungan) {
        double biayaJabatan;
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/y"); 
        LocalDate localDatePengangkatan = LocalDate.parse(tanggalPengangkatan, formatter);
        LocalDate localDatePerhitungan = LocalDate.parse(tanggalPerhitungan, formatter);  
        
        int tahunPengangkatan = localDatePengangkatan.getYear();
        int tahunPerhitungan = localDatePerhitungan.getYear();
        int bulanPengangkatan = localDatePengangkatan.getMonthValue();
        int bulanPerhitungan = localDatePerhitungan.getMonthValue();
            
        if(localDatePerhitungan.compareTo(localDatePengangkatan) > 0) {
            int jumlahBulan;
            if(tahunPerhitungan == tahunPengangkatan){
                jumlahBulan = bulanPerhitungan - bulanPengangkatan;
            
            } else {
                    jumlahBulan = bulanPerhitungan - 1;
            }
            double gajiPokokPerBulan;
            double tunjanganJabatanPerBulan;
            if(namaJabatan == jabatan.GENERALMANAGER) {
                gajiPokokPerBulan = 9_000_000;
                tunjanganJabatanPerBulan = 5_000_000;
            } else if(namaJabatan == jabatan.MANAGER) {
                gajiPokokPerBulan = 8_000_000;
                tunjanganJabatanPerBulan = 4_000_000;
            } else if(namaJabatan == jabatan.ASSISTANTMANAGER) {
                gajiPokokPerBulan = 6000000;
                tunjanganJabatanPerBulan = 3000000;
            } else if(namaJabatan == jabatan.SENIORMANAGER) {
                gajiPokokPerBulan = 3500000;
                tunjanganJabatanPerBulan = 2000000;
            } else if(namaJabatan == jabatan.JUNIORMANAGER) {
                gajiPokokPerBulan = 3000000;
                tunjanganJabatanPerBulan = 1500000;
            } else if(namaJabatan == jabatan.TEKNISI) {
                gajiPokokPerBulan = 2000000;
                tunjanganJabatanPerBulan = 1000000;
            } else if(namaJabatan == jabatan.DRIVER) {
                gajiPokokPerBulan = 1500000;
                tunjanganJabatanPerBulan = 750000;
            } 
            else {
            gajiPokokPerBulan = 1500000;
            tunjanganJabatanPerBulan = 750000;
            }
            
            double JKK = gajiPokokPerBulan * 0.24 / 100.0;
            double JKM = gajiPokokPerBulan * 0.3 / 100.0;
            double JHT = gajiPokokPerBulan * 3.74 / 100.0;
            double BPJSKesehatan = gajiPokokPerBulan * 4 / 100.0;
     
            double penghasilanBrutoSetahun = jumlahBulan * (gajiPokokPerBulan + tunjanganJabatanPerBulan + JKK + JKM + JHT + BPJSKesehatan);
            biayaJabatan = penghasilanBrutoSetahun * 5.0 / 100.0;    
            if(biayaJabatan > 6000000) 
                biayaJabatan = 6000000;   
        }
        else{
            biayaJabatan = 0;    
        }
        return biayaJabatan;
        
    }
}
