/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   AccountSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountObjectKeyData noOpInIn) {
    super(id, context, "AccountSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Account", AccountObjectKeyHelper.toMap(noOpIn, new HashMap(), "Account").get("Account"));
    }
  }
/**
 *
 * Sets the  Account
 * @param noOpInIn AccountObjectKeyData to set
 *
 */
  public void setAccount(AccountObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Account passed into the constructor
 * @return Simulated response
 *
 */
  public AccountObjectKeyData getAccount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountObjectKeyHelper.fromMap(inputMap, "Account");
  }
}
