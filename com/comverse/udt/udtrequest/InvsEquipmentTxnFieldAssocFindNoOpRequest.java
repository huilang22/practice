/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFieldAssocFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipmentTxnFieldAssocFindNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipmentTxnFieldAssocFindNoOpRequest extends InvsEquipmentTxnFieldAssocRequest {
/**
 *
 * Constructor to create a   InvsEquipmentTxnFieldAssocFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipmentTxnFieldAssocFindNoOpRequest(String id, InvsEquipmentTxnFieldTablesObjectDataList noOpIn) {
    super(id, "InvsEquipmentTxnFieldAssocFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsEquipmentTxnFieldTablesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipmentTxnFieldAssoc", noOpIn);
      }
      addInput("InvsEquipmentTxnFieldAssoc", mapList);
    }
  }
/**
 *
 * Retrieves the InvsEquipmentTxnFieldTablesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentTxnFieldTablesObjectDataList getOutput() {
    return InvsEquipmentTxnFieldTablesObjectHelper.fromMapList(outputMap, "InvsEquipmentTxnFieldAssocList");
  }
}
