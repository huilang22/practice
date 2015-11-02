/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountThreshTierIdGetRequest.java
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
 * Class used to create a DiscountThreshTierIdGetRequest Udt Request
 *
 */

public class DiscountThreshTierIdGetRequest extends DiscountThreshTierIdSubRequestParent {
/**
 *
 * Constructor to create a  DiscountThreshTierIdGetRequest
 * @param id Unique request name
 * @param DTTGetIn DTTObjectKeyData for DiscountThreshTierIdGetRequest
 *
 */
@JsonCreator
  public DiscountThreshTierIdGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountThreshTierId")DTTObjectKeyData DTTGetIn) {
    super(id, "DiscountThreshTierIdGet");
    if (DTTGetIn != null) {
      addInput("DiscountThreshTierId", DTTObjectKeyHelper.toMap(DTTGetIn, new HashMap(), "DTTObjectKeyData").get("DTTObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DTTObjectData that results from the DiscountThreshTierIdGetRequest call
 * @return DTTObjectData resulting from udt call
 *
 */

  public DTTObjectData getOutput() {
    return DTTObjectHelper.fromMap(outputMap, "DiscountThreshTierId");
  }
}
