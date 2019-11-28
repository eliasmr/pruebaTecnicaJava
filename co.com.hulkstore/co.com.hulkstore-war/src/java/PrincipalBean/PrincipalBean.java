package PrincipalBean;

/**
 *
 * @author Elías.Medina
 */
import Dto.CamisetaDto;
import Interfaces.ILCamiseta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "PrincipalBean")
public class PrincipalBean implements Serializable {

    private static final long serialVersionUID = 1L;

   @EJB
   public ILCamiseta iLCamiseta;

    private CamisetaDto camisetaDto;
    private List<CamisetaDto> ListcamisetaDto;

    @PostConstruct
    public void init() {
        this.camisetaDto = new CamisetaDto();
        this.ListcamisetaDto = new ArrayList<>();
    }

    public void crearCamiseta(CamisetaDto camisetaDto) {
        try {
            iLCamiseta.crearCamiseta(camisetaDto);
            String prueba = "bb";
        } catch (Exception e) {
        }

    }

    public void listCamiseta() {
        try {
           ListcamisetaDto = iLCamiseta.listCamiseta();
        } catch (Exception e) {
        }
    }

    public void actualizarCamiseta(CamisetaDto camisetaDto) {
        try {
            iLCamiseta.actualizaCamiseta(camisetaDto);
        } catch (Exception e) {
        }
    }

    public void deleteCamiseta(Integer id){
        try {
            iLCamiseta.deleteCamiseta(id);
        } catch (Exception e) {
        }
    }
    public CamisetaDto getCamisetaDto() {
        return camisetaDto;
    }

    public void setCamisetaDto(CamisetaDto camisetaDto) {
        this.camisetaDto = camisetaDto;
    }

    public List<CamisetaDto> getListcamisetaDto() {
        return ListcamisetaDto;
    }

    public void setListcamisetaDto(List<CamisetaDto> ListcamisetaDto) {
        this.ListcamisetaDto = ListcamisetaDto;
    }
}
