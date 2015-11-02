/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointIdCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BonusPointIdCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BonusPointIdCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BPIObjectData noOpIn;

/**
 *
 * Constructor to create a   BonusPointIdCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BonusPointIdCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BPIObjectData noOpInIn) {
    super(id, context, "BonusPointIdCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BonusPointId", BPIObjectHelper.toMap(noOpIn, new HashMap(), "BonusPointId").get("BonusPointId"));
    }
  }
/**
 *
 * Sets the  BonusPointId
 * @param noOpInIn BPIObjectData to set
 *
 */
  public void setBonusPointId(BPIObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BonusPointId passed into the constructor
 * @return Simulated response
 *
 */
  public BPIObjectData getBonusPointId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BPIObjectHelper.fromMap(inputMap, "BonusPointId");
  }
}
