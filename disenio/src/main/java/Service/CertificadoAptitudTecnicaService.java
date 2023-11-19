/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Modelo.CertificadoAptitudTecnica;
import Repository.CertificadoAptitudTecnicaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificadoAptitudTecnicaService implements ICertificadoDeAptitudTecnicaService{
    
    @Autowired
    private CertificadoAptitudTecnicaRepository certificadoATR;

    @Override
    public List<CertificadoAptitudTecnica> getCertificadoAptitudTecnica() {
        List<CertificadoAptitudTecnica> listaCertificadosAT = certificadoATR.findAll();
        return listaCertificadosAT;    }

    @Override
    public void saveCertificadoAptitudTecnica(CertificadoAptitudTecnica of) {
        certificadoATR.save(of);
    }

    @Override
    public void deleteCertificadoAptitudTecnica(Long id) {
        certificadoATR.deleteById(id);
    }

    @Override
    public CertificadoAptitudTecnica buscarCertificadoAptitudTecnica(long id) {
        CertificadoAptitudTecnica certificadoAT= certificadoATR.findById(id).orElse(null);
        return certificadoAT;    }
    
}
