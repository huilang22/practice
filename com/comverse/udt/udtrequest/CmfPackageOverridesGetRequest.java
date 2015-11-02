/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfPackageOverridesGetRequest.java
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
 * Class used to create a CmfPackageOverridesGetRequest Udt Request
 *
 */

public class CmfPackageOverridesGetRequest extends CmfPackageOverridesSubRequestParent {
/**
 *
 * Constructor to create a  CmfPackageOverridesGetRequest
 * @param id Unique request name
 * @param CPOgIn PackageOverridesObjectKeyData for CmfPackageOverridesGetRequest
 *
 */
@JsonCreator
  public CmfPackageOverridesGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfPackageOverrides")PackageOverridesObjectKeyData CPOgIn) {
    super(id, "CmfPackageOverridesGet");
    if (CPOgIn != null) {
      addInput("CmfPackageOverrides", PackageOverridesObjectKeyHelper.toMap(CPOgIn, new HashMap(), "PackageOverridesObjectKeyData").get("PackageOverridesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PackageOverridesObjectData that results from the CmfPackageOverridesGetRequest call
 * @return PackageOverridesObjectData resulting from udt call
 *
 */

  public PackageOverridesObjectData getOutput() {
    return PackageOverridesObjectHelper.fromMap(outputMap, "CmfPackageOverrides");
  }
}
