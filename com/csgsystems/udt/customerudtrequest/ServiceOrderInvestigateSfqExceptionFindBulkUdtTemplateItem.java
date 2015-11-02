/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderInvestigateSfqExceptionFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderInvestigateSfqExceptionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderInvestigateSfqExceptionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderInvestigateObjectFilter SfqExcepIn;
/**
 *
 * Constructor to create a  ServiceOrderInvestigateSfqExceptionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderInvestigateSfqExceptionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderInvestigateObjectFilter SfqExcepInIn) {
    super(id, context, "ServiceOrderInvestigateSfqExceptionFind");
    SfqExcepIn = SfqExcepInIn;
  }

  public void translateToMap() {
    if (SfqExcepIn != null) {
      Integer index =  SfqExcepIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderInvestigate", ServiceOrderInvestigateObjectHelper.toMap(SfqExcepIn, new HashMap(), "ServiceOrderInvestigate").get("ServiceOrderInvestigate"));
    }
  }


/**
 *
 * Sets the ServiceOrderInvestigate
 * @param SfqExcepInIn Value of the SfqExcepIn
 *
 */

  public void setServiceOrderInvestigate(ServiceOrderInvestigateObjectFilter SfqExcepInIn) {
    SfqExcepIn = SfqExcepInIn;
  }

  public void translateFromMap() {
    SfqExcepIn = ServiceOrderInvestigateObjectHelper.fromMapFilter(inputMap, "ServiceOrderInvestigate");
  }

/**
 *
 * Gets the ServiceOrderInvestigate
 * @return Value of the ServiceOrderInvestigate
 *
 */

  public ServiceOrderInvestigateObjectFilter getServiceOrderInvestigate( ) {
    return SfqExcepIn;
  }

}
