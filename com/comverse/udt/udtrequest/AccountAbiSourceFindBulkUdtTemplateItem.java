/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountAbiSourceFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountAbiSourceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountAbiSourceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountAbiSourceObjectFilter ABIfindIn;
/**
 *
 * Constructor to create a  AccountAbiSourceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountAbiSourceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountAbiSourceObjectFilter ABIfindInIn) {
    super(id, context, "AccountAbiSourceFind");
    ABIfindIn = ABIfindInIn;
  }

  public void translateToMap() {
    if (ABIfindIn != null) {
      Integer index =  ABIfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(ABIfindIn, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }


/**
 *
 * Sets the AccountAbiSource
 * @param ABIfindInIn Value of the ABIfindIn
 *
 */

  public void setAccountAbiSource(AccountAbiSourceObjectFilter ABIfindInIn) {
    ABIfindIn = ABIfindInIn;
  }

  public void translateFromMap() {
    ABIfindIn = AccountAbiSourceObjectHelper.fromMapFilter(inputMap, "AccountAbiSource");
  }

/**
 *
 * Gets the AccountAbiSource
 * @return Value of the AccountAbiSource
 *
 */

  public AccountAbiSourceObjectFilter getAccountAbiSource( ) {
    return ABIfindIn;
  }

}
