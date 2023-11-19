/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Modelo.CertificadoAptitudTecnica;
import java.util.List;


public interface ICertificadoDeAptitudTecnicaService {
    public List<CertificadoAptitudTecnica> getCertificadoAptitudTecnica();
    public void saveCertificadoAptitudTecnica(CertificadoAptitudTecnica of);
    public void deleteCertificadoAptitudTecnica(Long id);
    public CertificadoAptitudTecnica buscarCertificadoAptitudTecnica(long id);
}
