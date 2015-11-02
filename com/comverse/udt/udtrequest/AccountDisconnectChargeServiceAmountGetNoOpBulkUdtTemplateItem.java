/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountDisconnectChargeServiceAmountGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a AccountDisconnectChargeServiceAmountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountDisconnectChargeServiceAmountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountDisconnectChargeServiceAmountGetOutputData noOpIn;

/**
 *
 * Constructor to create a   AccountDisconnectChargeServiceAmountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountDisconnectChargeServiceAmountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountDisconnectChargeServiceAmountGetOutputData noOpInIn) {
    super(id, context, "AccountDisconnectChargeServiceAmountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountDisconnectChargeServiceAmountGetOutputData", AccountDisconnectChargeServiceAmountGetOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  AccountDisconnectChargeServiceAmountGetOutputData
 * @param noOpInIn AccountDisconnectChargeServiceAmountGetOutputData to set
 *
 */
  public void setAccountDisconnectChargeServiceAmountGetOutputData(AccountDisconnectChargeServiceAmountGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountDisconnectChargeServiceAmountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountDisconnectChargeServiceAmountGetOutputData getAccountDisconnectChargeServiceAmountGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountDisconnectChargeServiceAmountGetOutputHelper.fromMap(inputMap);
  }
}
