/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalanceSummaryNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountBalanceSummaryNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountBalanceSummaryNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountBalanceSummaryOutputData noOpIn;

/**
 *
 * Constructor to create a   AccountBalanceSummaryNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountBalanceSummaryNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBalanceSummaryOutputData noOpInIn) {
    super(id, context, "AccountBalanceSummary");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountBalanceSummaryOutputData", AccountBalanceSummaryOutputHelper.toMap(noOpIn));
    }
  }
/**
 *
 * Sets the  AccountBalanceSummaryOutputData
 * @param noOpInIn AccountBalanceSummaryOutputData to set
 *
 */
  public void setAccountBalanceSummaryOutputData(AccountBalanceSummaryOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountBalanceSummaryOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBalanceSummaryOutputData getAccountBalanceSummaryOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountBalanceSummaryOutputHelper.fromMap(inputMap);
  }
}
