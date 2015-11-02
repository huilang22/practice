/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceLockCreateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceLockCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceLockCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer ServiceInternalId;
  protected Integer ServiceInternalIdResets;
  protected String ServiceOrderId2;
/**
 *
 * Constructor to create a  ServiceLockCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceLockCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer ServiceInternalIdIn, Integer ServiceInternalIdResetsIn, String ServiceOrderId2In) {
    super(id, context, "ServiceLockCreate");
    ServiceInternalId = ServiceInternalIdIn;
    ServiceInternalIdResets = ServiceInternalIdResetsIn;
    ServiceOrderId2 = ServiceOrderId2In;
  }

  public void translateToMap() {
    if (ServiceInternalId != null) {
      addInput("ServiceInternalId", ServiceInternalId);
    }
    if (ServiceInternalIdResets != null) {
      addInput("ServiceInternalIdResets", ServiceInternalIdResets);
    }
    if (ServiceOrderId2 != null) {
      addInput("ServiceOrderId2", ServiceOrderId2);
    }
  }


/**
 *
 * Sets the ServiceInternalId
 * @param ServiceInternalIdIn Value of the ServiceInternalId
 *
 */

  public void setServiceInternalId(Integer ServiceInternalIdIn) {
    ServiceInternalId = ServiceInternalIdIn;
  }

/**
 *
 * Sets the ServiceInternalIdResets
 * @param ServiceInternalIdResetsIn Value of the ServiceInternalIdResets
 *
 */

  public void setServiceInternalIdResets(Integer ServiceInternalIdResetsIn) {
    ServiceInternalIdResets = ServiceInternalIdResetsIn;
  }

/**
 *
 * Sets the ServiceOrderId2
 * @param ServiceOrderId2In Value of the ServiceOrderId2
 *
 */

  public void setServiceOrderId2(String ServiceOrderId2In) {
    ServiceOrderId2 = ServiceOrderId2In;
  }

  public void translateFromMap() {
    ServiceInternalId = (Integer)inputMap.get("ServiceInternalId");
    ServiceInternalIdResets = (Integer)inputMap.get("ServiceInternalIdResets");
    ServiceOrderId2 = (String)inputMap.get("ServiceOrderId2");
  }

/**
 *
 * Gets the ServiceInternalId
 * @return Value of the ServiceInternalId
 *
 */

  public Integer getServiceInternalId( ) {
    return ServiceInternalId;
  }

/**
 *
 * Gets the ServiceInternalIdResets
 * @return Value of the ServiceInternalIdResets
 *
 */

  public Integer getServiceInternalIdResets( ) {
    return ServiceInternalIdResets;
  }

/**
 *
 * Gets the ServiceOrderId2
 * @return Value of the ServiceOrderId2
 *
 */

  public String getServiceOrderId2( ) {
    return ServiceOrderId2;
  }

}
