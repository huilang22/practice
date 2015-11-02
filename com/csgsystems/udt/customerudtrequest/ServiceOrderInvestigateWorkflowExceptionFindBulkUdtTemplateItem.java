/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderInvestigateWorkflowExceptionFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderInvestigateWorkflowExceptionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderInvestigateWorkflowExceptionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderInvestigateObjectFilter WfmExcepIn;
/**
 *
 * Constructor to create a  ServiceOrderInvestigateWorkflowExceptionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderInvestigateWorkflowExceptionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderInvestigateObjectFilter WfmExcepInIn) {
    super(id, context, "ServiceOrderInvestigateWorkflowExceptionFind");
    WfmExcepIn = WfmExcepInIn;
  }

  public void translateToMap() {
    if (WfmExcepIn != null) {
      Integer index =  WfmExcepIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderInvestigate", ServiceOrderInvestigateObjectHelper.toMap(WfmExcepIn, new HashMap(), "ServiceOrderInvestigate").get("ServiceOrderInvestigate"));
    }
  }


/**
 *
 * Sets the ServiceOrderInvestigate
 * @param WfmExcepInIn Value of the WfmExcepIn
 *
 */

  public void setServiceOrderInvestigate(ServiceOrderInvestigateObjectFilter WfmExcepInIn) {
    WfmExcepIn = WfmExcepInIn;
  }

  public void translateFromMap() {
    WfmExcepIn = ServiceOrderInvestigateObjectHelper.fromMapFilter(inputMap, "ServiceOrderInvestigate");
  }

/**
 *
 * Gets the ServiceOrderInvestigate
 * @return Value of the ServiceOrderInvestigate
 *
 */

  public ServiceOrderInvestigateObjectFilter getServiceOrderInvestigate( ) {
    return WfmExcepIn;
  }

}
