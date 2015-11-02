/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountInsertFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountInsertFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountInsertObjectFilter AIfindIn;
/**
 *
 * Constructor to create a  AccountInsertFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountInsertFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountInsertObjectFilter AIfindInIn) {
    super(id, context, "AccountInsertFind");
    AIfindIn = AIfindInIn;
  }

  public void translateToMap() {
    if (AIfindIn != null) {
      Integer index =  AIfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(AIfindIn, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }


/**
 *
 * Sets the AccountInsert
 * @param AIfindInIn Value of the AIfindIn
 *
 */

  public void setAccountInsert(AccountInsertObjectFilter AIfindInIn) {
    AIfindIn = AIfindInIn;
  }

  public void translateFromMap() {
    AIfindIn = AccountInsertObjectHelper.fromMapFilter(inputMap, "AccountInsert");
  }

/**
 *
 * Gets the AccountInsert
 * @return Value of the AccountInsert
 *
 */

  public AccountInsertObjectFilter getAccountInsert( ) {
    return AIfindIn;
  }

}
