/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountCodeObjectFilter CACfindIn;
/**
 *
 * Constructor to create a  AccountCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeObjectFilter CACfindInIn) {
    super(id, context, "AccountCodeFind");
    CACfindIn = CACfindInIn;
  }

  public void translateToMap() {
    if (CACfindIn != null) {
      Integer index =  CACfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountCode", AccountCodeObjectHelper.toMap(CACfindIn, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }


/**
 *
 * Sets the AccountCode
 * @param CACfindInIn Value of the CACfindIn
 *
 */

  public void setAccountCode(AccountCodeObjectFilter CACfindInIn) {
    CACfindIn = CACfindInIn;
  }

  public void translateFromMap() {
    CACfindIn = AccountCodeObjectHelper.fromMapFilter(inputMap, "AccountCode");
  }

/**
 *
 * Gets the AccountCode
 * @return Value of the AccountCode
 *
 */

  public AccountCodeObjectFilter getAccountCode( ) {
    return CACfindIn;
  }

}
