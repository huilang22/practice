/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementFindPendingExtendedDataNoOpRequest.java
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
 * NoOp class used to simulate a InvElementFindPendingExtendedDataNoOpRequest Udt Request/Response
 *
 */
public class InvElementFindPendingExtendedDataNoOpRequest extends InvElementRequest {
/**
 *
 * Constructor to create a   InvElementFindPendingExtendedDataNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvElementFindPendingExtendedDataNoOpRequest(String id, InvElementEDObjDataList noOpIn) {
    super(id, "InvElementFindPendingExtendedDataNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvElementEDObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvElementPendingExtendedData", noOpIn);
      }
      addInput("InvElementPendingExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the InvElementEDObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementEDObjDataList getOutput() {
    return InvElementEDObjHelper.fromMapList(outputMap, "InvElementPendingExtendedDataList");
  }
}
