/*
 * Generated code DO NOT EDIT
 * Generated file: AccountActivateBulkUdtTemplateItem.java
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
 * Class used to create a AccountActivateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountActivateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountObjectKeyData aaIn;
  protected Date actDate;
  protected Integer actReason;
/**
 *
 * Constructor to create a  AccountActivateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountActivateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountObjectKeyData aaInIn, Date actDateIn, Integer actReasonIn) {
    super(id, context, "AccountActivate");
    aaIn = aaInIn;
    actDate = actDateIn;
    actReason = actReasonIn;
  }

  public void translateToMap() {
    if (aaIn != null) {
      aaIn.resetFlags(true, true);
      addInput("Account", AccountObjectKeyHelper.toMap(aaIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
    if (actDate != null) {
      addInput("ActiveDate", actDate);
    }
    if (actReason != null) {
      addInput("ReasonCode", actReason);
    }
  }


/**
 *
 * Sets the Account
 * @param aaInIn Value of the aaIn
 *
 */

  public void setAccount(AccountObjectKeyData aaInIn) {
    aaIn = aaInIn;
  }

/**
 *
 * Sets the ActiveDate
 * @param actDateIn Value of the actDate
 *
 */

  public void setActiveDate(Date actDateIn) {
    actDate = actDateIn;
  }

/**
 *
 * Sets the ReasonCode
 * @param actReasonIn Value of the actReason
 *
 */

  public void setReasonCode(Integer actReasonIn) {
    actReason = actReasonIn;
  }

  public void translateFromMap() {
    aaIn = AccountObjectKeyHelper.fromMap(inputMap, "Account");
    actDate = (Date)inputMap.get("ActiveDate");
    actReason = (Integer)inputMap.get("ReasonCode");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectKeyData getAccount( ) {
    return aaIn;
  }

/**
 *
 * Gets the ActiveDate
 * @return Value of the ActiveDate
 *
 */

  public Date getActiveDate( ) {
    return actDate;
  }

/**
 *
 * Gets the ReasonCode
 * @return Value of the ReasonCode
 *
 */

  public Integer getReasonCode( ) {
    return actReason;
  }

}
