/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderInvestigateExceptionFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ServiceOrderInvestigateExceptionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderInvestigateExceptionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderInvestigateObjectFilter ServiceOrderExcepIn;
/**
 *
 * Constructor to create a  ServiceOrderInvestigateExceptionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderInvestigateExceptionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderInvestigateObjectFilter ServiceOrderExcepInIn) {
    super(id, context, "ServiceOrderInvestigateExceptionFind");
    ServiceOrderExcepIn = ServiceOrderExcepInIn;
  }

  public void translateToMap() {
    if (ServiceOrderExcepIn != null) {
      Integer index =  ServiceOrderExcepIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderInvestigate", ServiceOrderInvestigateObjectHelper.toMap(ServiceOrderExcepIn, new HashMap(), "ServiceOrderInvestigate").get("ServiceOrderInvestigate"));
    }
  }


/**
 *
 * Sets the ServiceOrderInvestigate
 * @param ServiceOrderExcepInIn Value of the ServiceOrderExcepIn
 *
 */

  public void setServiceOrderInvestigate(ServiceOrderInvestigateObjectFilter ServiceOrderExcepInIn) {
    ServiceOrderExcepIn = ServiceOrderExcepInIn;
  }

  public void translateFromMap() {
    ServiceOrderExcepIn = ServiceOrderInvestigateObjectHelper.fromMapFilter(inputMap, "ServiceOrderInvestigate");
  }

/**
 *
 * Gets the ServiceOrderInvestigate
 * @return Value of the ServiceOrderInvestigate
 *
 */

  public ServiceOrderInvestigateObjectFilter getServiceOrderInvestigate( ) {
    return ServiceOrderExcepIn;
  }

}
