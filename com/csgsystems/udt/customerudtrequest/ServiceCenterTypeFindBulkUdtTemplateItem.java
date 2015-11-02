/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceCenterTypeFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ServiceCenterTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceCenterTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceCenterTypeObjectFilter SCTFindIn;
/**
 *
 * Constructor to create a  ServiceCenterTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceCenterTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceCenterTypeObjectFilter SCTFindInIn) {
    super(id, context, "ServiceCenterTypeFind");
    SCTFindIn = SCTFindInIn;
  }

  public void translateToMap() {
    if (SCTFindIn != null) {
      Integer index =  SCTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceCenterType", ServiceCenterTypeObjectHelper.toMap(SCTFindIn, new HashMap(), "ServiceCenterType").get("ServiceCenterType"));
    }
  }


/**
 *
 * Sets the ServiceCenterType
 * @param SCTFindInIn Value of the SCTFindIn
 *
 */

  public void setServiceCenterType(ServiceCenterTypeObjectFilter SCTFindInIn) {
    SCTFindIn = SCTFindInIn;
  }

  public void translateFromMap() {
    SCTFindIn = ServiceCenterTypeObjectHelper.fromMapFilter(inputMap, "ServiceCenterType");
  }

/**
 *
 * Gets the ServiceCenterType
 * @return Value of the ServiceCenterType
 *
 */

  public ServiceCenterTypeObjectFilter getServiceCenterType( ) {
    return SCTFindIn;
  }

}
