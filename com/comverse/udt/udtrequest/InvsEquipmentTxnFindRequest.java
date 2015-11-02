/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFindRequest.java
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
 * Class used to create a InvsEquipmentTxnFindRequest Udt Request
 *
 */

public class InvsEquipmentTxnFindRequest extends InvsEquipmentTxnRequest {
/**
 *
 * Constructor to create a  InvsEquipmentTxnFindRequest
 * @param id Unique request name
 * @param IETFindIn InvsEquipmentTxnObjectFilter for InvsEquipmentTxnFindRequest
 *
 */
@JsonCreator
  public InvsEquipmentTxnFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentTxn")InvsEquipmentTxnObjectFilter IETFindIn) {
    super(id, "InvsEquipmentTxnFind");
    if (IETFindIn != null) {
      Integer index =  IETFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectHelper.toMap(IETFindIn, new HashMap(), "InvsEquipmentTxn").get("InvsEquipmentTxn"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentTxnObjectDataList that results from the InvsEquipmentTxnFindRequest call
 * @return InvsEquipmentTxnObjectDataList resulting from udt call
 *
 */

  public InvsEquipmentTxnObjectDataList getOutput() {
    return InvsEquipmentTxnObjectHelper.fromMapList(outputMap, "InvsEquipmentTxnList");
  }
}
