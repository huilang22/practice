package com.csgsystems.udt;

import com.csgsystems.aruba.connection.*;

public interface UdtProcessor {
  public UdtRootRequest process(BSDMSessionContext context, UdtRootRequest request) throws BSDMResourceException;
}
