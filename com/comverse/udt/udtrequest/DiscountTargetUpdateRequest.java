/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountTargetUpdateRequest.java
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
 * Class used to create a DiscountTargetUpdateRequest Udt Request
 *
 */

public class DiscountTargetUpdateRequest extends DiscountTargetSubRequestParent {
/**
 *
 * Constructor to create a  DiscountTargetUpdateRequest
 * @param id Unique request name
 * @param DTUpdateIn DTObjectData for DiscountTargetUpdateRequest
 * @param DTUpdateFilter DTObjectFilter for DiscountTargetUpdateRequest
 * @param DTUpdateGet DTObjectData for DiscountTargetUpdateRequest
 *
 */
@JsonCreator
  public DiscountTargetUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountTarget")DTObjectData DTUpdateIn, @JsonProperty("DTUpdateFilter")DTObjectFilter DTUpdateFilter, @JsonProperty("DTUpdateGet")DTObjectData DTUpdateGet) {
    super(id, "DiscountTargetUpdate");
    if (DTUpdateIn != null) {
      addInput("DiscountTarget", DTObjectHelper.toMap(DTUpdateIn, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
    if (DTUpdateFilter != null) {
      Integer index =  DTUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DTUpdateFilter", DTObjectHelper.toMap(DTUpdateFilter, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
    if (DTUpdateGet != null) {
      addInput("DTUpdateGet", DTObjectHelper.toMap(DTUpdateGet, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }

/**
 *
 * Retrieves the DTObjectData that results from the DiscountTargetUpdateRequest call
 * @return DTObjectData resulting from udt call
 *
 */

  public DTObjectData getOutput() {
    return DTObjectHelper.fromMap(outputMap, "DiscountTarget");
  }
}
