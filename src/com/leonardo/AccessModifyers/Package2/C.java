package com.leonardo.AccessModifyers.Package2;
import com.leonardo.AccessModifyers.*;

public class C {
        //el modificador por default sólo es visible dentro del mismo paquete
        String defaultMessage = "This is the default";
        public String publicMessage = "Este es un mensaje desde un modificador público";
        protected String protectedMessage = "Este es un mensaje desde un modificador protegido";
        private String privateMesage = "Desde un mensaje privado";
}

