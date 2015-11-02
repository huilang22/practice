/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountDisconnectChargeAccountAmountGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountDisconnectChargeAccountAmountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountDisconnectChargeAccountAmountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountDisconnectChargeAccountAmountGetOutputData noOpIn;

/**
 *
 * Constructor to create a   AccountDisconnectChargeAccountAmountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountDisconnectChargeAccountAmountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountDisconnectChargeAccountAmountGetOutputData noOpInIn) {
    super(id, context, "AccountDisconnectChargeAccountAmountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountDisconnectChargeAccountAmountGetOutputData", AccountDisconnectChargeAccountAmountGetOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  AccountDisconnectChargeAccountAmountGetOutputData
 * @param noOpInIn AccountDisconnectChargeAccountAmountGetOutputData to set
 *
 */
  public void setAccountDisconnectChargeAccountAmountGetOutputData(AccountDisconnectChargeAccountAmountGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountDisconnectChargeAccountAmountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountDisconnectChargeAccountAmountGetOutputData getAccountDisconnectChargeAccountAmountGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountDisconnectChargeAccountAmountGetOutputHelper.fromMap(inputMap);
  }
}
