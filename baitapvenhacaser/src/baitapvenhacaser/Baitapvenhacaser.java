/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapvenhacaser;

/**
 *
 * @author Legon
 */
public class Baitapvenhacaser {
String plaintext;
int key = 13;

    public Baitapvenhacaser(String plaintext) {
        this.plaintext = plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    public String emcrypt(){
        char[] charArray = plaintext.toCharArray();
         for(int i = 0; i < charArray.length; i++) {
             charArray[i]=(char) (charArray[i]+key);
         }
        return plaintext;
    }
        public String decrypt(String s2, int key) {
            char[] charArray = s2.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
             charArray[i]=(char) (charArray[i]-key);
         }
        return s2;
        }
    }
    

