/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDtServerFindNoOpRequest.java
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
 * NoOp class used to simulate a CustomerDtServerFindNoOpRequest Udt Request/Response
 *
 */
public class CustomerDtServerFindNoOpRequest extends CustomerDtServerRequest {
/**
 *
 * Constructor to create a   CustomerDtServerFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerDtServerFindNoOpRequest(String id, CustomerDtServerObjectDataList noOpIn) {
    super(id, "CustomerDtServerFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CustomerDtServerObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerDtServer", noOpIn);
      }
      addInput("CustomerDtServer", mapList);
    }
  }
/**
 *
 * Retrieves the CustomerDtServerObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerDtServerObjectDataList getOutput() {
    return CustomerDtServerObjectHelper.fromMapList(outputMap, "CustomerDtServerList");
  }
}
