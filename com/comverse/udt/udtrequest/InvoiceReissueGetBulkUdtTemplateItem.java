/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceReissueGetBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceReissueGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceReissueGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceObjectKeyData InvoiceRgetIn;
/**
 *
 * Constructor to create a  InvoiceReissueGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceReissueGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceObjectKeyData InvoiceRgetInIn) {
    super(id, context, "InvoiceReissueGet");
    InvoiceRgetIn = InvoiceRgetInIn;
  }

  public void translateToMap() {
    if (InvoiceRgetIn != null) {
      InvoiceRgetIn.resetFlags(true, true);
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(InvoiceRgetIn, new HashMap(), "InvoiceObjectKeyData").get("InvoiceObjectKeyData"));
    }
  }


/**
 *
 * Sets the Invoice
 * @param InvoiceRgetInIn Value of the InvoiceRgetIn
 *
 */

  public void setInvoice(InvoiceObjectKeyData InvoiceRgetInIn) {
    InvoiceRgetIn = InvoiceRgetInIn;
  }

  public void translateFromMap() {
    InvoiceRgetIn = InvoiceObjectKeyHelper.fromMap(inputMap, "Invoice");
  }

/**
 *
 * Gets the Invoice
 * @return Value of the Invoice
 *
 */

  public InvoiceObjectKeyData getInvoice( ) {
    return InvoiceRgetIn;
  }

}
