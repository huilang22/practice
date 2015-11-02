/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillPeriodFindRequest.java
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
 * Class used to create a BillPeriodFindRequest Udt Request
 *
 */

public class BillPeriodFindRequest extends BillPeriodRequest {
/**
 *
 * Constructor to create a  BillPeriodFindRequest
 * @param id Unique request name
 * @param BPFindIn BPObjectFilter for BillPeriodFindRequest
 *
 */
@JsonCreator
  public BillPeriodFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillPeriod")BPObjectFilter BPFindIn) {
    super(id, "BillPeriodFind");
    if (BPFindIn != null) {
      Integer index =  BPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillPeriod", BPObjectHelper.toMap(BPFindIn, new HashMap(), "BillPeriod").get("BillPeriod"));
    }
  }

/**
 *
 * Retrieves the BPObjectDataList that results from the BillPeriodFindRequest call
 * @return BPObjectDataList resulting from udt call
 *
 */

  public BPObjectDataList getOutput() {
    return BPObjectHelper.fromMapList(outputMap, "BillPeriodList");
  }
}
