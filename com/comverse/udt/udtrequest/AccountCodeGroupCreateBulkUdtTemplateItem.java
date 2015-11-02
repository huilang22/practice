/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a AccountCodeGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCodeGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountCodeGroupObjectData CACGcreateIn;
/**
 *
 * Constructor to create a  AccountCodeGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCodeGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeGroupObjectData CACGcreateInIn) {
    super(id, context, "AccountCodeGroupCreate");
    CACGcreateIn = CACGcreateInIn;
  }

  public void translateToMap() {
    if (CACGcreateIn != null) {
      CACGcreateIn.resetFlags(true, true);
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(CACGcreateIn, new HashMap(), "AccountCodeGroup").get("AccountCodeGroup"));
    }
  }


/**
 *
 * Sets the AccountCodeGroup
 * @param CACGcreateInIn Value of the CACGcreateIn
 *
 */

  public void setAccountCodeGroup(AccountCodeGroupObjectData CACGcreateInIn) {
    CACGcreateIn = CACGcreateInIn;
  }

  public void translateFromMap() {
    CACGcreateIn = AccountCodeGroupObjectHelper.fromMap(inputMap, "AccountCodeGroup");
  }

/**
 *
 * Gets the AccountCodeGroup
 * @return Value of the AccountCodeGroup
 *
 */

  public AccountCodeGroupObjectData getAccountCodeGroup( ) {
    return CACGcreateIn;
  }

}
