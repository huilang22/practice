/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountThreshTierIdUpdateRequest.java
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
 * Class used to create a DiscountThreshTierIdUpdateRequest Udt Request
 *
 */

public class DiscountThreshTierIdUpdateRequest extends DiscountThreshTierIdSubRequestParent {
/**
 *
 * Constructor to create a  DiscountThreshTierIdUpdateRequest
 * @param id Unique request name
 * @param DTTUpdateIn DTTObjectData for DiscountThreshTierIdUpdateRequest
 *
 */
@JsonCreator
  public DiscountThreshTierIdUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountThreshTierId")DTTObjectData DTTUpdateIn) {
    super(id, "DiscountThreshTierIdUpdate");
    if (DTTUpdateIn != null) {
      addInput("DiscountThreshTierId", DTTObjectHelper.toMap(DTTUpdateIn, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }

/**
 *
 * Retrieves the DTTObjectData that results from the DiscountThreshTierIdUpdateRequest call
 * @return DTTObjectData resulting from udt call
 *
 */

  public DTTObjectData getOutput() {
    return DTTObjectHelper.fromMap(outputMap, "DiscountThreshTierId");
  }
}
