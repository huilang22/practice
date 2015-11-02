/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerServiceCenterFindNoOpRequest.java
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
 * NoOp class used to simulate a CustomerServiceCenterFindNoOpRequest Udt Request/Response
 *
 */
public class CustomerServiceCenterFindNoOpRequest extends CustomerServiceCenterRequest {
/**
 *
 * Constructor to create a   CustomerServiceCenterFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerServiceCenterFindNoOpRequest(String id, CustomerServiceCenterObjectDataList noOpIn) {
    super(id, "CustomerServiceCenterFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CustomerServiceCenterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerServiceCenter", noOpIn);
      }
      addInput("CustomerServiceCenter", mapList);
    }
  }
/**
 *
 * Retrieves the CustomerServiceCenterObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerServiceCenterObjectDataList getOutput() {
    return CustomerServiceCenterObjectHelper.fromMapList(outputMap, "CustomerServiceCenterList");
  }
}
