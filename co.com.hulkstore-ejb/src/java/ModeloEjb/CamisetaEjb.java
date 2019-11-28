package ModeloEjb;


import Dto.CamisetaDto;
import Interfaces.ILCamiseta;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elías Medina
 */
@Stateless(name = "CamisetaEjb", mappedName = "CamisetaEjb")
@LocalBean
public class CamisetaEjb implements ILCamiseta{

    @Override
    public int crearCamiseta(CamisetaDto camisetaDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CamisetaDto actualizaCamiseta(CamisetaDto camisetaDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CamisetaDto> listCamiseta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteCamiseta(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
