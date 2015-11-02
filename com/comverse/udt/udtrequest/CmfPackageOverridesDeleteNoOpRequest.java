/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfPackageOverridesDeleteNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a CmfPackageOverridesDeleteNoOpRequest Udt Request/Response
 *
 */
public class CmfPackageOverridesDeleteNoOpRequest extends CmfPackageOverridesSubRequestParent {
/**
 *
 * Constructor to create a   CmfPackageOverridesDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CmfPackageOverridesDeleteNoOpRequest(String id, PackageOverridesObjectData noOpIn) {
    super(id, "CmfPackageOverridesDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("CmfPackageOverrides", PackageOverridesObjectHelper.toMap(noOpIn, new HashMap(), "CmfPackageOverrides").get("CmfPackageOverrides"));
    }
  }
/**
 *
 * Retrieves the PackageOverridesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PackageOverridesObjectData getOutput() {
    return PackageOverridesObjectHelper.fromMap(outputMap, "CmfPackageOverrides");
  }
}
