/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupFindNoOpRequest.java
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
 * NoOp class used to simulate a BillMessageGroupFindNoOpRequest Udt Request/Response
 *
 */
public class BillMessageGroupFindNoOpRequest extends BillMessageGroupRequest {
/**
 *
 * Constructor to create a   BillMessageGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillMessageGroupFindNoOpRequest(String id, BillMessageGroupObjectDataList noOpIn) {
    super(id, "BillMessageGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BillMessageGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillMessageGroup", noOpIn);
      }
      addInput("BillMessageGroup", mapList);
    }
  }
/**
 *
 * Retrieves the BillMessageGroupObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BillMessageGroupObjectDataList getOutput() {
    return BillMessageGroupObjectHelper.fromMapList(outputMap, "BillMessageGroupList");
  }
}
