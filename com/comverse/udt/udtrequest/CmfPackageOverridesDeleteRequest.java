/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfPackageOverridesDeleteRequest.java
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
 * Class used to create a CmfPackageOverridesDeleteRequest Udt Request
 *
 */

public class CmfPackageOverridesDeleteRequest extends CmfPackageOverridesSubRequestParent {
/**
 *
 * Constructor to create a  CmfPackageOverridesDeleteRequest
 * @param id Unique request name
 * @param CPOdIn PackageOverridesObjectKeyData for CmfPackageOverridesDeleteRequest
 *
 */
@JsonCreator
  public CmfPackageOverridesDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfPackageOverrides")PackageOverridesObjectKeyData CPOdIn) {
    super(id, "CmfPackageOverridesDelete");
    if (CPOdIn != null) {
      addInput("CmfPackageOverrides", PackageOverridesObjectKeyHelper.toMap(CPOdIn, new HashMap(), "PackageOverridesObjectKeyData").get("PackageOverridesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PackageOverridesObjectData that results from the CmfPackageOverridesDeleteRequest call
 * @return PackageOverridesObjectData resulting from udt call
 *
 */

  public PackageOverridesObjectData getOutput() {
    return PackageOverridesObjectHelper.fromMap(outputMap, "CmfPackageOverrides");
  }
}
