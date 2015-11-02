/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointTransTypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BonusPointTransTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BonusPointTransTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BonusPointTransTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   BonusPointTransTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BonusPointTransTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BonusPointTransTypeObjectData noOpInIn) {
    super(id, context, "BonusPointTransTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(noOpIn, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }
/**
 *
 * Sets the  BonusPointTransType
 * @param noOpInIn BonusPointTransTypeObjectData to set
 *
 */
  public void setBonusPointTransType(BonusPointTransTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BonusPointTransType passed into the constructor
 * @return Simulated response
 *
 */
  public BonusPointTransTypeObjectData getBonusPointTransType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BonusPointTransTypeObjectHelper.fromMap(inputMap, "BonusPointTransType");
  }
}
