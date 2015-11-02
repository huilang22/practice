/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailAmountGetBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceDetailAmountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceDetailAmountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceDetailObjectKeyData InvoiceDetailAmountIn;
/**
 *
 * Constructor to create a  InvoiceDetailAmountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceDetailAmountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceDetailObjectKeyData InvoiceDetailAmountInIn) {
    super(id, context, "InvoiceDetailAmountGet");
    InvoiceDetailAmountIn = InvoiceDetailAmountInIn;
  }

  public void translateToMap() {
    if (InvoiceDetailAmountIn != null) {
      InvoiceDetailAmountIn.resetFlags(true, true);
      addInput("InvoiceDetail", InvoiceDetailObjectKeyHelper.toMap(InvoiceDetailAmountIn, new HashMap(), "InvoiceDetailObjectKeyData").get("InvoiceDetailObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvoiceDetail
 * @param InvoiceDetailAmountInIn Value of the InvoiceDetailAmountIn
 *
 */

  public void setInvoiceDetail(InvoiceDetailObjectKeyData InvoiceDetailAmountInIn) {
    InvoiceDetailAmountIn = InvoiceDetailAmountInIn;
  }

  public void translateFromMap() {
    InvoiceDetailAmountIn = InvoiceDetailObjectKeyHelper.fromMap(inputMap, "InvoiceDetail");
  }

/**
 *
 * Gets the InvoiceDetail
 * @return Value of the InvoiceDetail
 *
 */

  public InvoiceDetailObjectKeyData getInvoiceDetail( ) {
    return InvoiceDetailAmountIn;
  }

}
