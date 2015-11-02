/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFindNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a InvsEquipmentTxnFindNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentTxnFindNoOpRequest extends InvsEquipmentTxnRequest {
/**
 *
 * Constructor to create a   InvsEquipmentTxnFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentTxnFindNoOpRequest(String id, InvsEquipmentTxnObjectDataList noOpIn) {
    super(id, "InvsEquipmentTxnFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsEquipmentTxnObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipmentTxn", noOpIn);
      }
      addInput("InvsEquipmentTxn", mapList);
    }
  }
/**
 *
 * Retrieves the InvsEquipmentTxnObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentTxnObjectDataList getOutput() {
    return InvsEquipmentTxnObjectHelper.fromMapList(outputMap, "InvsEquipmentTxnList");
  }
}
