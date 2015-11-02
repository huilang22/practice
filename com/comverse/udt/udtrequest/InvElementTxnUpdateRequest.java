/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementTxnUpdateRequest.java
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
 * Class used to create a InvElementTxnUpdateRequest Udt Request
 *
 */

public class InvElementTxnUpdateRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementTxnUpdateRequest
 * @param id Unique request name
 * @param InvElementTxnUpdateIn InvElementObjData[] for InvElementTxnUpdateRequest
 * @param EquipmentTransactionId Integer for InvElementTxnUpdateRequest
 *
 */
@JsonCreator
  public InvElementTxnUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData[] InvElementTxnUpdateIn, @JsonProperty("EquipmentTransactionId")Integer EquipmentTransactionId) {
    super(id, "InvElementTxnUpdate");
    if (InvElementTxnUpdateIn != null) {
      Object[] list = new Object[InvElementTxnUpdateIn.length];
      for (int i = 0; i < InvElementTxnUpdateIn.length; i++) {
        list[i] = InvElementObjHelper.getMap(InvElementTxnUpdateIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvElement");
      }
      addInput("InvElementList", list);
    }
    if (EquipmentTransactionId != null) {
      addInput("EquipmentTransactionId", EquipmentTransactionId);
    }
  }

/**
 *
 * Retrieves the InvElementObjDataList that results from the InvElementTxnUpdateRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
