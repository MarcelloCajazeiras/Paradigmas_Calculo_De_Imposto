package org.example;

public class ImpostoFactory {

    public static Imposto getImposto(String iss) {


    enum TipoImposto {

        ISS(0.05),
        ICMS(0.12),
        IPI(0.15);

        private final double percentual;

        TipoImposto(double percentual) {
            this.percentual = percentual;
        }

        public double getPercentual() {
            return percentual;
        }
    }
        return null;
    }}
