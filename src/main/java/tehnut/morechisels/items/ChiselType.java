package tehnut.morechisels.items;

import java.util.Locale;

import static tehnut.morechisels.ConfigHandler.*;

public enum ChiselType {

    BLOODY(durabilityBloody),
    BOUND(),
    BEDROCKIUM(durabilityBedrockium),
    FLUXED(),
    IRONWOOD(durabilityIronwood),
    STEELEAF(durabilitySteeleaf),
    KNIGHTMETAL(durabilityKnightmetal),
    FIERY(durabilityFiery),
    MANASTEEL(durabilityManasteel),
    ELEMENTIUM(durabilityElementium),
    SKYROOT(durabilitySkyroot),
    HOLYSTONE(durabilityHolystone),
    ZANITE(durabilityZanite),
    GRAVITITE(durabilityGravitite);

    /**
     * Used for all types of durability (RF, EU, etc)
     */
    public final int durability;

    private ChiselType(int dura) {
        this.durability = dura;
    }

    private ChiselType() {
        this(100);
    }

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }
}
