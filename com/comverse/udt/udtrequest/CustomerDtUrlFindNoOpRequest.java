/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDtUrlFindNoOpRequest.java
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
 * NoOp class used to simulate a CustomerDtUrlFindNoOpRequest Udt Request/Response
 *
 */
public class CustomerDtUrlFindNoOpRequest extends CustomerDtUrlRequest {
/**
 *
 * Constructor to create a   CustomerDtUrlFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerDtUrlFindNoOpRequest(String id, CustomerDtUrlObjectDataList noOpIn) {
    super(id, "CustomerDtUrlFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CustomerDtUrlObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerDtUrl", noOpIn);
      }
      addInput("CustomerDtUrl", mapList);
    }
  }
/**
 *
 * Retrieves the CustomerDtUrlObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerDtUrlObjectDataList getOutput() {
    return CustomerDtUrlObjectHelper.fromMapList(outputMap, "CustomerDtUrlList");
  }
}
