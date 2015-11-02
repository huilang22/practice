/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccessRegionCreateRequest.java
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
 * Class used to create a AccessRegionCreateRequest Udt Request
 *
 */

public class AccessRegionCreateRequest extends AccessRegionSubRequestParent {
/**
 *
 * Constructor to create a  AccessRegionCreateRequest
 * @param id Unique request name
 * @param AccessRegionCreateIn AccessRegionObjectData for AccessRegionCreateRequest
 *
 */
@JsonCreator
  public AccessRegionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccessRegion")AccessRegionObjectData AccessRegionCreateIn) {
    super(id, "AccessRegionCreate");
    if (AccessRegionCreateIn != null) {
      addInput("AccessRegion", AccessRegionObjectHelper.toMap(AccessRegionCreateIn, new HashMap(), "AccessRegion").get("AccessRegion"));
    }
  }

/**
 *
 * Retrieves the AccessRegionObjectData that results from the AccessRegionCreateRequest call
 * @return AccessRegionObjectData resulting from udt call
 *
 */

  public AccessRegionObjectData getOutput() {
    return AccessRegionObjectHelper.fromMap(outputMap, "AccessRegion");
  }
}
