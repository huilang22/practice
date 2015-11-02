/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailByAccountFindBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceDetailByAccountFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceDetailByAccountFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindIn;
  protected Boolean LatestInvoice;
/**
 *
 * Constructor to create a  InvoiceDetailByAccountFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceDetailByAccountFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindInIn, Boolean LatestInvoiceIn) {
    super(id, context, "InvoiceDetailByAccountFind");
    InvoiceDetailAccountfindIn = InvoiceDetailAccountfindInIn;
    LatestInvoice = LatestInvoiceIn;
  }

  public void translateToMap() {
    if (InvoiceDetailAccountfindIn != null) {
      Integer index =  InvoiceDetailAccountfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvoiceDetail", InvoiceDetailAccountObjectHelper.toMap(InvoiceDetailAccountfindIn, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
    if (LatestInvoice != null) {
      addInput("LatestInvoice", LatestInvoice);
    }
  }


/**
 *
 * Sets the InvoiceDetail
 * @param InvoiceDetailAccountfindInIn Value of the InvoiceDetailAccountfindIn
 *
 */

  public void setInvoiceDetail(InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindInIn) {
    InvoiceDetailAccountfindIn = InvoiceDetailAccountfindInIn;
  }

/**
 *
 * Sets the LatestInvoice
 * @param LatestInvoiceIn Value of the LatestInvoice
 *
 */

  public void setLatestInvoice(Boolean LatestInvoiceIn) {
    LatestInvoice = LatestInvoiceIn;
  }

  public void translateFromMap() {
    InvoiceDetailAccountfindIn = InvoiceDetailAccountObjectHelper.fromMapFilter(inputMap, "InvoiceDetail");
    LatestInvoice = (Boolean)inputMap.get("LatestInvoice");
  }

/**
 *
 * Gets the InvoiceDetail
 * @return Value of the InvoiceDetail
 *
 */

  public InvoiceDetailAccountObjectFilter getInvoiceDetail( ) {
    return InvoiceDetailAccountfindIn;
  }

/**
 *
 * Gets the LatestInvoice
 * @return Value of the LatestInvoice
 *
 */

  public Boolean getLatestInvoice( ) {
    return LatestInvoice;
  }

}
