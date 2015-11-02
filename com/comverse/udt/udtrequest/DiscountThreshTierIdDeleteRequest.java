/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountThreshTierIdDeleteRequest.java
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
 * Class used to create a DiscountThreshTierIdDeleteRequest Udt Request
 *
 */

public class DiscountThreshTierIdDeleteRequest extends DiscountThreshTierIdSubRequestParent {
/**
 *
 * Constructor to create a  DiscountThreshTierIdDeleteRequest
 * @param id Unique request name
 * @param DTTDeleteIn DTTObjectKeyData for DiscountThreshTierIdDeleteRequest
 *
 */
@JsonCreator
  public DiscountThreshTierIdDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountThreshTierId")DTTObjectKeyData DTTDeleteIn) {
    super(id, "DiscountThreshTierIdDelete");
    if (DTTDeleteIn != null) {
      addInput("DiscountThreshTierId", DTTObjectKeyHelper.toMap(DTTDeleteIn, new HashMap(), "DTTObjectKeyData").get("DTTObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DTTObjectData that results from the DiscountThreshTierIdDeleteRequest call
 * @return DTTObjectData resulting from udt call
 *
 */

  public DTTObjectData getOutput() {
    return DTTObjectHelper.fromMap(outputMap, "DiscountThreshTierId");
  }
}
