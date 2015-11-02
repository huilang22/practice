/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailFindBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceDetailFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceDetailFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceDetailObjectFilter InvoiceDetailfindIn;
/**
 *
 * Constructor to create a  InvoiceDetailFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceDetailFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceDetailObjectFilter InvoiceDetailfindInIn) {
    super(id, context, "InvoiceDetailFind");
    InvoiceDetailfindIn = InvoiceDetailfindInIn;
  }

  public void translateToMap() {
    if (InvoiceDetailfindIn != null) {
      Integer index =  InvoiceDetailfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(InvoiceDetailfindIn, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }


/**
 *
 * Sets the InvoiceDetail
 * @param InvoiceDetailfindInIn Value of the InvoiceDetailfindIn
 *
 */

  public void setInvoiceDetail(InvoiceDetailObjectFilter InvoiceDetailfindInIn) {
    InvoiceDetailfindIn = InvoiceDetailfindInIn;
  }

  public void translateFromMap() {
    InvoiceDetailfindIn = InvoiceDetailObjectHelper.fromMapFilter(inputMap, "InvoiceDetail");
  }

/**
 *
 * Gets the InvoiceDetail
 * @return Value of the InvoiceDetail
 *
 */

  public InvoiceDetailObjectFilter getInvoiceDetail( ) {
    return InvoiceDetailfindIn;
  }

}
