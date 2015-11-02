/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeEquipTxnAssocFindcommontxnNoOpRequest.java
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
 * NoOp class used to simulate a InvsTypeEquipTxnAssocFindcommontxnNoOpRequest Udt Request/Response
 *
 */
public class InvsTypeEquipTxnAssocFindcommontxnNoOpRequest extends InvsTypeEquipTxnAssocRequest {
/**
 *
 * Constructor to create a   InvsTypeEquipTxnAssocFindcommontxnNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsTypeEquipTxnAssocFindcommontxnNoOpRequest(String id, ITETAEquipmentTransactionIdObjectDataList noOpIn) {
    super(id, "InvsTypeEquipTxnAssocFindcommontxnNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ITETAEquipmentTransactionIdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsTypeEquipTxnAssoc", noOpIn);
      }
      addInput("InvsTypeEquipTxnAssoc", mapList);
    }
  }
/**
 *
 * Retrieves the ITETAEquipmentTransactionIdObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ITETAEquipmentTransactionIdObjectDataList getOutput() {
    return ITETAEquipmentTransactionIdObjectHelper.fromMapList(outputMap, "InvsTypeEquipTxnAssocList");
  }
}
