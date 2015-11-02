/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceReissueFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoiceReissueFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoiceReissueFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvoiceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvoiceReissueFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoiceReissueFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectDataList noOpInIn) {
    super(id, context, "InvoiceReissueFind");
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
        mapArray[i] = InvoiceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Invoice", noOpIn);
      }
      addInput("Invoice", mapList);
    }
  }
/**
 *
 * Sets the  Invoice
 * @param noOpInIn InvoiceObjectDataList to set
 *
 */
  public void setInvoice(InvoiceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Invoice passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceObjectDataList getInvoice() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvoiceObjectHelper.fromMapList(inputMap, "InvoiceList");
  }
}
