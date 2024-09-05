package br.com.ruannarici.consolemusic.model;

public enum ECategory {

    SOLO("solo"),
    DUO("dupla"),
    GROUP("banda");

    private String category;

    ECategory(String category) {
        this.category = category;
    }

    public static ECategory fromString(String category) {
        for (ECategory eCategory : ECategory.values()) {
            if (eCategory.category.equalsIgnoreCase(category)) {
                return eCategory;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + category);
    }
}
