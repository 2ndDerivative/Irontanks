package com.indemnity83.irontank.utility;

import net.minecraft.init.Blocks;

public class MaterialHelper {

    public static Object translateOreName(String mat) {
        if (mat.equals("obsidian")) {
            return Blocks.obsidian;
        }
        return mat;
    }

}
