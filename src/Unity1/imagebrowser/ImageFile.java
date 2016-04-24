/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.imagebrowser;

/**
 *
 * @author Acer
 */
public class ImageFile {
       protected String name;
    protected ImageFile next,back;
    
    public ImageFile(String name){
        
        this.name= name;
        next= null;
        back=null;
    }
}
