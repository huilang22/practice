/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideDiscountRateFindRequest.java
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
 * Class used to create a OverrideDiscountRateFindRequest Udt Request
 *
 */

public class OverrideDiscountRateFindRequest extends OverrideDiscountRateRequest {
/**
 *
 * Constructor to create a  OverrideDiscountRateFindRequest
 * @param id Unique request name
 * @param RDOFindIn RDOverrideObjectFilter for OverrideDiscountRateFindRequest
 *
 */
@JsonCreator
  public OverrideDiscountRateFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("OverrideDiscountRate")RDOverrideObjectFilter RDOFindIn) {
    super(id, "OverrideDiscountRateFind");
    if (RDOFindIn != null) {
      Integer index =  RDOFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OverrideDiscountRate", RDOverrideObjectHelper.toMap(RDOFindIn, new HashMap(), "OverrideDiscountRate").get("OverrideDiscountRate"));
    }
  }

/**
 *
 * Retrieves the RDOverrideObjectDataList that results from the OverrideDiscountRateFindRequest call
 * @return RDOverrideObjectDataList resulting from udt call
 *
 */

  public RDOverrideObjectDataList getOutput() {
    return RDOverrideObjectHelper.fromMapList(outputMap, "OverrideDiscountRateList");
  }
}
