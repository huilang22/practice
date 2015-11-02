/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogGetNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ServiceAddressAssocCatalogGetNoOpRequest Udt Request/Response
 *
 */
public class ServiceAddressAssocCatalogGetNoOpRequest extends ServiceAddressAssocCatalogSubRequestParent {
/**
 *
 * Constructor to create a   ServiceAddressAssocCatalogGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceAddressAssocCatalogGetNoOpRequest(String id, ServiceAddressAssocCatalogObjData noOpIn) {
    super(id, "ServiceAddressAssocCatalogGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjHelper.toMap(noOpIn, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }
/**
 *
 * Retrieves the ServiceAddressAssocCatalogObjData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceAddressAssocCatalogObjData getOutput() {
    return ServiceAddressAssocCatalogObjHelper.fromMap(outputMap, "ServiceAddressAssocCatalog");
  }
}
