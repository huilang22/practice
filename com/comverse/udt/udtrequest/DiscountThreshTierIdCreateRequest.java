/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountThreshTierIdCreateRequest.java
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
 * Class used to create a DiscountThreshTierIdCreateRequest Udt Request
 *
 */

public class DiscountThreshTierIdCreateRequest extends DiscountThreshTierIdSubRequestParent {
/**
 *
 * Constructor to create a  DiscountThreshTierIdCreateRequest
 * @param id Unique request name
 * @param DTTCreateIn DTTObjectData for DiscountThreshTierIdCreateRequest
 *
 */
@JsonCreator
  public DiscountThreshTierIdCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountThreshTierId")DTTObjectData DTTCreateIn) {
    super(id, "DiscountThreshTierIdCreate");
    if (DTTCreateIn != null) {
      addInput("DiscountThreshTierId", DTTObjectHelper.toMap(DTTCreateIn, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }

/**
 *
 * Retrieves the DTTObjectData that results from the DiscountThreshTierIdCreateRequest call
 * @return DTTObjectData resulting from udt call
 *
 */

  public DTTObjectData getOutput() {
    return DTTObjectHelper.fromMap(outputMap, "DiscountThreshTierId");
  }
}
