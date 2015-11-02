/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvoiceDetailGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoiceDetailGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvoiceDetailObjectData noOpIn;

/**
 *
 * Constructor to create a   InvoiceDetailGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoiceDetailGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceDetailObjectData noOpInIn) {
    super(id, context, "InvoiceDetailGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(noOpIn, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }
/**
 *
 * Sets the  InvoiceDetail
 * @param noOpInIn InvoiceDetailObjectData to set
 *
 */
  public void setInvoiceDetail(InvoiceDetailObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvoiceDetail passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceDetailObjectData getInvoiceDetail() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvoiceDetailObjectHelper.fromMap(inputMap, "InvoiceDetail");
  }
}
