/*
 * Generated code DO NOT EDIT
 * Generated file: UsageJurisdictionCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a UsageJurisdictionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageJurisdictionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageJurisdictionObjectData noOpIn;

/**
 *
 * Constructor to create a   UsageJurisdictionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageJurisdictionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageJurisdictionObjectData noOpInIn) {
    super(id, context, "UsageJurisdictionCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(noOpIn, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }
/**
 *
 * Sets the  UsageJurisdiction
 * @param noOpInIn UsageJurisdictionObjectData to set
 *
 */
  public void setUsageJurisdiction(UsageJurisdictionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageJurisdiction passed into the constructor
 * @return Simulated response
 *
 */
  public UsageJurisdictionObjectData getUsageJurisdiction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageJurisdictionObjectHelper.fromMap(inputMap, "UsageJurisdiction");
  }
}
