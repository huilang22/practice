/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsGeographicRegionUpdateRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsGeographicRegionUpdateRequest Udt Request
 *
 */

public class InvsGeographicRegionUpdateRequest extends InvsGeographicRegionSubRequestParent {
/**
 *
 * Constructor to create a  InvsGeographicRegionUpdateRequest
 * @param id Unique request name
 * @param InvsGeographicRegionUpdateIn InvsGeographicRegionObjectData for InvsGeographicRegionUpdateRequest
 *
 */
@JsonCreator
  public InvsGeographicRegionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsGeographicRegion")InvsGeographicRegionObjectData InvsGeographicRegionUpdateIn) {
    super(id, "InvsGeographicRegionUpdate");
    if (InvsGeographicRegionUpdateIn != null) {
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectHelper.toMap(InvsGeographicRegionUpdateIn, new HashMap(), "InvsGeographicRegion").get("InvsGeographicRegion"));
    }
  }

/**
 *
 * Retrieves the InvsGeographicRegionObjectData that results from the InvsGeographicRegionUpdateRequest call
 * @return InvsGeographicRegionObjectData resulting from udt call
 *
 */

  public InvsGeographicRegionObjectData getOutput() {
    return InvsGeographicRegionObjectHelper.fromMap(outputMap, "InvsGeographicRegion");
  }
}
