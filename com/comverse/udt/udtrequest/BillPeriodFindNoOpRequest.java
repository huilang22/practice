/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillPeriodFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a BillPeriodFindNoOpRequest Udt Request/Response
 *
 */
public class BillPeriodFindNoOpRequest extends BillPeriodRequest {
/**
 *
 * Constructor to create a   BillPeriodFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillPeriodFindNoOpRequest(String id, BPObjectDataList noOpIn) {
    super(id, "BillPeriodFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BPObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillPeriod", noOpIn);
      }
      addInput("BillPeriod", mapList);
    }
  }
/**
 *
 * Retrieves the BPObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BPObjectDataList getOutput() {
    return BPObjectHelper.fromMapList(outputMap, "BillPeriodList");
  }
}
