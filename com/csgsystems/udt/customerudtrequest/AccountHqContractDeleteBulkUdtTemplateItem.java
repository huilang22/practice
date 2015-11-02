/*
 * Generated code DO NOT EDIT
 * Generated file: AccountHqContractDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AccountHqContractDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountHqContractDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountHqContractObjectKeyData AHCdeleteIn;
  protected Date AHCInactiveDate;
/**
 *
 * Constructor to create a  AccountHqContractDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountHqContractDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountHqContractObjectKeyData AHCdeleteInIn, Date AHCInactiveDateIn) {
    super(id, context, "AccountHqContractDelete");
    AHCdeleteIn = AHCdeleteInIn;
    AHCInactiveDate = AHCInactiveDateIn;
  }

  public void translateToMap() {
    if (AHCdeleteIn != null) {
      AHCdeleteIn.resetFlags(true, true);
      addInput("AccountHqContract", AccountHqContractObjectKeyHelper.toMap(AHCdeleteIn, new HashMap(), "AccountHqContractObjectKeyData").get("AccountHqContractObjectKeyData"));
    }
    if (AHCInactiveDate != null) {
      addInput("AHCInactiveDate", AHCInactiveDate);
    }
  }


/**
 *
 * Sets the AccountHqContract
 * @param AHCdeleteInIn Value of the AHCdeleteIn
 *
 */

  public void setAccountHqContract(AccountHqContractObjectKeyData AHCdeleteInIn) {
    AHCdeleteIn = AHCdeleteInIn;
  }

/**
 *
 * Sets the AHCInactiveDate
 * @param AHCInactiveDateIn Value of the AHCInactiveDate
 *
 */

  public void setAHCInactiveDate(Date AHCInactiveDateIn) {
    AHCInactiveDate = AHCInactiveDateIn;
  }

  public void translateFromMap() {
    AHCdeleteIn = AccountHqContractObjectKeyHelper.fromMap(inputMap, "AccountHqContract");
    AHCInactiveDate = (Date)inputMap.get("AHCInactiveDate");
  }

/**
 *
 * Gets the AccountHqContract
 * @return Value of the AccountHqContract
 *
 */

  public AccountHqContractObjectKeyData getAccountHqContract( ) {
    return AHCdeleteIn;
  }

/**
 *
 * Gets the AHCInactiveDate
 * @return Value of the AHCInactiveDate
 *
 */

  public Date getAHCInactiveDate( ) {
    return AHCInactiveDate;
  }

}
