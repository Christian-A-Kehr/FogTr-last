/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import data.Beam;
import data.Carport;
import data.Floor;
import data.Rafter;
import data.Roof;
import data.Shed;
import data.WallCoverings;
import data.WoodPost;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.Facade;
import logic.FogException;

/**
 *
 * @author Mkhansen
 */
public class CreateOffer extends Command {

    private Facade logic = new Facade();

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws FogException {
        HttpSession session = request.getSession();
            int height = Integer.parseInt(request.getParameter("height"));
            int length = Integer.parseInt(request.getParameter("height"));
            int width = Integer.parseInt(request.getParameter("height"));
            int shedWidth = Integer.parseInt(request.getParameter("shedDepth"));
            int shedDepth = Integer.parseInt(request.getParameter("shedWidth"));
            

//            WallCoverings wallCoverings = new WallCoverings(request.getParameter("shedChoice"),height , shedDepth, shedWidth);
//            Floor floor = new Floor(request.getParameter("floorChoice"), shedDepth, shedWidth);
//            Shed shed = new Shed(shedDepth, shedWidth, wallCoverings, floor);
//            
//            Beam beam = new Beam(request.getParameter("beamChoice"), Integer.parseInt(request.getParameter("length")));
//            Rafter rafter = new Rafter(request.getParameter("rafterChoice"), Integer.parseInt(request.getParameter("width")));
//            WoodPost woodpost = new WoodPost(request.getParameter("woodpostChoice"), Integer.parseInt(request.getParameter("height")));
//            Roof roof = new Roof(request.getParameter("flatOrNot"), request.getParameter("roofChoice"), Integer.parseInt(request.getParameter("angleChoice")), Integer.parseInt(request.getParameter("length")), Integer.parseInt(request.getParameter("width")), beam, rafter, woodpost);
//            Carport carport = new Carport(Integer.parseInt(request.getParameter("height")), Integer.parseInt(request.getParameter("length")), Integer.parseInt(request.getParameter("width")), roof, shed);

        return "test";
    }
}
