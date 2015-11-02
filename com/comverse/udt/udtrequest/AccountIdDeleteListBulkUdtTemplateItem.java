/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountIdDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a AccountIdDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountIdDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountIdObjectFilter xlFilter;
  protected Date AIDLCeaseDate;
/**
 *
 * Constructor to create a  AccountIdDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountIdDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountIdObjectFilter xlFilterIn, Date AIDLCeaseDateIn) {
    super(id, context, "AccountIdDeleteList");
    xlFilter = xlFilterIn;
    AIDLCeaseDate = AIDLCeaseDateIn;
  }

  public void translateToMap() {
    if (xlFilter != null) {
      Integer index =  xlFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountId", AccountIdObjectHelper.toMap(xlFilter, new HashMap(), "Void").get("Void"));
    }
    if (AIDLCeaseDate != null) {
      addInput("InactiveDate", AIDLCeaseDate);
    }
  }


/**
 *
 * Sets the AccountId
 * @param xlFilterIn Value of the xlFilter
 *
 */

  public void setAccountId(AccountIdObjectFilter xlFilterIn) {
    xlFilter = xlFilterIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param AIDLCeaseDateIn Value of the AIDLCeaseDate
 *
 */

  public void setInactiveDate(Date AIDLCeaseDateIn) {
    AIDLCeaseDate = AIDLCeaseDateIn;
  }

  public void translateFromMap() {
    xlFilter = AccountIdObjectHelper.fromMapFilter(inputMap, "AccountId");
    AIDLCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the AccountId
 * @return Value of the AccountId
 *
 */

  public AccountIdObjectFilter getAccountId( ) {
    return xlFilter;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return AIDLCeaseDate;
  }

}
