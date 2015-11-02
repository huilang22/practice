/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogUpdateRequest.java
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
 * Class used to create a ServiceAddressAssocCatalogUpdateRequest Udt Request
 *
 */

public class ServiceAddressAssocCatalogUpdateRequest extends ServiceAddressAssocCatalogSubRequestParent {
/**
 *
 * Constructor to create a  ServiceAddressAssocCatalogUpdateRequest
 * @param id Unique request name
 * @param updateIn ServiceAddressAssocCatalogObjData for ServiceAddressAssocCatalogUpdateRequest
 *
 */
@JsonCreator
  public ServiceAddressAssocCatalogUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceAddressAssocCatalog")ServiceAddressAssocCatalogObjData updateIn) {
    super(id, "ServiceAddressAssocCatalogUpdate");
    if (updateIn != null) {
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjHelper.toMap(updateIn, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }

/**
 *
 * Retrieves the ServiceAddressAssocCatalogObjData that results from the ServiceAddressAssocCatalogUpdateRequest call
 * @return ServiceAddressAssocCatalogObjData resulting from udt call
 *
 */

  public ServiceAddressAssocCatalogObjData getOutput() {
    return ServiceAddressAssocCatalogObjHelper.fromMap(outputMap, "ServiceAddressAssocCatalog");
  }
}
