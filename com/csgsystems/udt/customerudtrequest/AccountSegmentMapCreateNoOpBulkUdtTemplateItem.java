/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentMapCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountSegmentMapCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountSegmentMapCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountSegmentMapObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountSegmentMapCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountSegmentMapCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountSegmentMapObjectData noOpInIn) {
    super(id, context, "AccountSegmentMapCreate");
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
