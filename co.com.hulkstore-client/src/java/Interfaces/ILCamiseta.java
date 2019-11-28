/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Dto.CamisetaDto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Elías Medina
 */
@Local
public interface ILCamiseta {
 public int crearCamiseta(CamisetaDto camisetaDto);
 public CamisetaDto actualizaCamiseta(CamisetaDto camisetaDto);
 public List<CamisetaDto> listCamiseta();
 public int deleteCamiseta(Integer id);
 
}
