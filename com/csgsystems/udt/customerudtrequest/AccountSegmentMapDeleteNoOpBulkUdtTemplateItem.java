/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentMapDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountSegmentMapDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountSegmentMapDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountSegmentMapObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountSegmentMapDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountSegmentMapDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentMapObjectData noOpInIn) {
    super(id, context, "AccountSegmentMapDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(noOpIn, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }
/**
 *
 * Sets the  AccountSegmentMap
 * @param noOpInIn AccountSegmentMapObjectData to set
 *
 */
  public void setAccountSegmentMap(AccountSegmentMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountSegmentMap passed into the constructor
 * @return Simulated response
 *
 */
  public AccountSegmentMapObjectData getAccountSegmentMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountSegmentMapObjectHelper.fromMap(inputMap, "AccountSegmentMap");
  }
}
