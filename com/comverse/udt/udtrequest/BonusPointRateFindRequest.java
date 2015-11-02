/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointRateFindRequest.java
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
 * Class used to create a BonusPointRateFindRequest Udt Request
 *
 */

public class BonusPointRateFindRequest extends BonusPointRateRequest {
/**
 *
 * Constructor to create a  BonusPointRateFindRequest
 * @param id Unique request name
 * @param BPRFindIn BonusPointRateObjectFilter for BonusPointRateFindRequest
 *
 */
@JsonCreator
  public BonusPointRateFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BonusPointRate")BonusPointRateObjectFilter BPRFindIn) {
    super(id, "BonusPointRateFind");
    if (BPRFindIn != null) {
      Integer index =  BPRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BonusPointRate", BonusPointRateObjectHelper.toMap(BPRFindIn, new HashMap(), "BonusPointRate").get("BonusPointRate"));
    }
  }

/**
 *
 * Retrieves the BonusPointRateObjectDataList that results from the BonusPointRateFindRequest call
 * @return BonusPointRateObjectDataList resulting from udt call
 *
 */

  public BonusPointRateObjectDataList getOutput() {
    return BonusPointRateObjectHelper.fromMapList(outputMap, "BonusPointRateList");
  }
}
