/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountHqContractDeleteListBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a AccountHqContractDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountHqContractDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountHqContractObjectFilter AHCLdeleteIn;
  protected Date AHCLInactiveDate;
/**
 *
 * Constructor to create a  AccountHqContractDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountHqContractDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountHqContractObjectFilter AHCLdeleteInIn, Date AHCLInactiveDateIn) {
    super(id, context, "AccountHqContractDeleteList");
    AHCLdeleteIn = AHCLdeleteInIn;
    AHCLInactiveDate = AHCLInactiveDateIn;
  }

  public void translateToMap() {
    if (AHCLdeleteIn != null) {
      Integer index =  AHCLdeleteIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(AHCLdeleteIn, new HashMap(), "Void").get("Void"));
    }
    if (AHCLInactiveDate != null) {
      addInput("AHCLInactiveDate", AHCLInactiveDate);
    }
  }


/**
 *
 * Sets the AccountHqContract
 * @param AHCLdeleteInIn Value of the AHCLdeleteIn
 *
 */

  public void setAccountHqContract(AccountHqContractObjectFilter AHCLdeleteInIn) {
    AHCLdeleteIn = AHCLdeleteInIn;
  }

/**
 *
 * Sets the AHCLInactiveDate
 * @param AHCLInactiveDateIn Value of the AHCLInactiveDate
 *
 */

  public void setAHCLInactiveDate(Date AHCLInactiveDateIn) {
    AHCLInactiveDate = AHCLInactiveDateIn;
  }

  public void translateFromMap() {
    AHCLdeleteIn = AccountHqContractObjectHelper.fromMapFilter(inputMap, "AccountHqContract");
    AHCLInactiveDate = (Date)inputMap.get("AHCLInactiveDate");
  }

/**
 *
 * Gets the AccountHqContract
 * @return Value of the AccountHqContract
 *
 */

  public AccountHqContractObjectFilter getAccountHqContract( ) {
    return AHCLdeleteIn;
  }

/**
 *
 * Gets the AHCLInactiveDate
 * @return Value of the AHCLInactiveDate
 *
 */

  public Date getAHCLInactiveDate( ) {
    return AHCLInactiveDate;
  }

}
