/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ServiceAddressAssocCatalogUpdateNoOpRequest Udt Request/Response
 *
 */
public class ServiceAddressAssocCatalogUpdateNoOpRequest extends ServiceAddressAssocCatalogSubRequestParent {
/**
 *
 * Constructor to create a   ServiceAddressAssocCatalogUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceAddressAssocCatalogUpdateNoOpRequest(String id, ServiceAddressAssocCatalogObjData noOpIn) {
    super(id, "ServiceAddressAssocCatalogUpdateNoOpRequest");
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
