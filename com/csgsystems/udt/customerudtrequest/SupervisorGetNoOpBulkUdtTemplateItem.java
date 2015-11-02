/*
 * Generated code DO NOT EDIT
 * Generated file: SupervisorGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SupervisorGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SupervisorGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SupervisorObjectData noOpIn;

/**
 *
 * Constructor to create a   SupervisorGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SupervisorGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SupervisorObjectData noOpInIn) {
    super(id, context, "SupervisorGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Supervisor", SupervisorObjectHelper.toMap(noOpIn, new HashMap(), "Supervisor").get("Supervisor"));
    }
  }
/**
 *
 * Sets the  Supervisor
 * @param noOpInIn SupervisorObjectData to set
 *
 */
  public void setSupervisor(SupervisorObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Supervisor passed into the constructor
 * @return Simulated response
 *
 */
  public SupervisorObjectData getSupervisor() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SupervisorObjectHelper.fromMap(inputMap, "Supervisor");
  }
}
