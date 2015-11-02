/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailByAccountFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoiceDetailByAccountFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoiceDetailByAccountFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvoiceDetailObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvoiceDetailByAccountFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoiceDetailByAccountFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceDetailObjectDataList noOpInIn) {
    super(id, context, "InvoiceDetailByAccountFind");
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
        mapArray[i] = InvoiceDetailObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvoiceDetail", noOpIn);
      }
      addInput("InvoiceDetail", mapList);
    }
  }
/**
 *
 * Sets the  InvoiceDetail
 * @param noOpInIn InvoiceDetailObjectDataList to set
 *
 */
  public void setInvoiceDetail(InvoiceDetailObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvoiceDetail passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceDetailObjectDataList getInvoiceDetail() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvoiceDetailObjectHelper.fromMapList(inputMap, "InvoiceDetailList");
  }
}
