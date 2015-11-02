/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPreconditionsFindRequest.java
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
 * Class used to create a InvsEquipTxnPreconditionsFindRequest Udt Request
 *
 */

public class InvsEquipTxnPreconditionsFindRequest extends InvsEquipTxnPreconditionsRequest {
/**
 *
 * Constructor to create a  InvsEquipTxnPreconditionsFindRequest
 * @param id Unique request name
 * @param IETPFindIn InvsEquipTxnPreconditionsObjectFilter for InvsEquipTxnPreconditionsFindRequest
 *
 */
@JsonCreator
  public InvsEquipTxnPreconditionsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipTxnPreconditions")InvsEquipTxnPreconditionsObjectFilter IETPFindIn) {
    super(id, "InvsEquipTxnPreconditionsFind");
    if (IETPFindIn != null) {
      Integer index =  IETPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectHelper.toMap(IETPFindIn, new HashMap(), "InvsEquipTxnPreconditions").get("InvsEquipTxnPreconditions"));
    }
  }

/**
 *
 * Retrieves the InvsEquipTxnPreconditionsObjectDataList that results from the InvsEquipTxnPreconditionsFindRequest call
 * @return InvsEquipTxnPreconditionsObjectDataList resulting from udt call
 *
 */

  public InvsEquipTxnPreconditionsObjectDataList getOutput() {
    return InvsEquipTxnPreconditionsObjectHelper.fromMapList(outputMap, "InvsEquipTxnPreconditionsList");
  }
}
