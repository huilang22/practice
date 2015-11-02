/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageByAccountFindCountBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageByAccountFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageByAccountFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageAccountObjectFilter BilledUsagefindAccountCountIn;
  protected Boolean LatestInvoice1;
/**
 *
 * Constructor to create a  BilledUsageByAccountFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageByAccountFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageAccountObjectFilter BilledUsagefindAccountCountInIn, Boolean LatestInvoice1In) {
    super(id, context, "BilledUsageByAccountFindCount");
    BilledUsagefindAccountCountIn = BilledUsagefindAccountCountInIn;
    LatestInvoice1 = LatestInvoice1In;
  }

  public void translateToMap() {
    if (BilledUsagefindAccountCountIn != null) {
      Integer index =  BilledUsagefindAccountCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageAccountObjectHelper.toMap(BilledUsagefindAccountCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
    if (LatestInvoice1 != null) {
      addInput("LatestInvoice", LatestInvoice1);
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsagefindAccountCountInIn Value of the BilledUsagefindAccountCountIn
 *
 */

  public void setBilledUsage(BilledUsageAccountObjectFilter BilledUsagefindAccountCountInIn) {
    BilledUsagefindAccountCountIn = BilledUsagefindAccountCountInIn;
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
    BilledUsagefindAccountCountIn = BilledUsageAccountObjectHelper.fromMapFilter(inputMap, "BilledUsage");
    LatestInvoice1 = (Boolean)inputMap.get("LatestInvoice");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageAccountObjectFilter getBilledUsage( ) {
    return BilledUsagefindAccountCountIn;
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
