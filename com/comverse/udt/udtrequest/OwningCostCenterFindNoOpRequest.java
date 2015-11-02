/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterFindNoOpRequest.java
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
 * NoOp class used to simulate a OwningCostCenterFindNoOpRequest Udt Request/Response
 *
 */
public class OwningCostCenterFindNoOpRequest extends OwningCostCenterRequest {
/**
 *
 * Constructor to create a   OwningCostCenterFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OwningCostCenterFindNoOpRequest(String id, OwningCostCenterObjectDataList noOpIn) {
    super(id, "OwningCostCenterFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = OwningCostCenterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OwningCostCenter", noOpIn);
      }
      addInput("OwningCostCenter", mapList);
    }
  }
/**
 *
 * Retrieves the OwningCostCenterObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public OwningCostCenterObjectDataList getOutput() {
    return OwningCostCenterObjectHelper.fromMapList(outputMap, "OwningCostCenterList");
  }
}
