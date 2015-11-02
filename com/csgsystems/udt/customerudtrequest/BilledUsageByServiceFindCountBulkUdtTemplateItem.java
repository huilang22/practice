/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageByServiceFindCountBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageByServiceFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageByServiceFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageServiceObjectFilter BilledUsagefindServiceCountIn;
  protected Boolean LatestInvoice3;
/**
 *
 * Constructor to create a  BilledUsageByServiceFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageByServiceFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageServiceObjectFilter BilledUsagefindServiceCountInIn, Boolean LatestInvoice3In) {
    super(id, context, "BilledUsageByServiceFindCount");
    BilledUsagefindServiceCountIn = BilledUsagefindServiceCountInIn;
    LatestInvoice3 = LatestInvoice3In;
  }

  public void translateToMap() {
    if (BilledUsagefindServiceCountIn != null) {
      Integer index =  BilledUsagefindServiceCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageServiceObjectHelper.toMap(BilledUsagefindServiceCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
    if (LatestInvoice3 != null) {
      addInput("LatestInvoice", LatestInvoice3);
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsagefindServiceCountInIn Value of the BilledUsagefindServiceCountIn
 *
 */

  public void setBilledUsage(BilledUsageServiceObjectFilter BilledUsagefindServiceCountInIn) {
    BilledUsagefindServiceCountIn = BilledUsagefindServiceCountInIn;
  }

/**
 *
 * Sets the LatestInvoice
 * @param LatestInvoice3In Value of the LatestInvoice3
 *
 */

  public void setLatestInvoice(Boolean LatestInvoice3In) {
    LatestInvoice3 = LatestInvoice3In;
  }

  public void translateFromMap() {
    BilledUsagefindServiceCountIn = BilledUsageServiceObjectHelper.fromMapFilter(inputMap, "BilledUsage");
    LatestInvoice3 = (Boolean)inputMap.get("LatestInvoice");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageServiceObjectFilter getBilledUsage( ) {
    return BilledUsagefindServiceCountIn;
  }

/**
 *
 * Gets the LatestInvoice
 * @return Value of the LatestInvoice
 *
 */

  public Boolean getLatestInvoice( ) {
    return LatestInvoice3;
  }

}
