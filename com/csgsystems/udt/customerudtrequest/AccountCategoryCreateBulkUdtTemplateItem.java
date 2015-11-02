/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCategoryCreateBulkUdtTemplateItem.java
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
 * Class used to create a AccountCategoryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCategoryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ACObjectData ACCreateIn;
/**
 *
 * Constructor to create a  AccountCategoryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCategoryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ACObjectData ACCreateInIn) {
    super(id, context, "AccountCategoryCreate");
    ACCreateIn = ACCreateInIn;
  }

  public void translateToMap() {
    if (ACCreateIn != null) {
      ACCreateIn.resetFlags(true, true);
      addInput("AccountCategory", ACObjectHelper.toMap(ACCreateIn, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }


/**
 *
 * Sets the AccountCategory
 * @param ACCreateInIn Value of the ACCreateIn
 *
 */

  public void setAccountCategory(ACObjectData ACCreateInIn) {
    ACCreateIn = ACCreateInIn;
  }

  public void translateFromMap() {
    ACCreateIn = ACObjectHelper.fromMap(inputMap, "AccountCategory");
  }

/**
 *
 * Gets the AccountCategory
 * @return Value of the AccountCategory
 *
 */

  public ACObjectData getAccountCategory( ) {
    return ACCreateIn;
  }

}
