/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentReasonFindRequest.java
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
 * Class used to create a AdjustmentReasonFindRequest Udt Request
 *
 */

public class AdjustmentReasonFindRequest extends AdjustmentReasonRequest {
/**
 *
 * Constructor to create a  AdjustmentReasonFindRequest
 * @param id Unique request name
 * @param ARFindIn AdjustmentReasonObjectFilter for AdjustmentReasonFindRequest
 *
 */
@JsonCreator
  public AdjustmentReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjustmentReason")AdjustmentReasonObjectFilter ARFindIn) {
    super(id, "AdjustmentReasonFind");
    if (ARFindIn != null) {
      Integer index =  ARFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdjustmentReason", AdjustmentReasonObjectHelper.toMap(ARFindIn, new HashMap(), "AdjustmentReason").get("AdjustmentReason"));
    }
  }

/**
 *
 * Retrieves the AdjustmentReasonObjectDataList that results from the AdjustmentReasonFindRequest call
 * @return AdjustmentReasonObjectDataList resulting from udt call
 *
 */

  public AdjustmentReasonObjectDataList getOutput() {
    return AdjustmentReasonObjectHelper.fromMapList(outputMap, "AdjustmentReasonList");
  }
}
