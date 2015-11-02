/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCategoryUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountCategoryUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountCategoryUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ACObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountCategoryUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountCategoryUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ACObjectData noOpInIn) {
    super(id, context, "AccountCategoryUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountCategory", ACObjectHelper.toMap(noOpIn, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }
/**
 *
 * Sets the  AccountCategory
 * @param noOpInIn ACObjectData to set
 *
 */
  public void setAccountCategory(ACObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountCategory passed into the constructor
 * @return Simulated response
 *
 */
  public ACObjectData getAccountCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ACObjectHelper.fromMap(inputMap, "AccountCategory");
  }
}
