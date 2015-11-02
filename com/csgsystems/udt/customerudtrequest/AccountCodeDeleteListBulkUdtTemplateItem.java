/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a AccountCodeDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCodeDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountCodeObjectFilter CACLdeleteIn;
/**
 *
 * Constructor to create a  AccountCodeDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCodeDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeObjectFilter CACLdeleteInIn) {
    super(id, context, "AccountCodeDeleteList");
    CACLdeleteIn = CACLdeleteInIn;
  }

  public void translateToMap() {
    if (CACLdeleteIn != null) {
      Integer index =  CACLdeleteIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountCode", AccountCodeObjectHelper.toMap(CACLdeleteIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the AccountCode
 * @param CACLdeleteInIn Value of the CACLdeleteIn
 *
 */

  public void setAccountCode(AccountCodeObjectFilter CACLdeleteInIn) {
    CACLdeleteIn = CACLdeleteInIn;
  }

  public void translateFromMap() {
    CACLdeleteIn = AccountCodeObjectHelper.fromMapFilter(inputMap, "AccountCode");
  }

/**
 *
 * Gets the AccountCode
 * @return Value of the AccountCode
 *
 */

  public AccountCodeObjectFilter getAccountCode( ) {
    return CACLdeleteIn;
  }

}
