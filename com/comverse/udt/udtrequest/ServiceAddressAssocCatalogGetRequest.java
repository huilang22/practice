/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogGetRequest.java
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
 * Class used to create a ServiceAddressAssocCatalogGetRequest Udt Request
 *
 */

public class ServiceAddressAssocCatalogGetRequest extends ServiceAddressAssocCatalogSubRequestParent {
/**
 *
 * Constructor to create a  ServiceAddressAssocCatalogGetRequest
 * @param id Unique request name
 * @param getIn ServiceAddressAssocCatalogObjKeyData for ServiceAddressAssocCatalogGetRequest
 *
 */
@JsonCreator
  public ServiceAddressAssocCatalogGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceAddressAssocCatalog")ServiceAddressAssocCatalogObjKeyData getIn) {
    super(id, "ServiceAddressAssocCatalogGet");
    if (getIn != null) {
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjKeyHelper.toMap(getIn, new HashMap(), "ServiceAddressAssocCatalogObjKeyData").get("ServiceAddressAssocCatalogObjKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceAddressAssocCatalogObjData that results from the ServiceAddressAssocCatalogGetRequest call
 * @return ServiceAddressAssocCatalogObjData resulting from udt call
 *
 */

  public ServiceAddressAssocCatalogObjData getOutput() {
    return ServiceAddressAssocCatalogObjHelper.fromMap(outputMap, "ServiceAddressAssocCatalog");
  }
}
