/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupMapFindNoOpRequest.java
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
 * NoOp class used to simulate a BillInsertGroupMapFindNoOpRequest Udt Request/Response
 *
 */
public class BillInsertGroupMapFindNoOpRequest extends BillInsertGroupMapRequest {
/**
 *
 * Constructor to create a   BillInsertGroupMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillInsertGroupMapFindNoOpRequest(String id, BillInsertGroupMapObjectDataList noOpIn) {
    super(id, "BillInsertGroupMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BillInsertGroupMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillInsertGroupMap", noOpIn);
      }
      addInput("BillInsertGroupMap", mapList);
    }
  }
/**
 *
 * Retrieves the BillInsertGroupMapObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BillInsertGroupMapObjectDataList getOutput() {
    return BillInsertGroupMapObjectHelper.fromMapList(outputMap, "BillInsertGroupMapList");
  }
}
