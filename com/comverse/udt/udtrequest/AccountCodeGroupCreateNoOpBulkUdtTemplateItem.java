/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGroupCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountCodeGroupCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountCodeGroupCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountCodeGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountCodeGroupCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountCodeGroupCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeGroupObjectData noOpInIn) {
    super(id, context, "AccountCodeGroupCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(noOpIn, new HashMap(), "AccountCodeGroup").get("AccountCodeGroup"));
    }
  }
/**
 *
 * Sets the  AccountCodeGroup
 * @param noOpInIn AccountCodeGroupObjectData to set
 *
 */
  public void setAccountCodeGroup(AccountCodeGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountCodeGroup passed into the constructor
 * @return Simulated response
 *
 */
  public AccountCodeGroupObjectData getAccountCodeGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountCodeGroupObjectHelper.fromMap(inputMap, "AccountCodeGroup");
  }
}
