/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a InvContainerExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class InvContainerExtendedDataFindNoOpRequest extends InvContainerRequest {
/**
 *
 * Constructor to create a   InvContainerExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvContainerExtendedDataFindNoOpRequest(String id, InvContainerEDObjectDataList noOpIn) {
    super(id, "InvContainerExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvContainerEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvContainerExtendedData", noOpIn);
      }
      addInput("InvContainerExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the InvContainerEDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvContainerEDObjectDataList getOutput() {
    return InvContainerEDObjectHelper.fromMapList(outputMap, "InvContainerExtendedDataList");
  }
}
