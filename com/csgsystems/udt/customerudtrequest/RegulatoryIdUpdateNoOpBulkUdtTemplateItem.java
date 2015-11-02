/*
 * Generated code DO NOT EDIT
 * Generated file: RegulatoryIdUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RegulatoryIdUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RegulatoryIdUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RegulatoryIdObjectData noOpIn;

/**
 *
 * Constructor to create a   RegulatoryIdUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RegulatoryIdUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RegulatoryIdObjectData noOpInIn) {
    super(id, context, "RegulatoryIdUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RegulatoryId", RegulatoryIdObjectHelper.toMap(noOpIn, new HashMap(), "RegulatoryId").get("RegulatoryId"));
    }
  }
/**
 *
 * Sets the  RegulatoryId
 * @param noOpInIn RegulatoryIdObjectData to set
 *
 */
  public void setRegulatoryId(RegulatoryIdObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RegulatoryId passed into the constructor
 * @return Simulated response
 *
 */
  public RegulatoryIdObjectData getRegulatoryId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RegulatoryIdObjectHelper.fromMap(inputMap, "RegulatoryId");
  }
}
