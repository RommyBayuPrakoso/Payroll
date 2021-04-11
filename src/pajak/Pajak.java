
package pajak;

public class Pajak {
    public double hitungBiayaJabatan(enum namaJabatan, Sring tanggalPengangkatanJabtan, String tanggalPerhitunganBiayaJabatan){
       double  biayaJabatan;
       
       DateTimeFormatter formatter = DateTimeFormatter("d/M/y");
       
       LocalData LocalDataPengangkatan = LocalData.parse(tanggalPengangkatan, formatter);
       LocalData LocalDataPerhitungan = LocalData.parse(tanggalPerhitungan, formatter);
       
       int hasilPerbandinganTanggal = LocalDataPerhitungan.compareTo(localDataPengangkatan);
       if(hasilPerbandinganTanggal > 0){
           int tahunPengangkatan = localDataPengangkatan.getYear();
           int tahunPerhitungan = localDataPerhitungan.getYear();
           int bulanPengangkatan = localDataPengangkatan.getMonthValue();
           int bulanPerhitungan = localDataPerhitungan.getMonthValue();
           
        if (tanggalPerhitungan > tangalPengangkatan){
               
            if(tahunPengangkatan == tahunPerhitungan){
                jumlahBulan = bulanPerhitungan - bulanPengangkatan
            }else 
                jumlahBulan = bulanPerhitungan - 1 ;
            
            if(namaJabatan == jabatan.GENEALMANAGER){
                    gajiPokok = 9000000;
                    tunjanganJabatan = 5000000;
            }else if(namaJabatan == jabatan.MANAGER){
            }else if(namaJabatan == jabatan.GENERALMANAGER){
            }else if(namaJabatan == jabatan.ASSISTANTMANAGER){
            }else if(namaJabatan == jabatan.SENIORENGINEER){
            }else if(namaJabatan == jabatan.JUNIORENGINEER){
            }else if(namaJabatan == jabatan.TEKNISI){
            }else if(namaJabatan == jabatan.DREIVER)
            
                    
            JKK= 8000000 * 0.24%;
            JKM= 8000000 * 0.3%;
            JHT= 8000000 * 3.74%;
            BPJS Kesehatan =  * 4%;
              
            penghasilanBrutoSetahun = jumlahBulan * (8000000 + 4000000 + JKK + JKM + JHT + BPJS Kesehatan);
            
            if(biayaJabatan >= 6000000)
                biayaJaatan = 6000000;
        }else
            biayaJabatan = 0;
       }
      
    return biayaJabatan;                
    }

