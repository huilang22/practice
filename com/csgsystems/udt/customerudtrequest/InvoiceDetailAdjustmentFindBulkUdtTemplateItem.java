/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailAdjustmentFindBulkUdtTemplateItem.java
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
 * Class used to create a InvoiceDetailAdjustmentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoiceDetailAdjustmentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvoiceDetailObjectFilter InvoiceDetailAdjfindIn;
/**
 *
 * Constructor to create a  InvoiceDetailAdjustmentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoiceDetailAdjustmentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvoiceDetailObjectFilter InvoiceDetailAdjfindInIn) {
    super(id, context, "InvoiceDetailAdjustmentFind");
    InvoiceDetailAdjfindIn = InvoiceDetailAdjfindInIn;
  }

  public void translateToMap() {
    if (InvoiceDetailAdjfindIn != null) {
      Integer index =  InvoiceDetailAdjfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(InvoiceDetailAdjfindIn, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }


/**
 *
 * Sets the InvoiceDetail
 * @param InvoiceDetailAdjfindInIn Value of the InvoiceDetailAdjfindIn
 *
 */

  public void setInvoiceDetail(InvoiceDetailObjectFilter InvoiceDetailAdjfindInIn) {
    InvoiceDetailAdjfindIn = InvoiceDetailAdjfindInIn;
  }

  public void translateFromMap() {
    InvoiceDetailAdjfindIn = InvoiceDetailObjectHelper.fromMapFilter(inputMap, "InvoiceDetail");
  }

/**
 *
 * Gets the InvoiceDetail
 * @return Value of the InvoiceDetail
 *
 */

  public InvoiceDetailObjectFilter getInvoiceDetail( ) {
    return InvoiceDetailAdjfindIn;
  }

}
