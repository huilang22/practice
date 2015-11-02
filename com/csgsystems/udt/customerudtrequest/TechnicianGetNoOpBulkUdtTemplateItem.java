/*
 * Generated code DO NOT EDIT
 * Generated file: TechnicianGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a TechnicianGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TechnicianGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TechnicianObjectData noOpIn;

/**
 *
 * Constructor to create a   TechnicianGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TechnicianGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TechnicianObjectData noOpInIn) {
    super(id, context, "TechnicianGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Technician", TechnicianObjectHelper.toMap(noOpIn, new HashMap(), "Technician").get("Technician"));
    }
  }
/**
 *
 * Sets the  Technician
 * @param noOpInIn TechnicianObjectData to set
 *
 */
  public void setTechnician(TechnicianObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Technician passed into the constructor
 * @return Simulated response
 *
 */
  public TechnicianObjectData getTechnician() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TechnicianObjectHelper.fromMap(inputMap, "Technician");
  }
}
