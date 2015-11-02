/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountAbiSourceCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountAbiSourceCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountAbiSourceCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountAbiSourceObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountAbiSourceCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountAbiSourceCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountAbiSourceObjectData noOpInIn) {
    super(id, context, "AccountAbiSourceCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(noOpIn, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }
/**
 *
 * Sets the  AccountAbiSource
 * @param noOpInIn AccountAbiSourceObjectData to set
 *
 */
  public void setAccountAbiSource(AccountAbiSourceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountAbiSource passed into the constructor
 * @return Simulated response
 *
 */
  public AccountAbiSourceObjectData getAccountAbiSource() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountAbiSourceObjectHelper.fromMap(inputMap, "AccountAbiSource");
  }
}
