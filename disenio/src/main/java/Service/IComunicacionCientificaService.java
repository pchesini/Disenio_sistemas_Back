/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Modelo.ComunicacionCientifica;
import java.util.List;

public interface IComunicacionCientificaService {
     public List<ComunicacionCientifica> getComunicacionCientifica();
    public void saveComunicacionCientifica(ComunicacionCientifica of);
    public void deleteComunicacionCientifica(Long id);
    public ComunicacionCientifica buscarComunicacionCientifica(long id);
}
