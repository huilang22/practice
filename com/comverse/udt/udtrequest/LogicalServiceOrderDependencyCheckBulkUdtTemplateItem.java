/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderDependencyCheckBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a LogicalServiceOrderDependencyCheckBulkUdtTemplateItem Bulk Template
 *
 */

public class LogicalServiceOrderDependencyCheckBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectData LSODCServiceOrderIn;
/**
 *
 * Constructor to create a  LogicalServiceOrderDependencyCheckBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LogicalServiceOrderDependencyCheckBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectData LSODCServiceOrderInIn) {
    super(id, context, "LogicalServiceOrderDependencyCheck");
    LSODCServiceOrderIn = LSODCServiceOrderInIn;
  }

  public void translateToMap() {
    if (LSODCServiceOrderIn != null) {
      LSODCServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(LSODCServiceOrderIn, new HashMap(), "LogicalServiceOrderDependencyCheckOutputData").get("LogicalServiceOrderDependencyCheckOutputData"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param LSODCServiceOrderInIn Value of the LSODCServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData LSODCServiceOrderInIn) {
    LSODCServiceOrderIn = LSODCServiceOrderInIn;
  }

  public void translateFromMap() {
    LSODCServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return LSODCServiceOrderIn;
  }

}
