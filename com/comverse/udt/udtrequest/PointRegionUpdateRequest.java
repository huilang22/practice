/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointRegionUpdateRequest.java
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
 * Class used to create a PointRegionUpdateRequest Udt Request
 *
 */

public class PointRegionUpdateRequest extends PointRegionSubRequestParent {
/**
 *
 * Constructor to create a  PointRegionUpdateRequest
 * @param id Unique request name
 * @param PRUpdateIn PointRegionObjectData for PointRegionUpdateRequest
 *
 */
@JsonCreator
  public PointRegionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointRegion")PointRegionObjectData PRUpdateIn) {
    super(id, "PointRegionUpdate");
    if (PRUpdateIn != null) {
      addInput("PointRegion", PointRegionObjectHelper.toMap(PRUpdateIn, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }

/**
 *
 * Retrieves the PointRegionObjectData that results from the PointRegionUpdateRequest call
 * @return PointRegionObjectData resulting from udt call
 *
 */

  public PointRegionObjectData getOutput() {
    return PointRegionObjectHelper.fromMap(outputMap, "PointRegion");
  }
}
