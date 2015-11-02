/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountActivateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountActivateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountActivateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountXIDObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountActivateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountActivateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountXIDObjectData noOpInIn) {
    super(id, context, "AccountActivate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Account", AccountXIDObjectHelper.toMap(noOpIn, new HashMap(), "Account").get("Account"));
    }
  }
/**
 *
 * Sets the  Account
 * @param noOpInIn AccountXIDObjectData to set
 *
 */
  public void setAccount(AccountXIDObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Account passed into the constructor
 * @return Simulated response
 *
 */
  public AccountXIDObjectData getAccount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountXIDObjectHelper.fromMap(inputMap, "Account");
  }
}
