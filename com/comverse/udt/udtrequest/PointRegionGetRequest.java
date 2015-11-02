/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointRegionGetRequest.java
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
 * Class used to create a PointRegionGetRequest Udt Request
 *
 */

public class PointRegionGetRequest extends PointRegionSubRequestParent {
/**
 *
 * Constructor to create a  PointRegionGetRequest
 * @param id Unique request name
 * @param PRGetIn PointRegionObjectKeyData for PointRegionGetRequest
 *
 */
@JsonCreator
  public PointRegionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointRegion")PointRegionObjectKeyData PRGetIn) {
    super(id, "PointRegionGet");
    if (PRGetIn != null) {
      addInput("PointRegion", PointRegionObjectKeyHelper.toMap(PRGetIn, new HashMap(), "PointRegionObjectKeyData").get("PointRegionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PointRegionObjectData that results from the PointRegionGetRequest call
 * @return PointRegionObjectData resulting from udt call
 *
 */

  public PointRegionObjectData getOutput() {
    return PointRegionObjectHelper.fromMap(outputMap, "PointRegion");
  }
}
