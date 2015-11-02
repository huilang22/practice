/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentUpdateNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a AccountSegmentUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountSegmentUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountSegmentObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountSegmentUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountSegmentUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentObjectData noOpInIn) {
    super(id, context, "AccountSegmentUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(noOpIn, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }
/**
 *
 * Sets the  AccountSegment
 * @param noOpInIn AccountSegmentObjectData to set
 *
 */
  public void setAccountSegment(AccountSegmentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountSegment passed into the constructor
 * @return Simulated response
 *
 */
  public AccountSegmentObjectData getAccountSegment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountSegmentObjectHelper.fromMap(inputMap, "AccountSegment");
  }
}
