/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTaxFindRequest.java
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
 * Class used to create a AdjustmentTaxFindRequest Udt Request
 *
 */

public class AdjustmentTaxFindRequest extends AdjustmentTaxRequest {
/**
 *
 * Constructor to create a  AdjustmentTaxFindRequest
 * @param id Unique request name
 * @param ATFindIn AdjustmentTaxObjectFilter for AdjustmentTaxFindRequest
 *
 */
@JsonCreator
  public AdjustmentTaxFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjustmentTax")AdjustmentTaxObjectFilter ATFindIn) {
    super(id, "AdjustmentTaxFind");
    if (ATFindIn != null) {
      Integer index =  ATFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdjustmentTax", AdjustmentTaxObjectHelper.toMap(ATFindIn, new HashMap(), "AdjustmentTax").get("AdjustmentTax"));
    }
  }

/**
 *
 * Retrieves the AdjustmentTaxObjectDataList that results from the AdjustmentTaxFindRequest call
 * @return AdjustmentTaxObjectDataList resulting from udt call
 *
 */

  public AdjustmentTaxObjectDataList getOutput() {
    return AdjustmentTaxObjectHelper.fromMapList(outputMap, "AdjustmentTaxList");
  }
}
