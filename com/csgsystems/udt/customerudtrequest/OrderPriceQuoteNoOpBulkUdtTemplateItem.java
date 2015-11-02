/*
 * Generated code DO NOT EDIT
 * Generated file: OrderPriceQuoteNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a OrderPriceQuoteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderPriceQuoteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillInvoiceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   OrderPriceQuoteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderPriceQuoteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInvoiceObjectDataList noOpInIn) {
    super(id, context, "OrderPriceQuote");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = BillInvoiceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PriceQuoteOut", noOpIn);
      }
      addInput("PriceQuoteOut", mapList);
    }
  }
/**
 *
 * Sets the  PriceQuoteOut
 * @param noOpInIn BillInvoiceObjectDataList to set
 *
 */
  public void setPriceQuoteOut(BillInvoiceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PriceQuoteOut passed into the constructor
 * @return Simulated response
 *
 */
  public BillInvoiceObjectDataList getPriceQuoteOut() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillInvoiceObjectHelper.fromMapList(inputMap, "PriceQuoteOutList");
  }
}
