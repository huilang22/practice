/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountIdDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountIdDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountIdDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountIdObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountIdDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountIdDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountIdObjectData noOpInIn) {
    super(id, context, "AccountIdDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountId", AccountIdObjectHelper.toMap(noOpIn, new HashMap(), "AccountId").get("AccountId"));
    }
  }
/**
 *
 * Sets the  AccountId
 * @param noOpInIn AccountIdObjectData to set
 *
 */
  public void setAccountId(AccountIdObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountId passed into the constructor
 * @return Simulated response
 *
 */
  public AccountIdObjectData getAccountId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountIdObjectHelper.fromMap(inputMap, "AccountId");
  }
}
