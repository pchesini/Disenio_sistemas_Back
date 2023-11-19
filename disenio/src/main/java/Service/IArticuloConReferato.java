/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Modelo.ArticuloConReferato;
import java.util.List;


public interface IArticuloConReferato {
      public List<ArticuloConReferato> getArticuloConReferato();
    public void saveArticuloConReferato(ArticuloConReferato of);
    public void deleteArticuloConReferato(Long id);
    public ArticuloConReferato buscarArticuloConReferato(long id);

}
