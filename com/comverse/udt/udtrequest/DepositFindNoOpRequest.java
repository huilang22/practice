/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositFindNoOpRequest.java
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
 * NoOp class used to simulate a DepositFindNoOpRequest Udt Request/Response
 *
 */
public class DepositFindNoOpRequest extends DepositRequest {
/**
 *
 * Constructor to create a   DepositFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DepositFindNoOpRequest(String id, DepositObjectDataList noOpIn) {
    super(id, "DepositFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DepositObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Deposit", noOpIn);
      }
      addInput("Deposit", mapList);
    }
  }
/**
 *
 * Retrieves the DepositObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DepositObjectDataList getOutput() {
    return DepositObjectHelper.fromMapList(outputMap, "DepositList");
  }
}
