/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountTargetFindRequest.java
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
 * Class used to create a DiscountTargetFindRequest Udt Request
 *
 */

public class DiscountTargetFindRequest extends DiscountTargetRequest {
/**
 *
 * Constructor to create a  DiscountTargetFindRequest
 * @param id Unique request name
 * @param DTFindIn DTObjectFilter for DiscountTargetFindRequest
 *
 */
@JsonCreator
  public DiscountTargetFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountTarget")DTObjectFilter DTFindIn) {
    super(id, "DiscountTargetFind");
    if (DTFindIn != null) {
      Integer index =  DTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DiscountTarget", DTObjectHelper.toMap(DTFindIn, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }

/**
 *
 * Retrieves the DTObjectDataList that results from the DiscountTargetFindRequest call
 * @return DTObjectDataList resulting from udt call
 *
 */

  public DTObjectDataList getOutput() {
    return DTObjectHelper.fromMapList(outputMap, "DiscountTargetList");
  }
}
