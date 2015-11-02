/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailByAccountFindCountBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceDetailByAccountFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceDetailByAccountFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindCountIn;
  protected Boolean LatestInvoice1;
/**
 *
 * Constructor to create a  InvoiceDetailByAccountFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceDetailByAccountFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindCountInIn, Boolean LatestInvoice1In) {
    super(id, context, "InvoiceDetailByAccountFindCount");
    InvoiceDetailAccountfindCountIn = InvoiceDetailAccountfindCountInIn;
    LatestInvoice1 = LatestInvoice1In;
  }

  public void translateToMap() {
    if (InvoiceDetailAccountfindCountIn != null) {
      Integer index =  InvoiceDetailAccountfindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvoiceDetail", InvoiceDetailAccountObjectHelper.toMap(InvoiceDetailAccountfindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
    if (LatestInvoice1 != null) {
      addInput("LatestInvoice", LatestInvoice1);
    }
  }


/**
 *
 * Sets the InvoiceDetail
 * @param InvoiceDetailAccountfindCountInIn Value of the InvoiceDetailAccountfindCountIn
 *
 */

  public void setInvoiceDetail(InvoiceDetailAccountObjectFilter InvoiceDetailAccountfindCountInIn) {
    InvoiceDetailAccountfindCountIn = InvoiceDetailAccountfindCountInIn;
  }

/**
 *
 * Sets the LatestInvoice
 * @param LatestInvoice1In Value of the LatestInvoice1
 *
 */

  public void setLatestInvoice(Boolean LatestInvoice1In) {
    LatestInvoice1 = LatestInvoice1In;
  }

  public void translateFromMap() {
    InvoiceDetailAccountfindCountIn = InvoiceDetailAccountObjectHelper.fromMapFilter(inputMap, "InvoiceDetail");
    LatestInvoice1 = (Boolean)inputMap.get("LatestInvoice");
  }

/**
 *
 * Gets the InvoiceDetail
 * @return Value of the InvoiceDetail
 *
 */

  public InvoiceDetailAccountObjectFilter getInvoiceDetail( ) {
    return InvoiceDetailAccountfindCountIn;
  }

/**
 *
 * Gets the LatestInvoice
 * @return Value of the LatestInvoice
 *
 */

  public Boolean getLatestInvoice( ) {
    return LatestInvoice1;
  }

}
