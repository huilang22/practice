/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountTargetCreateRequest.java
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
 * Class used to create a DiscountTargetCreateRequest Udt Request
 *
 */

public class DiscountTargetCreateRequest extends DiscountTargetSubRequestParent {
/**
 *
 * Constructor to create a  DiscountTargetCreateRequest
 * @param id Unique request name
 * @param DTCreateIn DTObjectData for DiscountTargetCreateRequest
 *
 */
@JsonCreator
  public DiscountTargetCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountTarget")DTObjectData DTCreateIn) {
    super(id, "DiscountTargetCreate");
    if (DTCreateIn != null) {
      addInput("DiscountTarget", DTObjectHelper.toMap(DTCreateIn, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }

/**
 *
 * Retrieves the DTObjectData that results from the DiscountTargetCreateRequest call
 * @return DTObjectData resulting from udt call
 *
 */

  public DTObjectData getOutput() {
    return DTObjectHelper.fromMap(outputMap, "DiscountTarget");
  }
}
