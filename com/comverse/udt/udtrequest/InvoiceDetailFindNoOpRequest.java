/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailFindNoOpRequest.java
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
 * NoOp class used to simulate a InvoiceDetailFindNoOpRequest Udt Request/Response
 *
 */
public class InvoiceDetailFindNoOpRequest extends InvoiceDetailRequest {
/**
 *
 * Constructor to create a   InvoiceDetailFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoiceDetailFindNoOpRequest(String id, InvoiceDetailObjectDataList noOpIn) {
    super(id, "InvoiceDetailFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvoiceDetailObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvoiceDetail", noOpIn);
      }
      addInput("InvoiceDetail", mapList);
    }
  }
/**
 *
 * Retrieves the InvoiceDetailObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceDetailObjectDataList getOutput() {
    return InvoiceDetailObjectHelper.fromMapList(outputMap, "InvoiceDetailList");
  }
}
