/*
 * Generated code DO NOT EDIT
 * Generated file: AccountAbiSourceDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a AccountAbiSourceDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountAbiSourceDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountAbiSourceObjectFilter ABILdelIn;
  protected Date InactiveDate;
/**
 *
 * Constructor to create a  AccountAbiSourceDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountAbiSourceDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountAbiSourceObjectFilter ABILdelInIn, Date InactiveDateIn) {
    super(id, context, "AccountAbiSourceDeleteList");
    ABILdelIn = ABILdelInIn;
    InactiveDate = InactiveDateIn;
  }

  public void translateToMap() {
    if (ABILdelIn != null) {
      Integer index =  ABILdelIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(ABILdelIn, new HashMap(), "Void").get("Void"));
    }
    if (InactiveDate != null) {
      addInput("InactiveDate", InactiveDate);
    }
  }


/**
 *
 * Sets the AccountAbiSource
 * @param ABILdelInIn Value of the ABILdelIn
 *
 */

  public void setAccountAbiSource(AccountAbiSourceObjectFilter ABILdelInIn) {
    ABILdelIn = ABILdelInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param InactiveDateIn Value of the InactiveDate
 *
 */

  public void setInactiveDate(Date InactiveDateIn) {
    InactiveDate = InactiveDateIn;
  }

  public void translateFromMap() {
    ABILdelIn = AccountAbiSourceObjectHelper.fromMapFilter(inputMap, "AccountAbiSource");
    InactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the AccountAbiSource
 * @return Value of the AccountAbiSource
 *
 */

  public AccountAbiSourceObjectFilter getAccountAbiSource( ) {
    return ABILdelIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return InactiveDate;
  }

}
