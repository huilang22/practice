/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderInvestigateErrorConditionFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderInvestigateErrorConditionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderInvestigateErrorConditionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderInvestigateObjectFilter ServiceOrderCondIn;
/**
 *
 * Constructor to create a  ServiceOrderInvestigateErrorConditionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderInvestigateErrorConditionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderInvestigateObjectFilter ServiceOrderCondInIn) {
    super(id, context, "ServiceOrderInvestigateErrorConditionFind");
    ServiceOrderCondIn = ServiceOrderCondInIn;
  }

  public void translateToMap() {
    if (ServiceOrderCondIn != null) {
      Integer index =  ServiceOrderCondIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderInvestigate", ServiceOrderInvestigateObjectHelper.toMap(ServiceOrderCondIn, new HashMap(), "ServiceOrderInvestigate").get("ServiceOrderInvestigate"));
    }
  }


/**
 *
 * Sets the ServiceOrderInvestigate
 * @param ServiceOrderCondInIn Value of the ServiceOrderCondIn
 *
 */

  public void setServiceOrderInvestigate(ServiceOrderInvestigateObjectFilter ServiceOrderCondInIn) {
    ServiceOrderCondIn = ServiceOrderCondInIn;
  }

  public void translateFromMap() {
    ServiceOrderCondIn = ServiceOrderInvestigateObjectHelper.fromMapFilter(inputMap, "ServiceOrderInvestigate");
  }

/**
 *
 * Gets the ServiceOrderInvestigate
 * @return Value of the ServiceOrderInvestigate
 *
 */

  public ServiceOrderInvestigateObjectFilter getServiceOrderInvestigate( ) {
    return ServiceOrderCondIn;
  }

}
