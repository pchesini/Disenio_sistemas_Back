/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disenio.disenio.Controlador;

import com.disenio.disenio.Modelo.CertificadoAptitudTecnica;
import com.disenio.disenio.Service.ICertificadoDeAptitudTecnicaService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/certificadoAptitudTecnica")
public class CertificadoAptitudTecnicaController {
    @Autowired
    private ICertificadoDeAptitudTecnicaService certificadoATI;

    @GetMapping("/consulta")
    public List<CertificadoAptitudTecnica> getCertificadoAptitudTecnica(){

        return certificadoATI.getCertificadoAptitudTecnica();
    }

    @PostMapping("/alta")
    public String saveCertificadoAptitudTecnica(@RequestBody CertificadoAptitudTecnica of){
        certificadoATI.saveCertificadoAptitudTecnica(of);
        return "Se creo el Certificado de aptitud técnica Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteCertificadoAptitudTecnica(@PathVariable Long id) {
        certificadoATI.deleteCertificadoAptitudTecnica(id);
        return " Certificado de aptitud técnica Eliminado";
    }

    @PutMapping ("/editar/{id}")
    public CertificadoAptitudTecnica editarCertificadoAptitudTecnica(@PathVariable Long id,
                                                                     @RequestParam("aptitudDelEmpleo") String nuevaAptitudDelEmpleo,
                                                                     @RequestParam("vencimiento") @DateTimeFormat(pattern = "dd-MM-yyyy") Date nuevoVencimiento,
                                                                     @RequestParam("denominacionComercial") String nuevaDenominacionComercial ,
                                                                     @RequestParam("direccion") String nuevaDireccion,
                                                                     @RequestParam("email") String nuevoemail,
                                                                     @RequestParam("numCat") String nuevoNumCat,
                                                                     @RequestParam("telefono") String nuevoTelefono,
                                                                     @RequestParam("titular") String nuevoTitular
    )
    {
        CertificadoAptitudTecnica certificadoAT = certificadoATI.buscarCertificadoAptitudTecnica(0);
        certificadoAT.setAptitudDelEmpleo(nuevaAptitudDelEmpleo);
        java.sql.Date ConvertirASql = new java.sql.Date(nuevoVencimiento.getTime());
        certificadoAT.setVencimiento(ConvertirASql);
        certificadoAT.setDenominacionComercial(nuevaDenominacionComercial);
        certificadoAT.setDireccion(nuevaDireccion);
        certificadoAT.setEmail(nuevoemail);
        certificadoAT.setNumCat(nuevoNumCat);
        certificadoAT.setTelefono(nuevoTelefono);
        certificadoAT.setTitular(nuevoTitular);

        certificadoATI.saveCertificadoAptitudTecnica(certificadoAT);

        return certificadoAT;
    }
}
