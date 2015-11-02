/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RevRcvCostCenterFindNoOpRequest.java
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
 * NoOp class used to simulate a RevRcvCostCenterFindNoOpRequest Udt Request/Response
 *
 */
public class RevRcvCostCenterFindNoOpRequest extends RevRcvCostCenterRequest {
/**
 *
 * Constructor to create a   RevRcvCostCenterFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RevRcvCostCenterFindNoOpRequest(String id, RevRcvCostCenterObjectDataList noOpIn) {
    super(id, "RevRcvCostCenterFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RevRcvCostCenterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RevRcvCostCenter", noOpIn);
      }
      addInput("RevRcvCostCenter", mapList);
    }
  }
/**
 *
 * Retrieves the RevRcvCostCenterObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RevRcvCostCenterObjectDataList getOutput() {
    return RevRcvCostCenterObjectHelper.fromMapList(outputMap, "RevRcvCostCenterList");
  }
}
