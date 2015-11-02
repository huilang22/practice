/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageByAccountServiceFindBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageByAccountServiceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageByAccountServiceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageServiceObjectFilter BilledUsageAcctServicefindIn;
  protected Boolean LatestInvoice4;
/**
 *
 * Constructor to create a  BilledUsageByAccountServiceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageByAccountServiceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageServiceObjectFilter BilledUsageAcctServicefindInIn, Boolean LatestInvoice4In) {
    super(id, context, "BilledUsageByAccountServiceFind");
    BilledUsageAcctServicefindIn = BilledUsageAcctServicefindInIn;
    LatestInvoice4 = LatestInvoice4In;
  }

  public void translateToMap() {
    if (BilledUsageAcctServicefindIn != null) {
      Integer index =  BilledUsageAcctServicefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageServiceObjectHelper.toMap(BilledUsageAcctServicefindIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
    if (LatestInvoice4 != null) {
      addInput("LatestInvoice4", LatestInvoice4);
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsageAcctServicefindInIn Value of the BilledUsageAcctServicefindIn
 *
 */

  public void setBilledUsage(BilledUsageServiceObjectFilter BilledUsageAcctServicefindInIn) {
    BilledUsageAcctServicefindIn = BilledUsageAcctServicefindInIn;
  }

/**
 *
 * Sets the LatestInvoice4
 * @param LatestInvoice4In Value of the LatestInvoice4
 *
 */

  public void setLatestInvoice4(Boolean LatestInvoice4In) {
    LatestInvoice4 = LatestInvoice4In;
  }

  public void translateFromMap() {
    BilledUsageAcctServicefindIn = BilledUsageServiceObjectHelper.fromMapFilter(inputMap, "BilledUsage");
    LatestInvoice4 = (Boolean)inputMap.get("LatestInvoice4");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageServiceObjectFilter getBilledUsage( ) {
    return BilledUsageAcctServicefindIn;
  }

/**
 *
 * Gets the LatestInvoice4
 * @return Value of the LatestInvoice4
 *
 */

  public Boolean getLatestInvoice4( ) {
    return LatestInvoice4;
  }

}
