/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupMapFindNoOpRequest.java
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
 * NoOp class used to simulate a BillMessageGroupMapFindNoOpRequest Udt Request/Response
 *
 */
public class BillMessageGroupMapFindNoOpRequest extends BillMessageGroupMapRequest {
/**
 *
 * Constructor to create a   BillMessageGroupMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillMessageGroupMapFindNoOpRequest(String id, BillMessageGroupMapObjectDataList noOpIn) {
    super(id, "BillMessageGroupMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BillMessageGroupMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillMessageGroupMap", noOpIn);
      }
      addInput("BillMessageGroupMap", mapList);
    }
  }
/**
 *
 * Retrieves the BillMessageGroupMapObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BillMessageGroupMapObjectDataList getOutput() {
    return BillMessageGroupMapObjectHelper.fromMapList(outputMap, "BillMessageGroupMapList");
  }
}
