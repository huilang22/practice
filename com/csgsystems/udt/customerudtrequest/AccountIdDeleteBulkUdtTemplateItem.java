/*
 * Generated code DO NOT EDIT
 * Generated file: AccountIdDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AccountIdDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountIdDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountIdObjectKeyData axIn;
  protected Date AIDCeaseDate;
/**
 *
 * Constructor to create a  AccountIdDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountIdDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountIdObjectKeyData axInIn, Date AIDCeaseDateIn) {
    super(id, context, "AccountIdDelete");
    axIn = axInIn;
    AIDCeaseDate = AIDCeaseDateIn;
  }

  public void translateToMap() {
    if (axIn != null) {
      axIn.resetFlags(true, true);
      addInput("AccountId", AccountIdObjectKeyHelper.toMap(axIn, new HashMap(), "AccountIdObjectKeyData").get("AccountIdObjectKeyData"));
    }
    if (AIDCeaseDate != null) {
      addInput("InactiveDate", AIDCeaseDate);
    }
  }


/**
 *
 * Sets the AccountId
 * @param axInIn Value of the axIn
 *
 */

  public void setAccountId(AccountIdObjectKeyData axInIn) {
    axIn = axInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param AIDCeaseDateIn Value of the AIDCeaseDate
 *
 */

  public void setInactiveDate(Date AIDCeaseDateIn) {
    AIDCeaseDate = AIDCeaseDateIn;
  }

  public void translateFromMap() {
    axIn = AccountIdObjectKeyHelper.fromMap(inputMap, "AccountId");
    AIDCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the AccountId
 * @return Value of the AccountId
 *
 */

  public AccountIdObjectKeyData getAccountId( ) {
    return axIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return AIDCeaseDate;
  }

}
