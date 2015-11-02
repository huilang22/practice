/*
 * Generated code DO NOT EDIT
 * Generated file: ProductCatalogRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProductCatalogRequestMethod implements UdtMethod {
  private String method = null;
  private ProductCatalogRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ContractTypeFindEligible method */
  public static final ProductCatalogRequestMethod CONTRACT_TYPE_FIND_ELIGIBLE = new ProductCatalogRequestMethod("ContractTypeFindEligible");
  /** Variable representing the ExternalIdTypeFindEligible method */
  public static final ProductCatalogRequestMethod EXTERNAL_ID_TYPE_FIND_ELIGIBLE = new ProductCatalogRequestMethod("ExternalIdTypeFindEligible");
  /** Variable representing the InvsTypeFindEligible method */
  public static final ProductCatalogRequestMethod INVS_TYPE_FIND_ELIGIBLE = new ProductCatalogRequestMethod("InvsTypeFindEligible");
  /** Variable representing the NrcTransDescrFindEligible method */
  public static final ProductCatalogRequestMethod NRC_TRANS_DESCR_FIND_ELIGIBLE = new ProductCatalogRequestMethod("NrcTransDescrFindEligible");
  /** Variable representing the PackageComponentDefFindEligible method */
  public static final ProductCatalogRequestMethod PACKAGE_COMPONENT_DEF_FIND_ELIGIBLE = new ProductCatalogRequestMethod("PackageComponentDefFindEligible");
  /** Variable representing the PackageDefinitionFindEligible method */
  public static final ProductCatalogRequestMethod PACKAGE_DEFINITION_FIND_ELIGIBLE = new ProductCatalogRequestMethod("PackageDefinitionFindEligible");
  /** Variable representing the ProductElementFindEligible method */
  public static final ProductCatalogRequestMethod PRODUCT_ELEMENT_FIND_ELIGIBLE = new ProductCatalogRequestMethod("ProductElementFindEligible");
  /** Variable representing the ServicePricingPlanFindEligible method */
  public static final ProductCatalogRequestMethod SERVICE_PRICING_PLAN_FIND_ELIGIBLE = new ProductCatalogRequestMethod("ServicePricingPlanFindEligible");
}
