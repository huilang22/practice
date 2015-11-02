/*
 * Generated code DO NOT EDIT
 * Generated file: EpiAssignGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EpiAssignGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EpiAssignGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EpiAssignObjectData noOpIn;

/**
 *
 * Constructor to create a   EpiAssignGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EpiAssignGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiAssignObjectData noOpInIn) {
    super(id, context, "EpiAssignGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EpiAssign", EpiAssignObjectHelper.toMap(noOpIn, new HashMap(), "EpiAssign").get("EpiAssign"));
    }
  }
/**
 *
 * Sets the  EpiAssign
 * @param noOpInIn EpiAssignObjectData to set
 *
 */
  public void setEpiAssign(EpiAssignObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EpiAssign passed into the constructor
 * @return Simulated response
 *
 */
  public EpiAssignObjectData getEpiAssign() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EpiAssignObjectHelper.fromMap(inputMap, "EpiAssign");
  }
}
