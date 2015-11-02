/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCategoryDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a AccountCategoryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCategoryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ACObjectKeyData ACDeleteIn;
/**
 *
 * Constructor to create a  AccountCategoryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCategoryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ACObjectKeyData ACDeleteInIn) {
    super(id, context, "AccountCategoryDelete");
    ACDeleteIn = ACDeleteInIn;
  }

  public void translateToMap() {
    if (ACDeleteIn != null) {
      ACDeleteIn.resetFlags(true, true);
      addInput("AccountCategory", ACObjectKeyHelper.toMap(ACDeleteIn, new HashMap(), "ACObjectKeyData").get("ACObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountCategory
 * @param ACDeleteInIn Value of the ACDeleteIn
 *
 */

  public void setAccountCategory(ACObjectKeyData ACDeleteInIn) {
    ACDeleteIn = ACDeleteInIn;
  }

  public void translateFromMap() {
    ACDeleteIn = ACObjectKeyHelper.fromMap(inputMap, "AccountCategory");
  }

/**
 *
 * Gets the AccountCategory
 * @return Value of the AccountCategory
 *
 */

  public ACObjectKeyData getAccountCategory( ) {
    return ACDeleteIn;
  }

}
