package atv1.certificados;

import atv1.classesPrincipais.Certificado;

public class CertificadoGerente implements Certificado{

    public String emitir()
    {
        return "Certificado de gerencia";
    }
}