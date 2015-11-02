/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtendedDataFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvdMainExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class InvdMainExtendedDataFindNoOpRequest extends InvdMainRequest {
/**
 *
 * Constructor to create a   InvdMainExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdMainExtendedDataFindNoOpRequest(String id, InvdMainEDObjectDataList noOpIn) {
    super(id, "InvdMainExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvdMainEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdMain", noOpIn);
      }
      addInput("InvdMain", mapList);
    }
  }
/**
 *
 * Retrieves the InvdMainEDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvdMainEDObjectDataList getOutput() {
    return InvdMainEDObjectHelper.fromMapList(outputMap, "InvdMainList");
  }
}
