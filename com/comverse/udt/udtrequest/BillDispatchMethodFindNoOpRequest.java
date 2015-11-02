/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillDispatchMethodFindNoOpRequest.java
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
 * NoOp class used to simulate a BillDispatchMethodFindNoOpRequest Udt Request/Response
 *
 */
public class BillDispatchMethodFindNoOpRequest extends BillDispatchMethodRequest {
/**
 *
 * Constructor to create a   BillDispatchMethodFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillDispatchMethodFindNoOpRequest(String id, BillDispatchMethodObjectDataList noOpIn) {
    super(id, "BillDispatchMethodFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BillDispatchMethodObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillDispatchMethod", noOpIn);
      }
      addInput("BillDispatchMethod", mapList);
    }
  }
/**
 *
 * Retrieves the BillDispatchMethodObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BillDispatchMethodObjectDataList getOutput() {
    return BillDispatchMethodObjectHelper.fromMapList(outputMap, "BillDispatchMethodList");
  }
}
