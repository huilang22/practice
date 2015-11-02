/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentFindNoOpRequest.java
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
 * NoOp class used to simulate a CustomerDocumentFindNoOpRequest Udt Request/Response
 *
 */
public class CustomerDocumentFindNoOpRequest extends CustomerDocumentRequest {
/**
 *
 * Constructor to create a   CustomerDocumentFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerDocumentFindNoOpRequest(String id, CustomerDocumentObjectDataList noOpIn) {
    super(id, "CustomerDocumentFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CustomerDocumentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerDocument", noOpIn);
      }
      addInput("CustomerDocument", mapList);
    }
  }
/**
 *
 * Retrieves the CustomerDocumentObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerDocumentObjectDataList getOutput() {
    return CustomerDocumentObjectHelper.fromMapList(outputMap, "CustomerDocumentList");
  }
}
