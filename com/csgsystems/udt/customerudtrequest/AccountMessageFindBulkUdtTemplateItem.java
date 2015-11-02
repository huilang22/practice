/*
 * Generated code DO NOT EDIT
 * Generated file: AccountMessageFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountMessageFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountMessageFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountMessageObjectFilter AMfindIn;
/**
 *
 * Constructor to create a  AccountMessageFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountMessageFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountMessageObjectFilter AMfindInIn) {
    super(id, context, "AccountMessageFind");
    AMfindIn = AMfindInIn;
  }

  public void translateToMap() {
    if (AMfindIn != null) {
      Integer index =  AMfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(AMfindIn, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }


/**
 *
 * Sets the AccountMessage
 * @param AMfindInIn Value of the AMfindIn
 *
 */

  public void setAccountMessage(AccountMessageObjectFilter AMfindInIn) {
    AMfindIn = AMfindInIn;
  }

  public void translateFromMap() {
    AMfindIn = AccountMessageObjectHelper.fromMapFilter(inputMap, "AccountMessage");
  }

/**
 *
 * Gets the AccountMessage
 * @return Value of the AccountMessage
 *
 */

  public AccountMessageObjectFilter getAccountMessage( ) {
    return AMfindIn;
  }

}
