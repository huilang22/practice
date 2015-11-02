/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeGroupUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccountCodeGroupUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCodeGroupUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountCodeGroupObjectData CACGupdateIn;
/**
 *
 * Constructor to create a  AccountCodeGroupUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCodeGroupUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeGroupObjectData CACGupdateInIn) {
    super(id, context, "AccountCodeGroupUpdate");
    CACGupdateIn = CACGupdateInIn;
  }

  public void translateToMap() {
    if (CACGupdateIn != null) {
      CACGupdateIn.resetFlags(true, true);
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(CACGupdateIn, new HashMap(), "AccountCodeGroup").get("AccountCodeGroup"));
    }
  }


/**
 *
 * Sets the AccountCodeGroup
 * @param CACGupdateInIn Value of the CACGupdateIn
 *
 */

  public void setAccountCodeGroup(AccountCodeGroupObjectData CACGupdateInIn) {
    CACGupdateIn = CACGupdateInIn;
  }

  public void translateFromMap() {
    CACGupdateIn = AccountCodeGroupObjectHelper.fromMap(inputMap, "AccountCodeGroup");
  }

/**
 *
 * Gets the AccountCodeGroup
 * @return Value of the AccountCodeGroup
 *
 */

  public AccountCodeGroupObjectData getAccountCodeGroup( ) {
    return CACGupdateIn;
  }

}
