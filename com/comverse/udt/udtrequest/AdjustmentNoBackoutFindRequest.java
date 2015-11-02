/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentNoBackoutFindRequest.java
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
 * Class used to create a AdjustmentNoBackoutFindRequest Udt Request
 *
 */

public class AdjustmentNoBackoutFindRequest extends AdjustmentRequest {
/**
 *
 * Constructor to create a  AdjustmentNoBackoutFindRequest
 * @param id Unique request name
 * @param nbfindIn AdjustmentObjectFilter for AdjustmentNoBackoutFindRequest
 *
 */
@JsonCreator
  public AdjustmentNoBackoutFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Adjustment")AdjustmentObjectFilter nbfindIn) {
    super(id, "AdjustmentNoBackoutFind");
    if (nbfindIn != null) {
      Integer index =  nbfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Adjustment", AdjustmentObjectHelper.toMap(nbfindIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }

/**
 *
 * Retrieves the AdjustmentObjectDataList that results from the AdjustmentNoBackoutFindRequest call
 * @return AdjustmentObjectDataList resulting from udt call
 *
 */

  public AdjustmentObjectDataList getOutput() {
    return AdjustmentObjectHelper.fromMapList(outputMap, "AdjustmentList");
  }
}
