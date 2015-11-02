/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideDiscountRateUpdateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OverrideDiscountRateUpdateRequest Udt Request
 *
 */

public class OverrideDiscountRateUpdateRequest extends OverrideDiscountRateSubRequestParent {
/**
 *
 * Constructor to create a  OverrideDiscountRateUpdateRequest
 * @param id Unique request name
 * @param RDOUpdateIn RDOverrideObjectData for OverrideDiscountRateUpdateRequest
 *
 */
@JsonCreator
  public OverrideDiscountRateUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OverrideDiscountRate")RDOverrideObjectData RDOUpdateIn) {
    super(id, "OverrideDiscountRateUpdate");
    if (RDOUpdateIn != null) {
      addInput("OverrideDiscountRate", RDOverrideObjectHelper.toMap(RDOUpdateIn, new HashMap(), "OverrideDiscountRate").get("OverrideDiscountRate"));
    }
  }

/**
 *
 * Retrieves the RDOverrideObjectData that results from the OverrideDiscountRateUpdateRequest call
 * @return RDOverrideObjectData resulting from udt call
 *
 */

  public RDOverrideObjectData getOutput() {
    return RDOverrideObjectHelper.fromMap(outputMap, "OverrideDiscountRate");
  }
}
