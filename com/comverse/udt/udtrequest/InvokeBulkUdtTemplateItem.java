/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvokeBulkUdtTemplateItem.java
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
import com.csgsystems.ai.data.*;

/**
 *
 * Class used to create a InvokeBulkUdtTemplateItem Bulk Template
 *
 */

public class InvokeBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String serviceName;
  protected String payload;
/**
 *
 * Constructor to create a  InvokeBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvokeBulkUdtTemplateItem(String id, BSDMSessionContext context, String serviceNameIn, String payloadIn) {
    super(id, context, "Invoke");
    serviceName = serviceNameIn;
    payload = payloadIn;
  }

  public void translateToMap() {
    if (serviceName != null) {
      addInput("ServiceName", serviceName);
    }
    if (payload != null) {
      addInput("Payload", payload);
    }
  }


/**
 *
 * Sets the ServiceName
 * @param serviceNameIn Value of the serviceName
 *
 */

  public void setServiceName(String serviceNameIn) {
    serviceName = serviceNameIn;
  }

/**
 *
 * Sets the Payload
 * @param payloadIn Value of the payload
 *
 */

  public void setPayload(String payloadIn) {
    payload = payloadIn;
  }

  public void translateFromMap() {
    serviceName = (String)inputMap.get("ServiceName");
    payload = (String)inputMap.get("Payload");
  }

/**
 *
 * Gets the ServiceName
 * @return Value of the ServiceName
 *
 */

  public String getServiceName( ) {
    return serviceName;
  }

/**
 *
 * Gets the Payload
 * @return Value of the Payload
 *
 */

  public String getPayload( ) {
    return payload;
  }

}
