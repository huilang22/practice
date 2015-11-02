/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServiceAddressAssocCatalog related UdtSubRequestParents
 *
 */
public abstract class ServiceAddressAssocCatalogSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServiceAddressAssocCatalogRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceAddressAssocCatalogRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServiceAddressAssocCatalogSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServiceAddressAssocCatalogSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServiceAddressAssocCatalogSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServiceAddressAssocCatalogSubRequestParent(String id, String method) {
    super(id, "ServiceAddressAssocCatalog", method);
  }
}
