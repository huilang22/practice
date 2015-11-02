/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderCommitNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ServiceOrderCommitNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderCommitNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceOrderObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderCommitNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderCommitNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseData noOpInIn) {
    super(id, context, "ServiceOrderCommit");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(noOpIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
/**
 *
 * Sets the  ServiceOrder
 * @param noOpInIn ServiceOrderObjectBaseData to set
 *
 */
  public void setServiceOrder(ServiceOrderObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceOrder passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderObjectBaseData getServiceOrder() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceOrderObjectBaseHelper.fromMap(inputMap, "ServiceOrder");
  }
}
