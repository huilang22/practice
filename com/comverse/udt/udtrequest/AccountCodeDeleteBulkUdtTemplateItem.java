/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AccountCodeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCodeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountCodeObjectKeyData CACdeleteIn;
/**
 *
 * Constructor to create a  AccountCodeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCodeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeObjectKeyData CACdeleteInIn) {
    super(id, context, "AccountCodeDelete");
    CACdeleteIn = CACdeleteInIn;
  }

  public void translateToMap() {
    if (CACdeleteIn != null) {
      CACdeleteIn.resetFlags(true, true);
      addInput("AccountCode", AccountCodeObjectKeyHelper.toMap(CACdeleteIn, new HashMap(), "AccountCodeObjectKeyData").get("AccountCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountCode
 * @param CACdeleteInIn Value of the CACdeleteIn
 *
 */

  public void setAccountCode(AccountCodeObjectKeyData CACdeleteInIn) {
    CACdeleteIn = CACdeleteInIn;
  }

  public void translateFromMap() {
    CACdeleteIn = AccountCodeObjectKeyHelper.fromMap(inputMap, "AccountCode");
  }

/**
 *
 * Gets the AccountCode
 * @return Value of the AccountCode
 *
 */

  public AccountCodeObjectKeyData getAccountCode( ) {
    return CACdeleteIn;
  }

}
