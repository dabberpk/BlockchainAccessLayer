package blockchains.iaas.uni.stuttgart.de.api;

import org.pf4j.ExtensionPoint;

public interface IExtensionInterface extends ExtensionPoint {
    String getVersion();
    String getAdapterType();
}
