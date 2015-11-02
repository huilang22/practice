/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailFindCountBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceDetailFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceDetailFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceDetailObjectFilter InvoiceDetailfindCountIn;
/**
 *
 * Constructor to create a  InvoiceDetailFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceDetailFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceDetailObjectFilter InvoiceDetailfindCountInIn) {
    super(id, context, "InvoiceDetailFindCount");
    InvoiceDetailfindCountIn = InvoiceDetailfindCountInIn;
  }

  public void translateToMap() {
    if (InvoiceDetailfindCountIn != null) {
      Integer index =  InvoiceDetailfindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(InvoiceDetailfindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the InvoiceDetail
 * @param InvoiceDetailfindCountInIn Value of the InvoiceDetailfindCountIn
 *
 */

  public void setInvoiceDetail(InvoiceDetailObjectFilter InvoiceDetailfindCountInIn) {
    InvoiceDetailfindCountIn = InvoiceDetailfindCountInIn;
  }

  public void translateFromMap() {
    InvoiceDetailfindCountIn = InvoiceDetailObjectHelper.fromMapFilter(inputMap, "InvoiceDetail");
  }

/**
 *
 * Gets the InvoiceDetail
 * @return Value of the InvoiceDetail
 *
 */

  public InvoiceDetailObjectFilter getInvoiceDetail( ) {
    return InvoiceDetailfindCountIn;
  }

}
