/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a DepositTypeFindNoOpRequest Udt Request/Response
 *
 */
public class DepositTypeFindNoOpRequest extends DepositTypeRequest {
/**
 *
 * Constructor to create a   DepositTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DepositTypeFindNoOpRequest(String id, DepositTypeObjectDataList noOpIn) {
    super(id, "DepositTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DepositTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DepositType", noOpIn);
      }
      addInput("DepositType", mapList);
    }
  }
/**
 *
 * Retrieves the DepositTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DepositTypeObjectDataList getOutput() {
    return DepositTypeObjectHelper.fromMapList(outputMap, "DepositTypeList");
  }
}
