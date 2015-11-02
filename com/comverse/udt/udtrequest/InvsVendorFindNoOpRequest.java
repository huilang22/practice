/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsVendorFindNoOpRequest Udt Request/Response
 *
 */
public class InvsVendorFindNoOpRequest extends InvsVendorRequest {
/**
 *
 * Constructor to create a   InvsVendorFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsVendorFindNoOpRequest(String id, InvsVendorObjectDataList noOpIn) {
    super(id, "InvsVendorFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsVendorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsVendor", noOpIn);
      }
      addInput("InvsVendor", mapList);
    }
  }
/**
 *
 * Retrieves the InvsVendorObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVendorObjectDataList getOutput() {
    return InvsVendorObjectHelper.fromMapList(outputMap, "InvsVendorList");
  }
}
