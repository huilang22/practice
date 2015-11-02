/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogExternalFindRequest.java
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
 * Class used to create a ServiceAddressAssocCatalogExternalFindRequest Udt Request
 *
 */

public class ServiceAddressAssocCatalogExternalFindRequest extends ServiceAddressAssocCatalogRequest {
/**
 *
 * Constructor to create a  ServiceAddressAssocCatalogExternalFindRequest
 * @param id Unique request name
 * @param SAACExFindIn ServiceAddressAssocCatalogObjectFilter for ServiceAddressAssocCatalogExternalFindRequest
 *
 */
@JsonCreator
  public ServiceAddressAssocCatalogExternalFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceAddressAssocCatalog")ServiceAddressAssocCatalogObjectFilter SAACExFindIn) {
    super(id, "ServiceAddressAssocCatalogExternalFind");
    if (SAACExFindIn != null) {
      Integer index =  SAACExFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjectHelper.toMap(SAACExFindIn, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }

/**
 *
 * Retrieves the ServiceAddressAssocCatalogObjectDataList that results from the ServiceAddressAssocCatalogExternalFindRequest call
 * @return ServiceAddressAssocCatalogObjectDataList resulting from udt call
 *
 */

  public ServiceAddressAssocCatalogObjectDataList getOutput() {
    return ServiceAddressAssocCatalogObjectHelper.fromMapList(outputMap, "ServiceAddressAssocCatalogList");
  }
}
