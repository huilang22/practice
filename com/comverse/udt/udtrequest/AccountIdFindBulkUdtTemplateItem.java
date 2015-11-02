/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountIdFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountIdFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountIdFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountIdObjectFilter findIn;
/**
 *
 * Constructor to create a  AccountIdFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountIdFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountIdObjectFilter findInIn) {
    super(id, context, "AccountIdFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountId", AccountIdObjectHelper.toMap(findIn, new HashMap(), "AccountId").get("AccountId"));
    }
  }


/**
 *
 * Sets the AccountId
 * @param findInIn Value of the findIn
 *
 */

  public void setAccountId(AccountIdObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = AccountIdObjectHelper.fromMapFilter(inputMap, "AccountId");
  }

/**
 *
 * Gets the AccountId
 * @return Value of the AccountId
 *
 */

  public AccountIdObjectFilter getAccountId( ) {
    return findIn;
  }

}
