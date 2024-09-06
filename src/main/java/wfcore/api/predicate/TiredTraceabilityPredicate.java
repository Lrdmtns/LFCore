package wfcore.api.predicate;

import wfcore.api.blocks.impl.WrappedIntTired;
import wfcore.api.pattern.TierTraceabilityPredicate;

import java.util.Comparator;
import java.util.function.Supplier;

import static wfcore.api.WFCOREAPI.*;
import static wfcore.api.WFCOREAPI.*;

public class TiredTraceabilityPredicate {

    /*public static Supplier<TierTraceabilityPredicate> CP_LENS = () -> new TierTraceabilityPredicate(MAP_LS_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_LS_CASING.get(s)).getIntTier()), "LENS", null);

    public static Supplier<TierTraceabilityPredicate> CP_SOURSE = () -> new TierTraceabilityPredicate(MAP_SS_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_SS_CASING.get(s)).getIntTier()), "SOURSE", null);

    //  Fusion Coil Predicate
    public static Supplier<TierTraceabilityPredicate> FUSION_COIL = () -> new TierTraceabilityPredicate(MAP_FUSION_COIL,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_FUSION_COIL.get(s)).getIntTier()), "FusionCoil", null);
    
    public static Supplier<TierTraceabilityPredicate> CP_PAF_CASING = () -> new TierTraceabilityPredicate(MAP_PAF_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_PAF_CASING.get(s)).getIntTier()), "PAF", null);
    public static Supplier<TierTraceabilityPredicate> CP_PAE_CASING = () -> new TierTraceabilityPredicate(MAP_PAE_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_PAE_CASING.get(s)).getIntTier()), "PAE", null);
    public static Supplier<TierTraceabilityPredicate> CP_PAV_CASING = () -> new TierTraceabilityPredicate(MAP_PAV_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_PAV_CASING.get(s)).getIntTier()), "PAV", null);*/

