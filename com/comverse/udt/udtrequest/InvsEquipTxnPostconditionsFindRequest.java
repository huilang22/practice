/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPostconditionsFindRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsEquipTxnPostconditionsFindRequest Udt Request
 *
 */

public class InvsEquipTxnPostconditionsFindRequest extends InvsEquipTxnPostconditionsRequest {
/**
 *
 * Constructor to create a  InvsEquipTxnPostconditionsFindRequest
 * @param id Unique request name
 * @param IETPFindIn InvsEquipTxnPostconditionsObjectFilter for InvsEquipTxnPostconditionsFindRequest
 *
 */
@JsonCreator
  public InvsEquipTxnPostconditionsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipTxnPostconditions")InvsEquipTxnPostconditionsObjectFilter IETPFindIn) {
    super(id, "InvsEquipTxnPostconditionsFind");
    if (IETPFindIn != null) {
      Integer index =  IETPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(IETPFindIn, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }

/**
 *
 * Retrieves the InvsEquipTxnPostconditionsObjectDataList that results from the InvsEquipTxnPostconditionsFindRequest call
 * @return InvsEquipTxnPostconditionsObjectDataList resulting from udt call
 *
 */

  public InvsEquipTxnPostconditionsObjectDataList getOutput() {
    return InvsEquipTxnPostconditionsObjectHelper.fromMapList(outputMap, "InvsEquipTxnPostconditionsList");
  }
}
