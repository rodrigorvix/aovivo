package br.com.letscode.aovivo;

public enum FasesLua {

    NOVA("nova"),
    CRESCENTE("crescente"),
    CHEIA("cheia"),
    MINGUANTE("minguante");

    private String fase;

    FasesLua(String fase) {
        this.fase = fase;
    }

    public String getFase() {
        return fase;
    }
}