    public static Supplier<TierTraceabilityPredicate> CP_CPU_CASING1 = () -> new TierTraceabilityPredicate(MAP_CPU_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_CPU_CASING.get(s)).getIntTier()), "CPU1", null);
    public static Supplier<TierTraceabilityPredicate> CP_GPU_CASING1 = () -> new TierTraceabilityPredicate(MAP_GPU_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_GPU_CASING.get(s)).getIntTier()), "GPU1", null);
    public static Supplier<TierTraceabilityPredicate> CP_RAM_CASING1 = () -> new TierTraceabilityPredicate(MAP_RAM_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_RAM_CASING.get(s)).getIntTier()), "RAM1", null);


    public static Supplier<TierTraceabilityPredicate> CP_CPU_CASING2 = () -> new TierTraceabilityPredicate(MAP_CPU_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_CPU_CASING.get(s)).getIntTier()), "CPU2", null);
    public static Supplier<TierTraceabilityPredicate> CP_GPU_CASING2 = () -> new TierTraceabilityPredicate(MAP_GPU_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_GPU_CASING.get(s)).getIntTier()), "GPU2", null);
    public static Supplier<TierTraceabilityPredicate> CP_RAM_CASING2 = () -> new TierTraceabilityPredicate(MAP_RAM_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_RAM_CASING.get(s)).getIntTier()), "RAM2", null);

    public static Supplier<TierTraceabilityPredicate> CP_CPU_CASING3 = () -> new TierTraceabilityPredicate(MAP_CPU_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_CPU_CASING.get(s)).getIntTier()), "CPU3", null);
    public static Supplier<TierTraceabilityPredicate> CP_GPU_CASING3 = () -> new TierTraceabilityPredicate(MAP_GPU_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_GPU_CASING.get(s)).getIntTier()), "GPU3", null);
    public static Supplier<TierTraceabilityPredicate> CP_RAM_CASING3 = () -> new TierTraceabilityPredicate(MAP_RAM_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_RAM_CASING.get(s)).getIntTier()), "RAM3", null);

    public static Supplier<TierTraceabilityPredicate> CP_CPU_CASING4 = () -> new TierTraceabilityPredicate(MAP_CPU_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_CPU_CASING.get(s)).getIntTier()), "CPU4", null);
    public static Supplier<TierTraceabilityPredicate> CP_GPU_CASING4 = () -> new TierTraceabilityPredicate(MAP_GPU_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_GPU_CASING.get(s)).getIntTier()), "GPU4", null);
    public static Supplier<TierTraceabilityPredicate> CP_RAM_CASING4 = () -> new TierTraceabilityPredicate(MAP_RAM_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_RAM_CASING.get(s)).getIntTier()), "RAM4", null);
    /*
    public static Supplier<TierTraceabilityPredicate> CP_ZW_CASING = () -> new TierTraceabilityPredicate(MAP_ZW_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_ZW_CASING.get(s)).getIntTier()), "ZW", null);
    public static Supplier<TierTraceabilityPredicate> CP_TJ_CASING = () -> new TierTraceabilityPredicate(MAP_TJ_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_TJ_CASING.get(s)).getIntTier()), "TJ", null);
    public static Supplier<TierTraceabilityPredicate> CP_ZJ_CASING = () -> new TierTraceabilityPredicate(MAP_ZJ_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired) MAP_ZJ_CASING.get(s)).getIntTier()), "ZJ", null);
    

     public static Supplier<TierTraceabilityPredicate> CP_LGLASS= () -> new TierTraceabilityPredicate(MAP_LGLASS,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_LGLASS.get(s)).getIntTier()),"LGL",null);
     public static Supplier<TierTraceabilityPredicate> CP_PA_CASING= () -> new TierTraceabilityPredicate(MAP_PA_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_PA_CASING.get(s)).getIntTier()),"PAC",null);
     public static Supplier<TierTraceabilityPredicate> CP_PA_INTERNAL_CASING = () -> new  TierTraceabilityPredicate(MAP_PA_INTERNAL_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_PA_INTERNAL_CASING.get(s)).getIntTier()), "PAI", null);
     public static Supplier<TierTraceabilityPredicate> CP_DM_CASING = () -> new  TierTraceabilityPredicate(MAP_DC_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_DC_CASING.get(s)).getIntTier()), "FieldCasing", null);
     public static Supplier<TierTraceabilityPredicate> CP_ND_CASING = () -> new TierTraceabilityPredicate(MAP_ND_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_ND_CASING.get(s)).getIntTier()), "ND", null);
     public static Supplier<TierTraceabilityPredicate> CP_SP_CASING = () -> new  TierTraceabilityPredicate(MAP_SP_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_SP_CASING.get(s)).getIntTier()), "SP", null);
     public static Supplier<TierTraceabilityPredicate> CP_ELE_CASING= () -> new TierTraceabilityPredicate(MAP_ELE_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_ELE_CASING.get(s)).getIntTier()),"Ele",null);
     public static Supplier<TierTraceabilityPredicate> CP_DRI_CASING= () -> new TierTraceabilityPredicate(MAP_DRI_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_DRI_CASING.get(s)).getIntTier()),"Dri",null);
     public static Supplier<TierTraceabilityPredicate> MACHINE_CASINGS= () -> new TierTraceabilityPredicate(MAP_MACHINE_CASING,"MachineCasingType",null);
     public static Supplier<TierTraceabilityPredicate> CP_CASING= () -> new TierTraceabilityPredicate(MAP_CP_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_CP_CASING.get(s)).getIntTier()),"ChemicalPlantCasing",null);
     public static Supplier<TierTraceabilityPredicate> CP_TUBE= () -> new TierTraceabilityPredicate(MAP_CP_TUBE,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_CP_TUBE.get(s)).getIntTier()),"ChemicalPlantTube",null);
     public static Supplier<TierTraceabilityPredicate> CP_GLASS= () -> new TierTraceabilityPredicate(MAP_GLASS,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_GLASS.get(s)).getIntTier()),"Glass",null);
     public static Supplier<TierTraceabilityPredicate> CP_BEAM= () -> new TierTraceabilityPredicate(MAP_CP_BEAM,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_CP_BEAM.get(s)).getIntTier()),"Beam",null);
     public static Supplier<TierTraceabilityPredicate> QFT_MANIPULATOR= () -> new TierTraceabilityPredicate(MAP_QFT_MANIPULATOR,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_QFT_MANIPULATOR.get(s)).getIntTier()),"Manipulatpr",null);
     public static Supplier<TierTraceabilityPredicate> QFT_SHIELDING_CORE= () -> new TierTraceabilityPredicate(MAP_QFT_SHIELDING_CORE,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_QFT_SHIELDING_CORE.get(s)).getIntTier()),"Core",null);
     public static Supplier<TierTraceabilityPredicate> QFT_GLASS= () -> new TierTraceabilityPredicate(MAP_QFT_GLASS,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_QFT_GLASS.get(s)).getIntTier()),"QFTGlass",null);
     public static Supplier<TierTraceabilityPredicate> CAL_CASING= () -> new TierTraceabilityPredicate(MAP_CAL_CASING,
            Comparator.comparing((s) -> ((WrappedIntTired)MAP_CAL_CASING.get(s)).getIntTier()),"CALCasing",null);

     */

}