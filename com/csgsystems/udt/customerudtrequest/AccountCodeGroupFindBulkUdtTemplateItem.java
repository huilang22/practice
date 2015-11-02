/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountCodeGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCodeGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountCodeGroupObjectFilter CACGfindIn;
/**
 *
 * Constructor to create a  AccountCodeGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCodeGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeGroupObjectFilter CACGfindInIn) {
    super(id, context, "AccountCodeGroupFind");
    CACGfindIn = CACGfindInIn;
  }

  public void translateToMap() {
    if (CACGfindIn != null) {
      Integer index =  CACGfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(CACGfindIn, new HashMap(), "AccountCodeGroup").get("AccountCodeGroup"));
    }
  }


/**
 *
 * Sets the AccountCodeGroup
 * @param CACGfindInIn Value of the CACGfindIn
 *
 */

  public void setAccountCodeGroup(AccountCodeGroupObjectFilter CACGfindInIn) {
    CACGfindIn = CACGfindInIn;
  }

  public void translateFromMap() {
    CACGfindIn = AccountCodeGroupObjectHelper.fromMapFilter(inputMap, "AccountCodeGroup");
  }

/**
 *
 * Gets the AccountCodeGroup
 * @return Value of the AccountCodeGroup
 *
 */

  public AccountCodeGroupObjectFilter getAccountCodeGroup( ) {
    return CACGfindIn;
  }

}
