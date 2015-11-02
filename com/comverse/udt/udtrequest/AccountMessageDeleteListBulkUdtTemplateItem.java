/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a AccountMessageDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountMessageDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountMessageObjectFilter AMLdelIn;
  protected Date AMDLInactiveDate;
/**
 *
 * Constructor to create a  AccountMessageDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountMessageDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountMessageObjectFilter AMLdelInIn, Date AMDLInactiveDateIn) {
    super(id, context, "AccountMessageDeleteList");
    AMLdelIn = AMLdelInIn;
    AMDLInactiveDate = AMDLInactiveDateIn;
  }

  public void translateToMap() {
    if (AMLdelIn != null) {
      Integer index =  AMLdelIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(AMLdelIn, new HashMap(), "Void").get("Void"));
    }
    if (AMDLInactiveDate != null) {
      addInput("InactiveDate", AMDLInactiveDate);
    }
  }


/**
 *
 * Sets the AccountMessage
 * @param AMLdelInIn Value of the AMLdelIn
 *
 */

  public void setAccountMessage(AccountMessageObjectFilter AMLdelInIn) {
    AMLdelIn = AMLdelInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param AMDLInactiveDateIn Value of the AMDLInactiveDate
 *
 */

  public void setInactiveDate(Date AMDLInactiveDateIn) {
    AMDLInactiveDate = AMDLInactiveDateIn;
  }

  public void translateFromMap() {
    AMLdelIn = AccountMessageObjectHelper.fromMapFilter(inputMap, "AccountMessage");
    AMDLInactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the AccountMessage
 * @return Value of the AccountMessage
 *
 */

  public AccountMessageObjectFilter getAccountMessage( ) {
    return AMLdelIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return AMDLInactiveDate;
  }

}
