/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointRegionCreateRequest.java
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
 * Class used to create a PointRegionCreateRequest Udt Request
 *
 */

public class PointRegionCreateRequest extends PointRegionSubRequestParent {
/**
 *
 * Constructor to create a  PointRegionCreateRequest
 * @param id Unique request name
 * @param PRCreateIn PointRegionObjectData for PointRegionCreateRequest
 *
 */
@JsonCreator
  public PointRegionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointRegion")PointRegionObjectData PRCreateIn) {
    super(id, "PointRegionCreate");
    if (PRCreateIn != null) {
      addInput("PointRegion", PointRegionObjectHelper.toMap(PRCreateIn, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }

/**
 *
 * Retrieves the PointRegionObjectData that results from the PointRegionCreateRequest call
 * @return PointRegionObjectData resulting from udt call
 *
 */

  public PointRegionObjectData getOutput() {
    return PointRegionObjectHelper.fromMap(outputMap, "PointRegion");
  }
}
