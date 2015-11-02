/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideDiscountRateGetRequest.java
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
 * Class used to create a OverrideDiscountRateGetRequest Udt Request
 *
 */

public class OverrideDiscountRateGetRequest extends OverrideDiscountRateSubRequestParent {
/**
 *
 * Constructor to create a  OverrideDiscountRateGetRequest
 * @param id Unique request name
 * @param RDOGetIn RDOverrideObjectKeyData for OverrideDiscountRateGetRequest
 *
 */
@JsonCreator
  public OverrideDiscountRateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("OverrideDiscountRate")RDOverrideObjectKeyData RDOGetIn) {
    super(id, "OverrideDiscountRateGet");
    if (RDOGetIn != null) {
      addInput("OverrideDiscountRate", RDOverrideObjectKeyHelper.toMap(RDOGetIn, new HashMap(), "RDOverrideObjectKeyData").get("RDOverrideObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RDOverrideObjectData that results from the OverrideDiscountRateGetRequest call
 * @return RDOverrideObjectData resulting from udt call
 *
 */

  public RDOverrideObjectData getOutput() {
    return RDOverrideObjectHelper.fromMap(outputMap, "OverrideDiscountRate");
  }
}
