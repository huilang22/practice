/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsGeographicRegionCreateRequest.java
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
 * Class used to create a InvsGeographicRegionCreateRequest Udt Request
 *
 */

public class InvsGeographicRegionCreateRequest extends InvsGeographicRegionSubRequestParent {
/**
 *
 * Constructor to create a  InvsGeographicRegionCreateRequest
 * @param id Unique request name
 * @param InvsGeographicRegionCreateIn InvsGeographicRegionObjectData for InvsGeographicRegionCreateRequest
 *
 */
@JsonCreator
  public InvsGeographicRegionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsGeographicRegion")InvsGeographicRegionObjectData InvsGeographicRegionCreateIn) {
    super(id, "InvsGeographicRegionCreate");
    if (InvsGeographicRegionCreateIn != null) {
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectHelper.toMap(InvsGeographicRegionCreateIn, new HashMap(), "InvsGeographicRegion").get("InvsGeographicRegion"));
    }
  }

/**
 *
 * Retrieves the InvsGeographicRegionObjectData that results from the InvsGeographicRegionCreateRequest call
 * @return InvsGeographicRegionObjectData resulting from udt call
 *
 */

  public InvsGeographicRegionObjectData getOutput() {
    return InvsGeographicRegionObjectHelper.fromMap(outputMap, "InvsGeographicRegion");
  }
}
