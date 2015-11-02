/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInvoiceDetailAmountGetNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BillInvoiceDetailAmountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillInvoiceDetailAmountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillInvoiceDetailAmountObjectData noOpIn;

/**
 *
 * Constructor to create a   BillInvoiceDetailAmountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillInvoiceDetailAmountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillInvoiceDetailAmountObjectData noOpInIn) {
    super(id, context, "BillInvoiceDetailAmountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillInvoiceDetailAmount", BillInvoiceDetailAmountObjectHelper.toMap(noOpIn, new HashMap(), "BillInvoiceDetailAmount").get("BillInvoiceDetailAmount"));
    }
  }
/**
 *
 * Sets the  BillInvoiceDetailAmount
 * @param noOpInIn BillInvoiceDetailAmountObjectData to set
 *
 */
  public void setBillInvoiceDetailAmount(BillInvoiceDetailAmountObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillInvoiceDetailAmount passed into the constructor
 * @return Simulated response
 *
 */
  public BillInvoiceDetailAmountObjectData getBillInvoiceDetailAmount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillInvoiceDetailAmountObjectHelper.fromMap(inputMap, "BillInvoiceDetailAmount");
  }
}
