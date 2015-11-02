/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillClassFindNoOpRequest.java
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
 * NoOp class used to simulate a BillClassFindNoOpRequest Udt Request/Response
 *
 */
public class BillClassFindNoOpRequest extends BillClassRequest {
/**
 *
 * Constructor to create a   BillClassFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillClassFindNoOpRequest(String id, BCObjectDataList noOpIn) {
    super(id, "BillClassFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillClass", noOpIn);
      }
      addInput("BillClass", mapList);
    }
  }
/**
 *
 * Retrieves the BCObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BCObjectDataList getOutput() {
    return BCObjectHelper.fromMapList(outputMap, "BillClassList");
  }
}
