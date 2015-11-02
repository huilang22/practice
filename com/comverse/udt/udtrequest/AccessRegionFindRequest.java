/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccessRegionFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AccessRegionFindRequest Udt Request
 *
 */

public class AccessRegionFindRequest extends AccessRegionRequest {
/**
 *
 * Constructor to create a  AccessRegionFindRequest
 * @param id Unique request name
 * @param AccessRegionFindIn AccessRegionObjectFilter for AccessRegionFindRequest
 *
 */
@JsonCreator
  public AccessRegionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccessRegion")AccessRegionObjectFilter AccessRegionFindIn) {
    super(id, "AccessRegionFind");
    if (AccessRegionFindIn != null) {
      Integer index =  AccessRegionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccessRegion", AccessRegionObjectHelper.toMap(AccessRegionFindIn, new HashMap(), "AccessRegion").get("AccessRegion"));
    }
  }

/**
 *
 * Retrieves the AccessRegionObjectDataList that results from the AccessRegionFindRequest call
 * @return AccessRegionObjectDataList resulting from udt call
 *
 */

  public AccessRegionObjectDataList getOutput() {
    return AccessRegionObjectHelper.fromMapList(outputMap, "AccessRegionList");
  }
}
