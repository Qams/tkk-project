package pl.edu.agh.tkk17;

public enum TokenType
{
    END("END"),
    NUM("NUM"),
    ADD("ADD"),
    MUL("MUL"),
    SUB("SUB"),
    DIV("DIV"),
    LBR("LBR"),
    RBR("RBR");


    private final String name;

    TokenType(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}
