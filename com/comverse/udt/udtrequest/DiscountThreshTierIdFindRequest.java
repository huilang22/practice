/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountThreshTierIdFindRequest.java
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
 * Class used to create a DiscountThreshTierIdFindRequest Udt Request
 *
 */

public class DiscountThreshTierIdFindRequest extends DiscountThreshTierIdRequest {
/**
 *
 * Constructor to create a  DiscountThreshTierIdFindRequest
 * @param id Unique request name
 * @param DTTFindIn DTTObjectFilter for DiscountThreshTierIdFindRequest
 *
 */
@JsonCreator
  public DiscountThreshTierIdFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountThreshTierId")DTTObjectFilter DTTFindIn) {
    super(id, "DiscountThreshTierIdFind");
    if (DTTFindIn != null) {
      Integer index =  DTTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DiscountThreshTierId", DTTObjectHelper.toMap(DTTFindIn, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }

/**
 *
 * Retrieves the DTTObjectDataList that results from the DiscountThreshTierIdFindRequest call
 * @return DTTObjectDataList resulting from udt call
 *
 */

  public DTTObjectDataList getOutput() {
    return DTTObjectHelper.fromMapList(outputMap, "DiscountThreshTierIdList");
  }
}
