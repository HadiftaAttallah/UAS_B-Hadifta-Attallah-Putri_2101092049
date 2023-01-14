/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.model;

/**
 *
 * @author user
 */
import UAS_B.model.PelangganDao;
import UAS_B.model.Pelanggan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class PelangganDaoImpl implements PelangganDao {
     private List<Pelanggan> data = new ArrayList<>();

    

    public PelangganDaoImpl() {
     data.add(new Pelanggan("2002","HadiftaAttallah",1));
        data.add(new Pelanggan("2003","AttallahPutri",2));
        data.add(new Pelanggan("2004","Caramel",1));
    }
    
    
    public Pelanggan save(Pelanggan pelanggan) {
        data.add(pelanggan);
        return pelanggan;
    }

    
    public Pelanggan update(int index, Pelanggan pelanggan) {
    data.set(index,pelanggan);
        return pelanggan;
    }

    public Pelanggan delete(int index) {
        return data.remove(index);

    }

    
    public Pelanggan getPelanggan(int index) {
        return data.get(index);
    }

    public List<Pelanggan> getAllPelanggan() {
        return data;
    }

  
    
    
    
    
}