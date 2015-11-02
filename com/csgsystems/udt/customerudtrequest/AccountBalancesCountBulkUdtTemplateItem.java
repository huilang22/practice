/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBalancesCountBulkUdtTemplateItem.java
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
 * Class used to create a AccountBalancesCountBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBalancesCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CmfObjectKeyData accIn;
/**
 *
 * Constructor to create a  AccountBalancesCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBalancesCountBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfObjectKeyData accInIn) {
    super(id, context, "AccountBalancesCount");
    accIn = accInIn;
  }

  public void translateToMap() {
    if (accIn != null) {
      accIn.resetFlags(true, true);
      addInput("Account", CmfObjectKeyHelper.toMap(accIn, new HashMap(), "CmfObjectKeyData").get("CmfObjectKeyData"));
    }
  }


/**
 *
 * Sets the Account
 * @param accInIn Value of the accIn
 *
 */

  public void setAccount(CmfObjectKeyData accInIn) {
    accIn = accInIn;
  }

  public void translateFromMap() {
    accIn = CmfObjectKeyHelper.fromMap(inputMap, "Account");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public CmfObjectKeyData getAccount( ) {
    return accIn;
  }

}
