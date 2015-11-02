/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccessRegionUpdateRequest.java
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
 * Class used to create a AccessRegionUpdateRequest Udt Request
 *
 */

public class AccessRegionUpdateRequest extends AccessRegionSubRequestParent {
/**
 *
 * Constructor to create a  AccessRegionUpdateRequest
 * @param id Unique request name
 * @param AccessRegionUpdateIn AccessRegionObjectData for AccessRegionUpdateRequest
 *
 */
@JsonCreator
  public AccessRegionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccessRegion")AccessRegionObjectData AccessRegionUpdateIn) {
    super(id, "AccessRegionUpdate");
    if (AccessRegionUpdateIn != null) {
      addInput("AccessRegion", AccessRegionObjectHelper.toMap(AccessRegionUpdateIn, new HashMap(), "AccessRegion").get("AccessRegion"));
    }
  }

/**
 *
 * Retrieves the AccessRegionObjectData that results from the AccessRegionUpdateRequest call
 * @return AccessRegionObjectData resulting from udt call
 *
 */

  public AccessRegionObjectData getOutput() {
    return AccessRegionObjectHelper.fromMap(outputMap, "AccessRegion");
  }
}
