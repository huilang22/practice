/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SupervisorCreateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a SupervisorCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SupervisorCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SupervisorObjectData noOpIn;

/**
 *
 * Constructor to create a   SupervisorCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SupervisorCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SupervisorObjectData noOpInIn) {
    super(id, context, "SupervisorCreate");
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
