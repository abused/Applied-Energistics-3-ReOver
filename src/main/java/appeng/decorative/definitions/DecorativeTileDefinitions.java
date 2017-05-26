package appeng.decorative.definitions;

import appeng.api.definitions.ITileDefinition;
import appeng.core.lib.bootstrap.FeatureFactory;
import appeng.core.lib.definitions.Definitions;
import appeng.decorative.api.definitions.IDecorativeTileDefinitions;
import net.minecraft.tileentity.TileEntity;

public class DecorativeTileDefinitions extends Definitions<Class<TileEntity>, ITileDefinition<TileEntity>>
		implements IDecorativeTileDefinitions {

	public DecorativeTileDefinitions(FeatureFactory registry){
		init();
	}

}