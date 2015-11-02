/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SupervisorUpdateBulkUdtTemplateItem.java
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
 * Class used to create a SupervisorUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class SupervisorUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SupervisorObjectData SupervisorUpdateIn;
/**
 *
 * Constructor to create a  SupervisorUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SupervisorUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, SupervisorObjectData SupervisorUpdateInIn) {
    super(id, context, "SupervisorUpdate");
    SupervisorUpdateIn = SupervisorUpdateInIn;
  }

  public void translateToMap() {
    if (SupervisorUpdateIn != null) {
      SupervisorUpdateIn.resetFlags(true, true);
      addInput("Supervisor", SupervisorObjectHelper.toMap(SupervisorUpdateIn, new HashMap(), "Supervisor").get("Supervisor"));
    }
  }


/**
 *
 * Sets the Supervisor
 * @param SupervisorUpdateInIn Value of the SupervisorUpdateIn
 *
 */

  public void setSupervisor(SupervisorObjectData SupervisorUpdateInIn) {
    SupervisorUpdateIn = SupervisorUpdateInIn;
  }

  public void translateFromMap() {
    SupervisorUpdateIn = SupervisorObjectHelper.fromMap(inputMap, "Supervisor");
  }

/**
 *
 * Gets the Supervisor
 * @return Value of the Supervisor
 *
 */

  public SupervisorObjectData getSupervisor( ) {
    return SupervisorUpdateIn;
  }

}
