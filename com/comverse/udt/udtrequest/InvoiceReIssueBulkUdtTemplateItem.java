/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceReIssueBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceReIssueBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceReIssueBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceObjectKeyData InvoiceReissueIn;
  protected Integer bill_disp_meth;
/**
 *
 * Constructor to create a  InvoiceReIssueBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceReIssueBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectKeyData InvoiceReissueInIn, Integer bill_disp_methIn) {
    super(id, context, "InvoiceReIssue");
    InvoiceReissueIn = InvoiceReissueInIn;
    bill_disp_meth = bill_disp_methIn;
  }

  public void translateToMap() {
    if (InvoiceReissueIn != null) {
      InvoiceReissueIn.resetFlags(true, true);
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(InvoiceReissueIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
    if (bill_disp_meth != null) {
      addInput("BillDispMeth", bill_disp_meth);
    }
  }


/**
 *
 * Sets the Invoice
 * @param InvoiceReissueInIn Value of the InvoiceReissueIn
 *
 */

  public void setInvoice(InvoiceObjectKeyData InvoiceReissueInIn) {
    InvoiceReissueIn = InvoiceReissueInIn;
  }

/**
 *
 * Sets the BillDispMeth
 * @param bill_disp_methIn Value of the bill_disp_meth
 *
 */

  public void setBillDispMeth(Integer bill_disp_methIn) {
    bill_disp_meth = bill_disp_methIn;
  }

  public void translateFromMap() {
    InvoiceReissueIn = InvoiceObjectKeyHelper.fromMap(inputMap, "Invoice");
    bill_disp_meth = (Integer)inputMap.get("BillDispMeth");
  }

/**
 *
 * Gets the Invoice
 * @return Value of the Invoice
 *
 */

  public InvoiceObjectKeyData getInvoice( ) {
    return InvoiceReissueIn;
  }

/**
 *
 * Gets the BillDispMeth
 * @return Value of the BillDispMeth
 *
 */

  public Integer getBillDispMeth( ) {
    return bill_disp_meth;
  }

}
