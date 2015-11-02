/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillFindNoOpRequest.java
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
 * NoOp class used to simulate a InterimBillFindNoOpRequest Udt Request/Response
 *
 */
public class InterimBillFindNoOpRequest extends InterimBillRequest {
/**
 *
 * Constructor to create a   InterimBillFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InterimBillFindNoOpRequest(String id, InterimBillObjectDataList noOpIn) {
    super(id, "InterimBillFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InterimBillObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InterimBill", noOpIn);
      }
      addInput("InterimBill", mapList);
    }
  }
/**
 *
 * Retrieves the InterimBillObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InterimBillObjectDataList getOutput() {
    return InterimBillObjectHelper.fromMapList(outputMap, "InterimBillList");
  }
}
