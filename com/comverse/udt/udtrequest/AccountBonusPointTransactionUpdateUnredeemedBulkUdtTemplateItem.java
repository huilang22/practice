/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionUpdateUnredeemedBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointTransactionUpdateUnredeemedBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionUpdateUnredeemedBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointTransactionObjectData ABPTO_In;
  protected Date ABPToDate_In;
  protected Date ABPFromDate_In;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionUpdateUnredeemedBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionUpdateUnredeemedBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectData ABPTO_InIn, Date ABPToDate_InIn, Date ABPFromDate_InIn) {
    super(id, context, "AccountBonusPointTransactionUpdateUnredeemed");
    ABPTO_In = ABPTO_InIn;
    ABPToDate_In = ABPToDate_InIn;
    ABPFromDate_In = ABPFromDate_InIn;
  }

  public void translateToMap() {
    if (ABPTO_In != null) {
      ABPTO_In.resetFlags(true, true);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(ABPTO_In, new HashMap(), "ABPUpdateUnredeemedCountOut").get("ABPUpdateUnredeemedCountOut"));
    }
    if (ABPToDate_In != null) {
      addInput("ABPToDateIn", ABPToDate_In);
    }
    if (ABPFromDate_In != null) {
      addInput("ABPFromDateIn", ABPFromDate_In);
    }
  }


/**
 *
 * Sets the AccountBonusPointTransaction
 * @param ABPTO_InIn Value of the ABPTO_In
 *
 */

  public void setAccountBonusPointTransaction(AccountBonusPointTransactionObjectData ABPTO_InIn) {
    ABPTO_In = ABPTO_InIn;
  }

/**
 *
 * Sets the ABPToDateIn
 * @param ABPToDate_InIn Value of the ABPToDate_In
 *
 */

  public void setABPToDateIn(Date ABPToDate_InIn) {
    ABPToDate_In = ABPToDate_InIn;
  }

/**
 *
 * Sets the ABPFromDateIn
 * @param ABPFromDate_InIn Value of the ABPFromDate_In
 *
 */

  public void setABPFromDateIn(Date ABPFromDate_InIn) {
    ABPFromDate_In = ABPFromDate_InIn;
  }

  public void translateFromMap() {
    ABPTO_In = AccountBonusPointTransactionObjectHelper.fromMap(inputMap, "AccountBonusPointTransaction");
    ABPToDate_In = (Date)inputMap.get("ABPToDateIn");
    ABPFromDate_In = (Date)inputMap.get("ABPFromDateIn");
  }

/**
 *
 * Gets the AccountBonusPointTransaction
 * @return Value of the AccountBonusPointTransaction
 *
 */

  public AccountBonusPointTransactionObjectData getAccountBonusPointTransaction( ) {
    return ABPTO_In;
  }

/**
 *
 * Gets the ABPToDateIn
 * @return Value of the ABPToDateIn
 *
 */

  public Date getABPToDateIn( ) {
    return ABPToDate_In;
  }

/**
 *
 * Gets the ABPFromDateIn
 * @return Value of the ABPFromDateIn
 *
 */

  public Date getABPFromDateIn( ) {
    return ABPFromDate_In;
  }

}
