/*
 * Generated code DO NOT EDIT
 * Generated file: SupervisorFindBulkUdtTemplateItem.java
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
 * Class used to create a SupervisorFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SupervisorFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SupervisorObjectFilter SupervisorFindIn;
/**
 *
 * Constructor to create a  SupervisorFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SupervisorFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SupervisorObjectFilter SupervisorFindInIn) {
    super(id, context, "SupervisorFind");
    SupervisorFindIn = SupervisorFindInIn;
  }

  public void translateToMap() {
    if (SupervisorFindIn != null) {
      Integer index =  SupervisorFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Supervisor", SupervisorObjectHelper.toMap(SupervisorFindIn, new HashMap(), "Supervisor").get("Supervisor"));
    }
  }


/**
 *
 * Sets the Supervisor
 * @param SupervisorFindInIn Value of the SupervisorFindIn
 *
 */

  public void setSupervisor(SupervisorObjectFilter SupervisorFindInIn) {
    SupervisorFindIn = SupervisorFindInIn;
  }

  public void translateFromMap() {
    SupervisorFindIn = SupervisorObjectHelper.fromMapFilter(inputMap, "Supervisor");
  }

/**
 *
 * Gets the Supervisor
 * @return Value of the Supervisor
 *
 */

  public SupervisorObjectFilter getSupervisor( ) {
    return SupervisorFindIn;
  }

}
