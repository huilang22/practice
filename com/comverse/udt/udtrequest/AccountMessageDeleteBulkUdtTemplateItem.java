/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AccountMessageDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountMessageDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountMessageObjectKeyData AMdelIn;
  protected Date AMDInactiveDate;
/**
 *
 * Constructor to create a  AccountMessageDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountMessageDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountMessageObjectKeyData AMdelInIn, Date AMDInactiveDateIn) {
    super(id, context, "AccountMessageDelete");
    AMdelIn = AMdelInIn;
    AMDInactiveDate = AMDInactiveDateIn;
  }

  public void translateToMap() {
    if (AMdelIn != null) {
      AMdelIn.resetFlags(true, true);
      addInput("AccountMessage", AccountMessageObjectKeyHelper.toMap(AMdelIn, new HashMap(), "AccountMessageObjectKeyData").get("AccountMessageObjectKeyData"));
    }
    if (AMDInactiveDate != null) {
      addInput("InactiveDate", AMDInactiveDate);
    }
  }


/**
 *
 * Sets the AccountMessage
 * @param AMdelInIn Value of the AMdelIn
 *
 */

  public void setAccountMessage(AccountMessageObjectKeyData AMdelInIn) {
    AMdelIn = AMdelInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param AMDInactiveDateIn Value of the AMDInactiveDate
 *
 */

  public void setInactiveDate(Date AMDInactiveDateIn) {
    AMDInactiveDate = AMDInactiveDateIn;
  }

  public void translateFromMap() {
    AMdelIn = AccountMessageObjectKeyHelper.fromMap(inputMap, "AccountMessage");
    AMDInactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the AccountMessage
 * @return Value of the AccountMessage
 *
 */

  public AccountMessageObjectKeyData getAccountMessage( ) {
    return AMdelIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return AMDInactiveDate;
  }

}
