/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceAddressAssocGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceAddressAssocGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceAddressAssocObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceAddressAssocGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceAddressAssocGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocObjectData noOpInIn) {
    super(id, context, "ServiceAddressAssocGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectHelper.toMap(noOpIn, new HashMap(), "ServiceAddressAssoc").get("ServiceAddressAssoc"));
    }
  }
/**
 *
 * Sets the  ServiceAddressAssoc
 * @param noOpInIn ServiceAddressAssocObjectData to set
 *
 */
  public void setServiceAddressAssoc(ServiceAddressAssocObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceAddressAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceAddressAssocObjectData getServiceAddressAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceAddressAssocObjectHelper.fromMap(inputMap, "ServiceAddressAssoc");
  }
}
