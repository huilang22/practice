/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfPackageOverridesUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CmfPackageOverridesUpdateRequest Udt Request
 *
 */

public class CmfPackageOverridesUpdateRequest extends CmfPackageOverridesSubRequestParent {
/**
 *
 * Constructor to create a  CmfPackageOverridesUpdateRequest
 * @param id Unique request name
 * @param CPOuIn PackageOverridesObjectData for CmfPackageOverridesUpdateRequest
 *
 */
@JsonCreator
  public CmfPackageOverridesUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfPackageOverrides")PackageOverridesObjectData CPOuIn) {
    super(id, "CmfPackageOverridesUpdate");
    if (CPOuIn != null) {
      addInput("CmfPackageOverrides", PackageOverridesObjectHelper.toMap(CPOuIn, new HashMap(), "CmfPackageOverrides").get("CmfPackageOverrides"));
    }
  }

/**
 *
 * Retrieves the PackageOverridesObjectData that results from the CmfPackageOverridesUpdateRequest call
 * @return PackageOverridesObjectData resulting from udt call
 *
 */

  public PackageOverridesObjectData getOutput() {
    return PackageOverridesObjectHelper.fromMap(outputMap, "CmfPackageOverrides");
  }
}
