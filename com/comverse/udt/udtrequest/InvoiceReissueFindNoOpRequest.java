/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceReissueFindNoOpRequest.java
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
 * NoOp class used to simulate a InvoiceReissueFindNoOpRequest Udt Request/Response
 *
 */
public class InvoiceReissueFindNoOpRequest extends InvoiceRequest {
/**
 *
 * Constructor to create a   InvoiceReissueFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoiceReissueFindNoOpRequest(String id, InvoiceObjectDataList noOpIn) {
    super(id, "InvoiceReissueFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvoiceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Invoice", noOpIn);
      }
      addInput("Invoice", mapList);
    }
  }
/**
 *
 * Retrieves the InvoiceObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceObjectDataList getOutput() {
    return InvoiceObjectHelper.fromMapList(outputMap, "InvoiceList");
  }
}
