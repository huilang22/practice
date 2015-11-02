/*
 * Generated code DO NOT EDIT
 * Generated file: AccountInsertDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a AccountInsertDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountInsertDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountInsertObjectFilter AILdelIn;
  protected Date AIDLInactiveDate;
/**
 *
 * Constructor to create a  AccountInsertDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountInsertDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountInsertObjectFilter AILdelInIn, Date AIDLInactiveDateIn) {
    super(id, context, "AccountInsertDeleteList");
    AILdelIn = AILdelInIn;
    AIDLInactiveDate = AIDLInactiveDateIn;
  }

  public void translateToMap() {
    if (AILdelIn != null) {
      Integer index =  AILdelIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(AILdelIn, new HashMap(), "Void").get("Void"));
    }
    if (AIDLInactiveDate != null) {
      addInput("InactiveDate", AIDLInactiveDate);
    }
  }


/**
 *
 * Sets the AccountInsert
 * @param AILdelInIn Value of the AILdelIn
 *
 */

  public void setAccountInsert(AccountInsertObjectFilter AILdelInIn) {
    AILdelIn = AILdelInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param AIDLInactiveDateIn Value of the AIDLInactiveDate
 *
 */

  public void setInactiveDate(Date AIDLInactiveDateIn) {
    AIDLInactiveDate = AIDLInactiveDateIn;
  }

  public void translateFromMap() {
    AILdelIn = AccountInsertObjectHelper.fromMapFilter(inputMap, "AccountInsert");
    AIDLInactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the AccountInsert
 * @return Value of the AccountInsert
 *
 */

  public AccountInsertObjectFilter getAccountInsert( ) {
    return AILdelIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return AIDLInactiveDate;
  }

}
