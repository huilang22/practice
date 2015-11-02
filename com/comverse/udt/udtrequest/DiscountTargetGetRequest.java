/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountTargetGetRequest.java
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
 * Class used to create a DiscountTargetGetRequest Udt Request
 *
 */

public class DiscountTargetGetRequest extends DiscountTargetSubRequestParent {
/**
 *
 * Constructor to create a  DiscountTargetGetRequest
 * @param id Unique request name
 * @param DTGetIn DTObjectKeyData for DiscountTargetGetRequest
 *
 */
@JsonCreator
  public DiscountTargetGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountTarget")DTObjectKeyData DTGetIn) {
    super(id, "DiscountTargetGet");
    if (DTGetIn != null) {
      addInput("DiscountTarget", DTObjectKeyHelper.toMap(DTGetIn, new HashMap(), "DTObjectKeyData").get("DTObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DTObjectData that results from the DiscountTargetGetRequest call
 * @return DTObjectData resulting from udt call
 *
 */

  public DTObjectData getOutput() {
    return DTObjectHelper.fromMap(outputMap, "DiscountTarget");
  }
}
