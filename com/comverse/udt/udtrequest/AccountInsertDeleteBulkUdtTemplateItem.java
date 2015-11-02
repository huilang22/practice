/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AccountInsertDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountInsertDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountInsertObjectKeyData AIdelIn;
  protected Date AIDInactiveDate;
/**
 *
 * Constructor to create a  AccountInsertDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountInsertDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountInsertObjectKeyData AIdelInIn, Date AIDInactiveDateIn) {
    super(id, context, "AccountInsertDelete");
    AIdelIn = AIdelInIn;
    AIDInactiveDate = AIDInactiveDateIn;
  }

  public void translateToMap() {
    if (AIdelIn != null) {
      AIdelIn.resetFlags(true, true);
      addInput("AccountInsert", AccountInsertObjectKeyHelper.toMap(AIdelIn, new HashMap(), "AccountInsertObjectKeyData").get("AccountInsertObjectKeyData"));
    }
    if (AIDInactiveDate != null) {
      addInput("InactiveDate", AIDInactiveDate);
    }
  }


/**
 *
 * Sets the AccountInsert
 * @param AIdelInIn Value of the AIdelIn
 *
 */

  public void setAccountInsert(AccountInsertObjectKeyData AIdelInIn) {
    AIdelIn = AIdelInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param AIDInactiveDateIn Value of the AIDInactiveDate
 *
 */

  public void setInactiveDate(Date AIDInactiveDateIn) {
    AIDInactiveDate = AIDInactiveDateIn;
  }

  public void translateFromMap() {
    AIdelIn = AccountInsertObjectKeyHelper.fromMap(inputMap, "AccountInsert");
    AIDInactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the AccountInsert
 * @return Value of the AccountInsert
 *
 */

  public AccountInsertObjectKeyData getAccountInsert( ) {
    return AIdelIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return AIDInactiveDate;
  }

}
