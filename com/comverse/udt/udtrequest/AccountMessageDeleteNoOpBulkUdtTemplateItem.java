/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountMessageDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountMessageDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountMessageObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountMessageDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountMessageDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountMessageObjectData noOpInIn) {
    super(id, context, "AccountMessageDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(noOpIn, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }
/**
 *
 * Sets the  AccountMessage
 * @param noOpInIn AccountMessageObjectData to set
 *
 */
  public void setAccountMessage(AccountMessageObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountMessage passed into the constructor
 * @return Simulated response
 *
 */
  public AccountMessageObjectData getAccountMessage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountMessageObjectHelper.fromMap(inputMap, "AccountMessage");
  }
}
