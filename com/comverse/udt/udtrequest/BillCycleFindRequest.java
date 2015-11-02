/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillCycleFindRequest.java
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
 * Class used to create a BillCycleFindRequest Udt Request
 *
 */

public class BillCycleFindRequest extends BillCycleRequest {
/**
 *
 * Constructor to create a  BillCycleFindRequest
 * @param id Unique request name
 * @param BillCyclefindIn BillCycleObjectFilter for BillCycleFindRequest
 *
 */
@JsonCreator
  public BillCycleFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillCycle")BillCycleObjectFilter BillCyclefindIn) {
    super(id, "BillCycleFind");
    if (BillCyclefindIn != null) {
      Integer index =  BillCyclefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillCycle", BillCycleObjectHelper.toMap(BillCyclefindIn, new HashMap(), "BillCycle").get("BillCycle"));
    }
  }

/**
 *
 * Retrieves the BillCycleObjectDataList that results from the BillCycleFindRequest call
 * @return BillCycleObjectDataList resulting from udt call
 *
 */

  public BillCycleObjectDataList getOutput() {
    return BillCycleObjectHelper.fromMapList(outputMap, "BillCycleList");
  }
}
