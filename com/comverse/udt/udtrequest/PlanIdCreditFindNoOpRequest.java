/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdCreditFindNoOpRequest.java
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
 * NoOp class used to simulate a PlanIdCreditFindNoOpRequest Udt Request/Response
 *
 */
public class PlanIdCreditFindNoOpRequest extends PlanIdCreditRequest {
/**
 *
 * Constructor to create a   PlanIdCreditFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PlanIdCreditFindNoOpRequest(String id, PlanIdCreditObjectDataList noOpIn) {
    super(id, "PlanIdCreditFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PlanIdCreditObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PlanIdCredit", noOpIn);
      }
      addInput("PlanIdCredit", mapList);
    }
  }
/**
 *
 * Retrieves the PlanIdCreditObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PlanIdCreditObjectDataList getOutput() {
    return PlanIdCreditObjectHelper.fromMapList(outputMap, "PlanIdCreditList");
  }
}
