/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideDiscountRateCreateRequest.java
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
 * Class used to create a OverrideDiscountRateCreateRequest Udt Request
 *
 */

public class OverrideDiscountRateCreateRequest extends OverrideDiscountRateSubRequestParent {
/**
 *
 * Constructor to create a  OverrideDiscountRateCreateRequest
 * @param id Unique request name
 * @param RDOCreateIn RDOverrideObjectData for OverrideDiscountRateCreateRequest
 *
 */
@JsonCreator
  public OverrideDiscountRateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OverrideDiscountRate")RDOverrideObjectData RDOCreateIn) {
    super(id, "OverrideDiscountRateCreate");
    if (RDOCreateIn != null) {
      addInput("OverrideDiscountRate", RDOverrideObjectHelper.toMap(RDOCreateIn, new HashMap(), "OverrideDiscountRate").get("OverrideDiscountRate"));
    }
  }

/**
 *
 * Retrieves the RDOverrideObjectData that results from the OverrideDiscountRateCreateRequest call
 * @return RDOverrideObjectData resulting from udt call
 *
 */

  public RDOverrideObjectData getOutput() {
    return RDOverrideObjectHelper.fromMap(outputMap, "OverrideDiscountRate");
  }
}
