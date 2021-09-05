/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1306180005.proje;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Ugur
 */
public class fonksiyonlar {
    interface back{
    public void geri();
    }
    
    interface giris{
        public ResultSet giris(String a,String b,ResultSet rs);
    }
    
    interface panel{
        public void panel();
    }
    
    abstract class geri{
    abstract void back();
    }
    
    abstract class mainGiris{
    abstract void giris1();
    }
    
    static class anaGiris extends mainGiris{

        @Override
        void giris1() {
            new Giris().setVisible(true);
        }
    
    }
    
    static class musteriPanel extends geri {

        @Override
        void back() {
            new musteri_islemler().setVisible(true);
        }
        
    }
    
    static class adminPanel extends javax.swing.JFrame implements panel{

        @Override
        public void panel() {
            new admin_panel().setVisible(true);
        }
    
    }
    
    static class calisanPanel extends javax.swing.JFrame implements back{

        @Override
        public void geri() {
          new calisan_panel().setVisible(true);

        }      
    }
    
    static class musteriLogin extends musteri_giris implements giris{

        @Override
        public ResultSet giris(String a,String b,ResultSet rs) {
        
        try{    
        conn c1 = new conn();
            
            String q  = "select * from login where cardno = '"+a+"' and pin = '"+b+"'";
            rs = c1.s.executeQuery(q);
            return rs;
        }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("hata: "+e);
        }
         return rs;
    }
        }
    
    static class adminLogin extends yonetici_giris implements giris{

        @Override
        public ResultSet giris(String a, String b,ResultSet rs) {
             try{    
        conn c1 = new conn();
            
            String q  = "select * from yonetici where kullanici = '"+a+"' and sifre = '"+b+"'";
            rs = c1.s.executeQuery(q);
            return rs;
        }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("hata: "+e);
        }
         return rs;
        }
        
    }
    
    static class calisanLogin extends calisan_giris implements giris{

        @Override
        public ResultSet giris(String a, String b,ResultSet rs) {
            try{    
        conn c1 = new conn();
            
            String q  = "select * from calisan where kullanici = '"+a+"' and sifre = '"+b+"'";
            rs = c1.s.executeQuery(q);
           
        }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("hata: "+e);
        }
             return rs;
        }
    }
    
    static class panelGeri{
        void panelBack(){
        }
    }
    
    static class adminPanelGeri extends panelGeri{
        void panelBack(){
        new admin_panel().setVisible(true);
        }
    }
    
    static class musteriPanelGeri extends panelGeri{
    void panelBack(){
        new musteri_islemler().setVisible(true);
            }
        }
    
    
    static class calisanPanelGeri extends panelGeri{
    void panelBack(){
        new calisan_panel().setVisible(true);
            }
        }
    
    }
    



