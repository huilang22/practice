/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderDependencyFindDependentBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderDependencyFindDependentBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderDependencyFindDependentBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderDependencyObjectFilter ServiceOrderDependencyFindDependentIn;
/**
 *
 * Constructor to create a  ServiceOrderDependencyFindDependentBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderDependencyFindDependentBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderDependencyObjectFilter ServiceOrderDependencyFindDependentInIn) {
    super(id, context, "ServiceOrderDependencyFindDependent");
    ServiceOrderDependencyFindDependentIn = ServiceOrderDependencyFindDependentInIn;
  }

  public void translateToMap() {
    if (ServiceOrderDependencyFindDependentIn != null) {
      Integer index =  ServiceOrderDependencyFindDependentIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectHelper.toMap(ServiceOrderDependencyFindDependentIn, new HashMap(), "ServiceOrderDependency").get("ServiceOrderDependency"));
    }
  }


/**
 *
 * Sets the ServiceOrderDependency
 * @param ServiceOrderDependencyFindDependentInIn Value of the ServiceOrderDependencyFindDependentIn
 *
 */

  public void setServiceOrderDependency(ServiceOrderDependencyObjectFilter ServiceOrderDependencyFindDependentInIn) {
    ServiceOrderDependencyFindDependentIn = ServiceOrderDependencyFindDependentInIn;
  }

  public void translateFromMap() {
    ServiceOrderDependencyFindDependentIn = ServiceOrderDependencyObjectHelper.fromMapFilter(inputMap, "ServiceOrderDependency");
  }

/**
 *
 * Gets the ServiceOrderDependency
 * @return Value of the ServiceOrderDependency
 *
 */

  public ServiceOrderDependencyObjectFilter getServiceOrderDependency( ) {
    return ServiceOrderDependencyFindDependentIn;
  }

}
