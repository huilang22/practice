/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffFindNoOpRequest.java
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
 * NoOp class used to simulate a BalanceXferDiffFindNoOpRequest Udt Request/Response
 *
 */
public class BalanceXferDiffFindNoOpRequest extends BalanceXferDiffRequest {
/**
 *
 * Constructor to create a   BalanceXferDiffFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BalanceXferDiffFindNoOpRequest(String id, BXDObjectDataList noOpIn) {
    super(id, "BalanceXferDiffFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BXDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BalanceXferDiff", noOpIn);
      }
      addInput("BalanceXferDiff", mapList);
    }
  }
/**
 *
 * Retrieves the BXDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BXDObjectDataList getOutput() {
    return BXDObjectHelper.fromMapList(outputMap, "BalanceXferDiffList");
  }
}
