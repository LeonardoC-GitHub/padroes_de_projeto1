package atv1.certificados;

import atv1.classesPrincipais.Certificado;

public class CertificadoMembro implements Certificado{

    public String emitir()
    {
        return "Certificado de participacao";
    }
}