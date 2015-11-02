/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfPackageOverridesCreateRequest.java
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
 * Class used to create a CmfPackageOverridesCreateRequest Udt Request
 *
 */

public class CmfPackageOverridesCreateRequest extends CmfPackageOverridesSubRequestParent {
/**
 *
 * Constructor to create a  CmfPackageOverridesCreateRequest
 * @param id Unique request name
 * @param CPOcIn PackageOverridesObjectData for CmfPackageOverridesCreateRequest
 *
 */
@JsonCreator
  public CmfPackageOverridesCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfPackageOverrides")PackageOverridesObjectData CPOcIn) {
    super(id, "CmfPackageOverridesCreate");
    if (CPOcIn != null) {
      addInput("CmfPackageOverrides", PackageOverridesObjectHelper.toMap(CPOcIn, new HashMap(), "CmfPackageOverrides").get("CmfPackageOverrides"));
    }
  }

/**
 *
 * Retrieves the PackageOverridesObjectData that results from the CmfPackageOverridesCreateRequest call
 * @return PackageOverridesObjectData resulting from udt call
 *
 */

  public PackageOverridesObjectData getOutput() {
    return PackageOverridesObjectHelper.fromMap(outputMap, "CmfPackageOverrides");
  }
}
