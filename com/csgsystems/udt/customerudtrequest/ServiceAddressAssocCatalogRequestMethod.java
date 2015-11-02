/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressAssocCatalogRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceAddressAssocCatalogRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceAddressAssocCatalogRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceAddressAssocCatalogCreate method */
  public static final ServiceAddressAssocCatalogRequestMethod SERVICE_ADDRESS_ASSOC_CATALOG_CREATE = new ServiceAddressAssocCatalogRequestMethod("ServiceAddressAssocCatalogCreate");
  /** Variable representing the ServiceAddressAssocCatalogExternalFind method */
  public static final ServiceAddressAssocCatalogRequestMethod SERVICE_ADDRESS_ASSOC_CATALOG_EXTERNAL_FIND = new ServiceAddressAssocCatalogRequestMethod("ServiceAddressAssocCatalogExternalFind");
  /** Variable representing the ServiceAddressAssocCatalogFind method */
  public static final ServiceAddressAssocCatalogRequestMethod SERVICE_ADDRESS_ASSOC_CATALOG_FIND = new ServiceAddressAssocCatalogRequestMethod("ServiceAddressAssocCatalogFind");
  /** Variable representing the ServiceAddressAssocCatalogGet method */
  public static final ServiceAddressAssocCatalogRequestMethod SERVICE_ADDRESS_ASSOC_CATALOG_GET = new ServiceAddressAssocCatalogRequestMethod("ServiceAddressAssocCatalogGet");
  /** Variable representing the ServiceAddressAssocCatalogUpdate method */
  public static final ServiceAddressAssocCatalogRequestMethod SERVICE_ADDRESS_ASSOC_CATALOG_UPDATE = new ServiceAddressAssocCatalogRequestMethod("ServiceAddressAssocCatalogUpdate");
}
