/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipTxnPostconditionsFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsEquipTxnPostconditionsFindNoOpRequest Udt Request/Response
 *
 */
public class InvsEquipTxnPostconditionsFindNoOpRequest extends InvsEquipTxnPostconditionsRequest {
/**
 *
 * Constructor to create a   InvsEquipTxnPostconditionsFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsEquipTxnPostconditionsFindNoOpRequest(String id, InvsEquipTxnPostconditionsObjectDataList noOpIn) {
    super(id, "InvsEquipTxnPostconditionsFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsEquipTxnPostconditionsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipTxnPostconditions", noOpIn);
      }
      addInput("InvsEquipTxnPostconditions", mapList);
    }
  }
/**
 *
 * Retrieves the InvsEquipTxnPostconditionsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipTxnPostconditionsObjectDataList getOutput() {
    return InvsEquipTxnPostconditionsObjectHelper.fromMapList(outputMap, "InvsEquipTxnPostconditionsList");
  }
}
