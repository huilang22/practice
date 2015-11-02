/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfPackageOverridesFindRequest.java
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
 * Class used to create a CmfPackageOverridesFindRequest Udt Request
 *
 */

public class CmfPackageOverridesFindRequest extends CmfPackageOverridesRequest {
/**
 *
 * Constructor to create a  CmfPackageOverridesFindRequest
 * @param id Unique request name
 * @param CPOfIn PackageOverridesObjectFilter for CmfPackageOverridesFindRequest
 *
 */
@JsonCreator
  public CmfPackageOverridesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CmfPackageOverrides")PackageOverridesObjectFilter CPOfIn) {
    super(id, "CmfPackageOverridesFind");
    if (CPOfIn != null) {
      Integer index =  CPOfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CmfPackageOverrides", PackageOverridesObjectHelper.toMap(CPOfIn, new HashMap(), "CmfPackageOverrides").get("CmfPackageOverrides"));
    }
  }

/**
 *
 * Retrieves the PackageOverridesObjectDataList that results from the CmfPackageOverridesFindRequest call
 * @return PackageOverridesObjectDataList resulting from udt call
 *
 */

  public PackageOverridesObjectDataList getOutput() {
    return PackageOverridesObjectHelper.fromMapList(outputMap, "CmfPackageOverridesList");
  }
}
