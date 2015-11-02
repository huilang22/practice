/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccessRegionGetRequest.java
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
 * Class used to create a AccessRegionGetRequest Udt Request
 *
 */

public class AccessRegionGetRequest extends AccessRegionSubRequestParent {
/**
 *
 * Constructor to create a  AccessRegionGetRequest
 * @param id Unique request name
 * @param AccessRegionGetIn AccessRegionObjectKeyData for AccessRegionGetRequest
 *
 */
@JsonCreator
  public AccessRegionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccessRegion")AccessRegionObjectKeyData AccessRegionGetIn) {
    super(id, "AccessRegionGet");
    if (AccessRegionGetIn != null) {
      addInput("AccessRegion", AccessRegionObjectKeyHelper.toMap(AccessRegionGetIn, new HashMap(), "AccessRegionObjectKeyData").get("AccessRegionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccessRegionObjectData that results from the AccessRegionGetRequest call
 * @return AccessRegionObjectData resulting from udt call
 *
 */

  public AccessRegionObjectData getOutput() {
    return AccessRegionObjectHelper.fromMap(outputMap, "AccessRegion");
  }
}
