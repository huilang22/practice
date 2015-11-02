/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountInsertDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountInsertDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountInsertObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountInsertDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountInsertDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountInsertObjectData noOpInIn) {
    super(id, context, "AccountInsertDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(noOpIn, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }
/**
 *
 * Sets the  AccountInsert
 * @param noOpInIn AccountInsertObjectData to set
 *
 */
  public void setAccountInsert(AccountInsertObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountInsert passed into the constructor
 * @return Simulated response
 *
 */
  public AccountInsertObjectData getAccountInsert() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountInsertObjectHelper.fromMap(inputMap, "AccountInsert");
  }
}
