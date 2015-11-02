/*
 * Generated code DO NOT EDIT
 * Generated file: SupervisorCreateBulkUdtTemplateItem.java
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
 * Class used to create a SupervisorCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class SupervisorCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SupervisorObjectData SupervisorCreateIn;
/**
 *
 * Constructor to create a  SupervisorCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SupervisorCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, SupervisorObjectData SupervisorCreateInIn) {
    super(id, context, "SupervisorCreate");
    SupervisorCreateIn = SupervisorCreateInIn;
  }

  public void translateToMap() {
    if (SupervisorCreateIn != null) {
      SupervisorCreateIn.resetFlags(true, true);
      addInput("Supervisor", SupervisorObjectHelper.toMap(SupervisorCreateIn, new HashMap(), "Supervisor").get("Supervisor"));
    }
  }


/**
 *
 * Sets the Supervisor
 * @param SupervisorCreateInIn Value of the SupervisorCreateIn
 *
 */

  public void setSupervisor(SupervisorObjectData SupervisorCreateInIn) {
    SupervisorCreateIn = SupervisorCreateInIn;
  }

  public void translateFromMap() {
    SupervisorCreateIn = SupervisorObjectHelper.fromMap(inputMap, "Supervisor");
  }

/**
 *
 * Gets the Supervisor
 * @return Value of the Supervisor
 *
 */

  public SupervisorObjectData getSupervisor( ) {
    return SupervisorCreateIn;
  }

}
