/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageByAccountFindBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageByAccountFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageByAccountFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageAccountObjectFilter BilledUsageAccountfindIn;
  protected Boolean LatestInvoice;
/**
 *
 * Constructor to create a  BilledUsageByAccountFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageByAccountFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageAccountObjectFilter BilledUsageAccountfindInIn, Boolean LatestInvoiceIn) {
    super(id, context, "BilledUsageByAccountFind");
    BilledUsageAccountfindIn = BilledUsageAccountfindInIn;
    LatestInvoice = LatestInvoiceIn;
  }

  public void translateToMap() {
    if (BilledUsageAccountfindIn != null) {
      Integer index =  BilledUsageAccountfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageAccountObjectHelper.toMap(BilledUsageAccountfindIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
    if (LatestInvoice != null) {
      addInput("LatestInvoice", LatestInvoice);
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsageAccountfindInIn Value of the BilledUsageAccountfindIn
 *
 */

  public void setBilledUsage(BilledUsageAccountObjectFilter BilledUsageAccountfindInIn) {
    BilledUsageAccountfindIn = BilledUsageAccountfindInIn;
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
    BilledUsageAccountfindIn = BilledUsageAccountObjectHelper.fromMapFilter(inputMap, "BilledUsage");
    LatestInvoice = (Boolean)inputMap.get("LatestInvoice");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageAccountObjectFilter getBilledUsage( ) {
    return BilledUsageAccountfindIn;
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
