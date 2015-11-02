/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPreconditionsFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipTxnPreconditionsFindNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipTxnPreconditionsFindNoOpRequest extends InvsEquipTxnPreconditionsRequest {
/**
 *
 * Constructor to create a   InvsEquipTxnPreconditionsFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipTxnPreconditionsFindNoOpRequest(String id, InvsEquipTxnPreconditionsObjectDataList noOpIn) {
    super(id, "InvsEquipTxnPreconditionsFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsEquipTxnPreconditionsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipTxnPreconditions", noOpIn);
      }
      addInput("InvsEquipTxnPreconditions", mapList);
    }
  }
/**
 *
 * Retrieves the InvsEquipTxnPreconditionsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipTxnPreconditionsObjectDataList getOutput() {
    return InvsEquipTxnPreconditionsObjectHelper.fromMapList(outputMap, "InvsEquipTxnPreconditionsList");
  }
}
