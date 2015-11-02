/*
 * Generated code DO NOT EDIT
 * Generated file: AccountLocateFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountLocateFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountLocateFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountLocateXIDObjectFilter alfIn;
/**
 *
 * Constructor to create a  AccountLocateFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountLocateFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountLocateXIDObjectFilter alfInIn) {
    super(id, context, "AccountLocateFind");
    alfIn = alfInIn;
  }

  public void translateToMap() {
    if (alfIn != null) {
      Integer index =  alfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountLocate", AccountLocateXIDObjectHelper.toMap(alfIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }


/**
 *
 * Sets the AccountLocate
 * @param alfInIn Value of the alfIn
 *
 */

  public void setAccountLocate(AccountLocateXIDObjectFilter alfInIn) {
    alfIn = alfInIn;
  }

  public void translateFromMap() {
    alfIn = AccountLocateXIDObjectHelper.fromMapFilter(inputMap, "AccountLocate");
  }

/**
 *
 * Gets the AccountLocate
 * @return Value of the AccountLocate
 *
 */

  public AccountLocateXIDObjectFilter getAccountLocate( ) {
    return alfIn;
  }

}
