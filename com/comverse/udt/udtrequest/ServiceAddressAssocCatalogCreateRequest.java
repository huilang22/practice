/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogCreateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceAddressAssocCatalogCreateRequest Udt Request
 *
 */

public class ServiceAddressAssocCatalogCreateRequest extends ServiceAddressAssocCatalogSubRequestParent {
/**
 *
 * Constructor to create a  ServiceAddressAssocCatalogCreateRequest
 * @param id Unique request name
 * @param createIn ServiceAddressAssocCatalogObjData for ServiceAddressAssocCatalogCreateRequest
 *
 */
@JsonCreator
  public ServiceAddressAssocCatalogCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceAddressAssocCatalog")ServiceAddressAssocCatalogObjData createIn) {
    super(id, "ServiceAddressAssocCatalogCreate");
    if (createIn != null) {
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjHelper.toMap(createIn, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }

/**
 *
 * Retrieves the ServiceAddressAssocCatalogObjData that results from the ServiceAddressAssocCatalogCreateRequest call
 * @return ServiceAddressAssocCatalogObjData resulting from udt call
 *
 */

  public ServiceAddressAssocCatalogObjData getOutput() {
    return ServiceAddressAssocCatalogObjHelper.fromMap(outputMap, "ServiceAddressAssocCatalog");
  }
}
