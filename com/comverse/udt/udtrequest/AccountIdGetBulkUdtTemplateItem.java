/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountIdGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountIdGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountIdGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountIdObjectKeyData getIn;
/**
 *
 * Constructor to create a  AccountIdGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountIdGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountIdObjectKeyData getInIn) {
    super(id, context, "AccountIdGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("AccountId", AccountIdObjectKeyHelper.toMap(getIn, new HashMap(), "AccountIdObjectKeyData").get("AccountIdObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountId
 * @param getInIn Value of the getIn
 *
 */

  public void setAccountId(AccountIdObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = AccountIdObjectKeyHelper.fromMap(inputMap, "AccountId");
  }

/**
 *
 * Gets the AccountId
 * @return Value of the AccountId
 *
 */

  public AccountIdObjectKeyData getAccountId( ) {
    return getIn;
  }

}
