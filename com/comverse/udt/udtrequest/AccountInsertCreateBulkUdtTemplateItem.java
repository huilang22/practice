/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertCreateBulkUdtTemplateItem.java
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
 * Class used to create a AccountInsertCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountInsertCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountInsertObjectData AIcreateIn;
/**
 *
 * Constructor to create a  AccountInsertCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountInsertCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountInsertObjectData AIcreateInIn) {
    super(id, context, "AccountInsertCreate");
    AIcreateIn = AIcreateInIn;
  }

  public void translateToMap() {
    if (AIcreateIn != null) {
      AIcreateIn.resetFlags(true, true);
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(AIcreateIn, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }


/**
 *
 * Sets the AccountInsert
 * @param AIcreateInIn Value of the AIcreateIn
 *
 */

  public void setAccountInsert(AccountInsertObjectData AIcreateInIn) {
    AIcreateIn = AIcreateInIn;
  }

  public void translateFromMap() {
    AIcreateIn = AccountInsertObjectHelper.fromMap(inputMap, "AccountInsert");
  }

/**
 *
 * Gets the AccountInsert
 * @return Value of the AccountInsert
 *
 */

  public AccountInsertObjectData getAccountInsert( ) {
    return AIcreateIn;
  }

}
