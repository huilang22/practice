/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorRefFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsVendorRefFindNoOpRequest Udt Request/Response
 *
 */
public class InvsVendorRefFindNoOpRequest extends InvsVendorRefRequest {
/**
 *
 * Constructor to create a   InvsVendorRefFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsVendorRefFindNoOpRequest(String id, InvsVendorRefObjectDataList noOpIn) {
    super(id, "InvsVendorRefFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsVendorRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsVendorRef", noOpIn);
      }
      addInput("InvsVendorRef", mapList);
    }
  }
/**
 *
 * Retrieves the InvsVendorRefObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVendorRefObjectDataList getOutput() {
    return InvsVendorRefObjectHelper.fromMapList(outputMap, "InvsVendorRefList");
  }
}
