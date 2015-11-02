/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentFindRequest.java
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
 * Class used to create a AdjustmentFindRequest Udt Request
 *
 */

public class AdjustmentFindRequest extends AdjustmentRequest {
/**
 *
 * Constructor to create a  AdjustmentFindRequest
 * @param id Unique request name
 * @param findIn AdjustmentObjectFilter for AdjustmentFindRequest
 *
 */
@JsonCreator
  public AdjustmentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Adjustment")AdjustmentObjectFilter findIn) {
    super(id, "AdjustmentFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(findIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }

/**
 *
 * Retrieves the AdjustmentObjectDataList that results from the AdjustmentFindRequest call
 * @return AdjustmentObjectDataList resulting from udt call
 *
 */

  public AdjustmentObjectDataList getOutput() {
    return AdjustmentObjectHelper.fromMapList(outputMap, "AdjustmentList");
  }
}
