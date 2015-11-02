/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeCreateBulkUdtTemplateItem.java
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
 * Class used to create a AccountCodeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCodeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountCodeObjectData CACcreateIn;
/**
 *
 * Constructor to create a  AccountCodeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCodeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeObjectData CACcreateInIn) {
    super(id, context, "AccountCodeCreate");
    CACcreateIn = CACcreateInIn;
  }

  public void translateToMap() {
    if (CACcreateIn != null) {
      CACcreateIn.resetFlags(true, true);
      addInput("AccountCode", AccountCodeObjectHelper.toMap(CACcreateIn, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }


/**
 *
 * Sets the AccountCode
 * @param CACcreateInIn Value of the CACcreateIn
 *
 */

  public void setAccountCode(AccountCodeObjectData CACcreateInIn) {
    CACcreateIn = CACcreateInIn;
  }

  public void translateFromMap() {
    CACcreateIn = AccountCodeObjectHelper.fromMap(inputMap, "AccountCode");
  }

/**
 *
 * Gets the AccountCode
 * @return Value of the AccountCode
 *
 */

  public AccountCodeObjectData getAccountCode( ) {
    return CACcreateIn;
  }

}
