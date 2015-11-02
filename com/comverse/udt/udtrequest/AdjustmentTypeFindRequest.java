/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeFindRequest.java
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
 * Class used to create a AdjustmentTypeFindRequest Udt Request
 *
 */

public class AdjustmentTypeFindRequest extends AdjustmentTypeRequest {
/**
 *
 * Constructor to create a  AdjustmentTypeFindRequest
 * @param id Unique request name
 * @param atdFindIn AdjustmentTypeObjectFilter for AdjustmentTypeFindRequest
 *
 */
@JsonCreator
  public AdjustmentTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjustmentType")AdjustmentTypeObjectFilter atdFindIn) {
    super(id, "AdjustmentTypeFind");
    if (atdFindIn != null) {
      Integer index =  atdFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdjustmentType", AdjustmentTypeObjectHelper.toMap(atdFindIn, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
  }

/**
 *
 * Retrieves the AdjustmentTypeObjectDataList that results from the AdjustmentTypeFindRequest call
 * @return AdjustmentTypeObjectDataList resulting from udt call
 *
 */

  public AdjustmentTypeObjectDataList getOutput() {
    return AdjustmentTypeObjectHelper.fromMapList(outputMap, "AdjustmentTypeList");
  }
}
