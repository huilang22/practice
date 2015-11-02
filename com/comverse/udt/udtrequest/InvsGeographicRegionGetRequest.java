/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsGeographicRegionGetRequest.java
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
 * Class used to create a InvsGeographicRegionGetRequest Udt Request
 *
 */

public class InvsGeographicRegionGetRequest extends InvsGeographicRegionSubRequestParent {
/**
 *
 * Constructor to create a  InvsGeographicRegionGetRequest
 * @param id Unique request name
 * @param InvsGeographicRegionGetIn InvsGeographicRegionObjectKeyData for InvsGeographicRegionGetRequest
 *
 */
@JsonCreator
  public InvsGeographicRegionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsGeographicRegion")InvsGeographicRegionObjectKeyData InvsGeographicRegionGetIn) {
    super(id, "InvsGeographicRegionGet");
    if (InvsGeographicRegionGetIn != null) {
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectKeyHelper.toMap(InvsGeographicRegionGetIn, new HashMap(), "InvsGeographicRegionObjectKeyData").get("InvsGeographicRegionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsGeographicRegionObjectData that results from the InvsGeographicRegionGetRequest call
 * @return InvsGeographicRegionObjectData resulting from udt call
 *
 */

  public InvsGeographicRegionObjectData getOutput() {
    return InvsGeographicRegionObjectHelper.fromMap(outputMap, "InvsGeographicRegion");
  }
}
