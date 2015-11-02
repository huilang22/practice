/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePostpaidUnbilledUsageTotalBulkUdtTemplateItem.java
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
 * Class used to create a InvoicePostpaidUnbilledUsageTotalBulkUdtTemplateItem Bulk Template
 *
 */

public class InvoicePostpaidUnbilledUsageTotalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer account_internalId;
/**
 *
 * Constructor to create a  InvoicePostpaidUnbilledUsageTotalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvoicePostpaidUnbilledUsageTotalBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer account_internalIdIn) {
    super(id, context, "InvoicePostpaidUnbilledUsageTotal");
    account_internalId = account_internalIdIn;
  }

  public void translateToMap() {
    if (account_internalId != null) {
      addInput("AccountInternalId", account_internalId);
    }
  }


/**
 *
 * Sets the AccountInternalId
 * @param account_internalIdIn Value of the account_internalId
 *
 */

  public void setAccountInternalId(Integer account_internalIdIn) {
    account_internalId = account_internalIdIn;
  }

  public void translateFromMap() {
    account_internalId = (Integer)inputMap.get("AccountInternalId");
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return account_internalId;
  }

}
