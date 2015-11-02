/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountCodeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountCodeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountCodeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountCodeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeObjectData noOpInIn) {
    super(id, context, "AccountCodeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountCode", AccountCodeObjectHelper.toMap(noOpIn, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }
/**
 *
 * Sets the  AccountCode
 * @param noOpInIn AccountCodeObjectData to set
 *
 */
  public void setAccountCode(AccountCodeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountCode passed into the constructor
 * @return Simulated response
 *
 */
  public AccountCodeObjectData getAccountCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountCodeObjectHelper.fromMap(inputMap, "AccountCode");
  }
}
