/*
 * Generated code DO NOT EDIT
 * Generated file: OrderQuoteQuotePriceNoOpBulkUdtTemplateItem.java
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

/**
 *
 * NoOp class used to simulate a OrderQuoteQuotePriceNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OrderQuoteQuotePriceNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillInvoiceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   OrderQuoteQuotePriceNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OrderQuoteQuotePriceNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInvoiceObjectDataList noOpInIn) {
    super(id, context, "OrderQuoteQuotePrice");
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
        addInput("OqqpBillInvoiceOut", noOpIn);
      }
      addInput("OqqpBillInvoiceOut", mapList);
    }
  }
/**
 *
 * Sets the  OqqpBillInvoiceOut
 * @param noOpInIn BillInvoiceObjectDataList to set
 *
 */
  public void setOqqpBillInvoiceOut(BillInvoiceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OqqpBillInvoiceOut passed into the constructor
 * @return Simulated response
 *
 */
  public BillInvoiceObjectDataList getOqqpBillInvoiceOut() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillInvoiceObjectHelper.fromMapList(inputMap, "OqqpBillInvoiceOutList");
  }
}
