/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogCreateNoOpRequest.java
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
 * NoOp class used to simulate a ServiceAddressAssocCatalogCreateNoOpRequest Udt Request/Response
 *
 */
public class ServiceAddressAssocCatalogCreateNoOpRequest extends ServiceAddressAssocCatalogSubRequestParent {
/**
 *
 * Constructor to create a   ServiceAddressAssocCatalogCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceAddressAssocCatalogCreateNoOpRequest(String id, ServiceAddressAssocCatalogObjData noOpIn) {
    super(id, "ServiceAddressAssocCatalogCreateNoOpRequest");
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
