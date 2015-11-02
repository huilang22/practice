/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailBulkAdjustmentGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a InvoiceDetailBulkAdjustmentGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvoiceDetailBulkAdjustmentGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvoiceDetailBulkAdjustmentGetOutputData noOpIn;

/**
 *
 * Constructor to create a   InvoiceDetailBulkAdjustmentGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvoiceDetailBulkAdjustmentGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceDetailBulkAdjustmentGetOutputData noOpInIn) {
    super(id, context, "InvoiceDetailBulkAdjustmentGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvoiceDetailBulkAdjustmentGetOutputData", InvoiceDetailBulkAdjustmentGetOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  InvoiceDetailBulkAdjustmentGetOutputData
 * @param noOpInIn InvoiceDetailBulkAdjustmentGetOutputData to set
 *
 */
  public void setInvoiceDetailBulkAdjustmentGetOutputData(InvoiceDetailBulkAdjustmentGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvoiceDetailBulkAdjustmentGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceDetailBulkAdjustmentGetOutputData getInvoiceDetailBulkAdjustmentGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvoiceDetailBulkAdjustmentGetOutputHelper.fromMap(inputMap);
  }
}
