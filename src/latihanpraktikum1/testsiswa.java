/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpraktikum1;

/**
 *
 * @author Asus
 */
public class testsiswa {
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Rensi"); 
        siswa.setAge(15);
        siswa.setAddress("Kediri");
        System.out.println("Name : "+ siswa.getName());
        System.out.println("Age : "+siswa.getAge());
        System.out.println("Addres : "+siswa.getAdsress());
    }
}
