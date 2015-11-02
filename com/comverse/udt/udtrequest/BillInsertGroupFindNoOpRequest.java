/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupFindNoOpRequest.java
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
 * NoOp class used to simulate a BillInsertGroupFindNoOpRequest Udt Request/Response
 *
 */
public class BillInsertGroupFindNoOpRequest extends BillInsertGroupRequest {
/**
 *
 * Constructor to create a   BillInsertGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillInsertGroupFindNoOpRequest(String id, BillInsertGroupObjectDataList noOpIn) {
    super(id, "BillInsertGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BillInsertGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillInsertGroup", noOpIn);
      }
      addInput("BillInsertGroup", mapList);
    }
  }
/**
 *
 * Retrieves the BillInsertGroupObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BillInsertGroupObjectDataList getOutput() {
    return BillInsertGroupObjectHelper.fromMapList(outputMap, "BillInsertGroupList");
  }
}
