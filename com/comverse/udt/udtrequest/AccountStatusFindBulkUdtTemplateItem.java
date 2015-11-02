/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountStatusFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountStatusObjectFilter AccountStatusfindIn;
/**
 *
 * Constructor to create a  AccountStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountStatusObjectFilter AccountStatusfindInIn) {
    super(id, context, "AccountStatusFind");
    AccountStatusfindIn = AccountStatusfindInIn;
  }

  public void translateToMap() {
    if (AccountStatusfindIn != null) {
      Integer index =  AccountStatusfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountStatus", AccountStatusObjectHelper.toMap(AccountStatusfindIn, new HashMap(), "AccountStatus").get("AccountStatus"));
    }
  }


/**
 *
 * Sets the AccountStatus
 * @param AccountStatusfindInIn Value of the AccountStatusfindIn
 *
 */

  public void setAccountStatus(AccountStatusObjectFilter AccountStatusfindInIn) {
    AccountStatusfindIn = AccountStatusfindInIn;
  }

  public void translateFromMap() {
    AccountStatusfindIn = AccountStatusObjectHelper.fromMapFilter(inputMap, "AccountStatus");
  }

/**
 *
 * Gets the AccountStatus
 * @return Value of the AccountStatus
 *
 */

  public AccountStatusObjectFilter getAccountStatus( ) {
    return AccountStatusfindIn;
  }

}
