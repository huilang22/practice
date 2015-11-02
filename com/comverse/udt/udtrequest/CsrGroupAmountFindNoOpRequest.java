/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountFindNoOpRequest.java
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
 * NoOp class used to simulate a CsrGroupAmountFindNoOpRequest Udt Request/Response
 *
 */
public class CsrGroupAmountFindNoOpRequest extends CsrGroupAmountRequest {
/**
 *
 * Constructor to create a   CsrGroupAmountFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CsrGroupAmountFindNoOpRequest(String id, CsrGroupAmountObjectDataList noOpIn) {
    super(id, "CsrGroupAmountFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CsrGroupAmountObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CsrGroupAmount", noOpIn);
      }
      addInput("CsrGroupAmount", mapList);
    }
  }
/**
 *
 * Retrieves the CsrGroupAmountObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CsrGroupAmountObjectDataList getOutput() {
    return CsrGroupAmountObjectHelper.fromMapList(outputMap, "CsrGroupAmountList");
  }
}
