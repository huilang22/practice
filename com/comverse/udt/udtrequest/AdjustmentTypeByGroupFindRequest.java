/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeByGroupFindRequest.java
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
 * Class used to create a AdjustmentTypeByGroupFindRequest Udt Request
 *
 */

public class AdjustmentTypeByGroupFindRequest extends AdjustmentTypeRequest {
/**
 *
 * Constructor to create a  AdjustmentTypeByGroupFindRequest
 * @param id Unique request name
 * @param LanguageCode Integer for AdjustmentTypeByGroupFindRequest
 * @param adj_trans_group Integer for AdjustmentTypeByGroupFindRequest
 *
 */
@JsonCreator
  public AdjustmentTypeByGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")Integer LanguageCode, @JsonProperty("AdjTransGroup")Integer adj_trans_group) {
    super(id, "AdjustmentTypeByGroupFind");
    if (LanguageCode != null) {
      addInput("LanguageCode", LanguageCode);
    }
    if (adj_trans_group != null) {
      addInput("AdjTransGroup", adj_trans_group);
    }
  }

/**
 *
 * Retrieves the AdjustmentTypeObjectDataList that results from the AdjustmentTypeByGroupFindRequest call
 * @return AdjustmentTypeObjectDataList resulting from udt call
 *
 */

  public AdjustmentTypeObjectDataList getOutput() {
    return AdjustmentTypeObjectHelper.fromMapList(outputMap, "AdjustmentTypeList");
  }
}
