/*
 * Generated code DO NOT EDIT
 * Generated file: SupervisorGetBulkUdtTemplateItem.java
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
 * Class used to create a SupervisorGetBulkUdtTemplateItem Bulk Template
 *
 */

public class SupervisorGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SupervisorObjectKeyData SupervisorGetIn;
/**
 *
 * Constructor to create a  SupervisorGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SupervisorGetBulkUdtTemplateItem(String id, BSDMSessionContext context, SupervisorObjectKeyData SupervisorGetInIn) {
    super(id, context, "SupervisorGet");
    SupervisorGetIn = SupervisorGetInIn;
  }

  public void translateToMap() {
    if (SupervisorGetIn != null) {
      SupervisorGetIn.resetFlags(true, true);
      addInput("Supervisor", SupervisorObjectKeyHelper.toMap(SupervisorGetIn, new HashMap(), "SupervisorObjectKeyData").get("SupervisorObjectKeyData"));
    }
  }


/**
 *
 * Sets the Supervisor
 * @param SupervisorGetInIn Value of the SupervisorGetIn
 *
 */

  public void setSupervisor(SupervisorObjectKeyData SupervisorGetInIn) {
    SupervisorGetIn = SupervisorGetInIn;
  }

  public void translateFromMap() {
    SupervisorGetIn = SupervisorObjectKeyHelper.fromMap(inputMap, "Supervisor");
  }

/**
 *
 * Gets the Supervisor
 * @return Value of the Supervisor
 *
 */

  public SupervisorObjectKeyData getSupervisor( ) {
    return SupervisorGetIn;
  }

}
