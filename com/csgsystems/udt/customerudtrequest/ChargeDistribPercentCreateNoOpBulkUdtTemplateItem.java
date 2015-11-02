/*
 * Generated code DO NOT EDIT
 * Generated file: ChargeDistribPercentCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ChargeDistribPercentCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ChargeDistribPercentCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ChargeDistribPercentObjectData noOpIn;

/**
 *
 * Constructor to create a   ChargeDistribPercentCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ChargeDistribPercentCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeDistribPercentObjectData noOpInIn) {
    super(id, context, "ChargeDistribPercentCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectHelper.toMap(noOpIn, new HashMap(), "ChargeDistribPercent").get("ChargeDistribPercent"));
    }
  }
/**
 *
 * Sets the  ChargeDistribPercent
 * @param noOpInIn ChargeDistribPercentObjectData to set
 *
 */
  public void setChargeDistribPercent(ChargeDistribPercentObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ChargeDistribPercent passed into the constructor
 * @return Simulated response
 *
 */
  public ChargeDistribPercentObjectData getChargeDistribPercent() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ChargeDistribPercentObjectHelper.fromMap(inputMap, "ChargeDistribPercent");
  }
}
