/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a InvElementExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class InvElementExtendedDataFindNoOpRequest extends InvElementRequest {
/**
 *
 * Constructor to create a   InvElementExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvElementExtendedDataFindNoOpRequest(String id, InvElementEDObjDataList noOpIn) {
    super(id, "InvElementExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvElementEDObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvElementExtendedData", noOpIn);
      }
      addInput("InvElementExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the InvElementEDObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementEDObjDataList getOutput() {
    return InvElementEDObjHelper.fromMapList(outputMap, "InvElementExtendedDataList");
  }
}
