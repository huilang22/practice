/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageByServiceFindBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageByServiceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageByServiceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageServiceObjectFilter BilledUsageServicefindIn;
  protected Boolean LatestInvoice2;
/**
 *
 * Constructor to create a  BilledUsageByServiceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageByServiceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageServiceObjectFilter BilledUsageServicefindInIn, Boolean LatestInvoice2In) {
    super(id, context, "BilledUsageByServiceFind");
    BilledUsageServicefindIn = BilledUsageServicefindInIn;
    LatestInvoice2 = LatestInvoice2In;
  }

  public void translateToMap() {
    if (BilledUsageServicefindIn != null) {
      Integer index =  BilledUsageServicefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageServiceObjectHelper.toMap(BilledUsageServicefindIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
    if (LatestInvoice2 != null) {
      addInput("LatestInvoice", LatestInvoice2);
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsageServicefindInIn Value of the BilledUsageServicefindIn
 *
 */

  public void setBilledUsage(BilledUsageServiceObjectFilter BilledUsageServicefindInIn) {
    BilledUsageServicefindIn = BilledUsageServicefindInIn;
  }

/**
 *
 * Sets the LatestInvoice
 * @param LatestInvoice2In Value of the LatestInvoice2
 *
 */

  public void setLatestInvoice(Boolean LatestInvoice2In) {
    LatestInvoice2 = LatestInvoice2In;
  }

  public void translateFromMap() {
    BilledUsageServicefindIn = BilledUsageServiceObjectHelper.fromMapFilter(inputMap, "BilledUsage");
    LatestInvoice2 = (Boolean)inputMap.get("LatestInvoice");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageServiceObjectFilter getBilledUsage( ) {
    return BilledUsageServicefindIn;
  }

/**
 *
 * Gets the LatestInvoice
 * @return Value of the LatestInvoice
 *
 */

  public Boolean getLatestInvoice( ) {
    return LatestInvoice2;
  }

}
