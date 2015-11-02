/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillFmtOptFindNoOpRequest.java
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
 * NoOp class used to simulate a BillFmtOptFindNoOpRequest Udt Request/Response
 *
 */
public class BillFmtOptFindNoOpRequest extends BillFmtOptRequest {
/**
 *
 * Constructor to create a   BillFmtOptFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillFmtOptFindNoOpRequest(String id, BllFmtOptObjectDataList noOpIn) {
    super(id, "BillFmtOptFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BllFmtOptObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillFmtOpt", noOpIn);
      }
      addInput("BillFmtOpt", mapList);
    }
  }
/**
 *
 * Retrieves the BllFmtOptObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BllFmtOptObjectDataList getOutput() {
    return BllFmtOptObjectHelper.fromMapList(outputMap, "BillFmtOptList");
  }
}
