/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountAbiSourceDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AccountAbiSourceDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountAbiSourceDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountAbiSourceObjectKeyData ABIdelIn;
  protected Date inactive_date;
/**
 *
 * Constructor to create a  AccountAbiSourceDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountAbiSourceDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountAbiSourceObjectKeyData ABIdelInIn, Date inactive_dateIn) {
    super(id, context, "AccountAbiSourceDelete");
    ABIdelIn = ABIdelInIn;
    inactive_date = inactive_dateIn;
  }

  public void translateToMap() {
    if (ABIdelIn != null) {
      ABIdelIn.resetFlags(true, true);
      addInput("AccountAbiSource", AccountAbiSourceObjectKeyHelper.toMap(ABIdelIn, new HashMap(), "AccountAbiSourceObjectKeyData").get("AccountAbiSourceObjectKeyData"));
    }
    if (inactive_date != null) {
      addInput("InactiveDate", inactive_date);
    }
  }


/**
 *
 * Sets the AccountAbiSource
 * @param ABIdelInIn Value of the ABIdelIn
 *
 */

  public void setAccountAbiSource(AccountAbiSourceObjectKeyData ABIdelInIn) {
    ABIdelIn = ABIdelInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param inactive_dateIn Value of the inactive_date
 *
 */

  public void setInactiveDate(Date inactive_dateIn) {
    inactive_date = inactive_dateIn;
  }

  public void translateFromMap() {
    ABIdelIn = AccountAbiSourceObjectKeyHelper.fromMap(inputMap, "AccountAbiSource");
    inactive_date = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the AccountAbiSource
 * @return Value of the AccountAbiSource
 *
 */

  public AccountAbiSourceObjectKeyData getAccountAbiSource( ) {
    return ABIdelIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return inactive_date;
  }

}
