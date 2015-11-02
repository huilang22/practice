/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderPriceQuoteNoOpRequest.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OrderPriceQuoteNoOpRequest Udt Request/Response
 *
 */
public class OrderPriceQuoteNoOpRequest extends OrderRequest {
/**
 *
 * Constructor to create a   OrderPriceQuoteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OrderPriceQuoteNoOpRequest(String id, BillInvoiceObjectDataList noOpIn) {
    super(id, "OrderPriceQuoteNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BillInvoiceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PriceQuoteOut", noOpIn);
      }
      addInput("PriceQuoteOut", mapList);
    }
  }
/**
 *
 * Retrieves the BillInvoiceObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BillInvoiceObjectDataList getOutput() {
    return BillInvoiceObjectHelper.fromMapList(outputMap, "PriceQuoteOutList");
  }
}
