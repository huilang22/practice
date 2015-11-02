/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogFindRequest.java
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
 * Class used to create a ServiceAddressAssocCatalogFindRequest Udt Request
 *
 */

public class ServiceAddressAssocCatalogFindRequest extends ServiceAddressAssocCatalogRequest {
/**
 *
 * Constructor to create a  ServiceAddressAssocCatalogFindRequest
 * @param id Unique request name
 * @param findIn ServiceAddressAssocCatalogObjFilter for ServiceAddressAssocCatalogFindRequest
 *
 */
@JsonCreator
  public ServiceAddressAssocCatalogFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceAddressAssocCatalog")ServiceAddressAssocCatalogObjFilter findIn) {
    super(id, "ServiceAddressAssocCatalogFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjHelper.toMap(findIn, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }

/**
 *
 * Retrieves the ServiceAddressAssocCatalogObjDataList that results from the ServiceAddressAssocCatalogFindRequest call
 * @return ServiceAddressAssocCatalogObjDataList resulting from udt call
 *
 */

  public ServiceAddressAssocCatalogObjDataList getOutput() {
    return ServiceAddressAssocCatalogObjHelper.fromMapList(outputMap, "ServiceAddressAssocCatalogList");
  }
}
