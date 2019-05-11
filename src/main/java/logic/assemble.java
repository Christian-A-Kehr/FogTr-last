/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.Beam;
import data.Carport;
import data.DataAccessor;
import data.Material;
import data.Rafter;
import data.Roof;
import data.Rooftiles;
import data.Shed;
import data.WoodPost;

/**
 *
 * @author Christian Ambjørn Kehr
 */
public class assemble {
    private final Calculate CAL = new Calculate();
    private final DataAccessor DATAACC = new DataAccessor();
    
    private Roof roof;
    private Shed shed;
    private Rafter rafter;
    private Beam beam;
    private WoodPost woodpost;
    private int height, lenght, width;
    
    public Carport assembleCarport(Carport carport) {
        roof = createRoof(carport);
        shed = createShed(carport)
        rafter = createRafter(carport)
        woodpost = createWoodpost(carport)

        
        
        Carport newCarport = new Carport(carport.getHeight(), carport.getLength(), carport.getWidth(), roof, shed);
    }

    public int getRoofHeight(Carport carport) {
        // How to find roof height
        if (carport.getRoof().getType().equals("Med rejsning")) {
            height = CAL.calulateGabledHeight(carport);
        } else {
            height = 15; // 15 bør ændres til en variable, så de kan vælge tillæget af et fladt tag hvis der er tid    
        }
        return height;
    }

    private Roof createRoof(Carport carport) {
        
        Roof roof = new Roof(carport.getRoof().getType(),carport.getRoof().getMaterial(),
                            carport.getRoof().getAngle(),
                            CAL.calulateGabledHeight(carport),
                            carport.getLength(), carport.getWidth(),
                            beam, rafter, woodpost, rafter)
       return  roof;
    }

    private Shed createShed(Carport carport) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Rafter createRafter(Carport carport) {
        rafter = new Rafter(material, height, height, height, height, height, height)
        
        return rafter;
    }

    private WoodPost createWoodpost(Carport carport) {
         Material mat = DATAACC.getMaterialFromId(carport.getRoof().getWoodpost().getId());
         woodpost = new WoodPost(carport.getRoof().getWoodpost().getMaterial(),
                                carport.getRoof().getWoodpost().getLength(),
                                carport.getRoof().getWoodpost().getWidth(),
                                carport.getRoof().getWoodpost().getId(),
                                CAL.WoodPostNeeded(carport),
                                mat.getPrice());
         return woodpost;
    }

    private Beam createBeam(Carport carport) {
        Material mat = DATAACC.getMaterialFromId(carport.getRoof().getBeam().getId());
        beam = new Beam(carport.getRoof().getBeam().getMaterial(),
                             carport.getRoof().getBeam().getLength(),
                             carport.getRoof().getBeam().getHeight(),
                             carport.getRoof().getBeam().getWidth(),
                             carport.getRoof().getBeam().getId(),
                             CAL.BeamsNeeded(carport) ,
                             mat.getPrice());
        return beam;
    }
}
