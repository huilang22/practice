/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillCycleFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BillCycleFindNoOpRequest Udt Request/Response
 *
 */
public class BillCycleFindNoOpRequest extends BillCycleRequest {
/**
 *
 * Constructor to create a   BillCycleFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillCycleFindNoOpRequest(String id, BillCycleObjectDataList noOpIn) {
    super(id, "BillCycleFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BillCycleObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillCycle", noOpIn);
      }
      addInput("BillCycle", mapList);
    }
  }
/**
 *
 * Retrieves the BillCycleObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BillCycleObjectDataList getOutput() {
    return BillCycleObjectHelper.fromMapList(outputMap, "BillCycleList");
  }
}
