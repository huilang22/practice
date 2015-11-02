/*
 * Generated code DO NOT EDIT
 * Generated file: ProductPackageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProductPackageRequestMethod implements UdtMethod {
  private String method = null;
  private ProductPackageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ProductPackageActivate method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_ACTIVATE = new ProductPackageRequestMethod("ProductPackageActivate");
  /** Variable representing the ProductPackageActiveComponentCount method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_ACTIVE_COMPONENT_COUNT = new ProductPackageRequestMethod("ProductPackageActiveComponentCount");
  /** Variable representing the ProductPackageCancel method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_CANCEL = new ProductPackageRequestMethod("ProductPackageCancel");
  /** Variable representing the ProductPackageCreate method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_CREATE = new ProductPackageRequestMethod("ProductPackageCreate");
  /** Variable representing the ProductPackageDelete method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_DELETE = new ProductPackageRequestMethod("ProductPackageDelete");
  /** Variable representing the ProductPackageDeleteList method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_DELETE_LIST = new ProductPackageRequestMethod("ProductPackageDeleteList");
  /** Variable representing the ProductPackageDisconnectValidate method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_DISCONNECT_VALIDATE = new ProductPackageRequestMethod("ProductPackageDisconnectValidate");
  /** Variable representing the ProductPackageFind method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_FIND = new ProductPackageRequestMethod("ProductPackageFind");
  /** Variable representing the ProductPackageFindPendingByComponent method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_FIND_PENDING_BY_COMPONENT = new ProductPackageRequestMethod("ProductPackageFindPendingByComponent");
  /** Variable representing the ProductPackageFindPendingByPackage method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_FIND_PENDING_BY_PACKAGE = new ProductPackageRequestMethod("ProductPackageFindPendingByPackage");
  /** Variable representing the ProductPackageGet method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_GET = new ProductPackageRequestMethod("ProductPackageGet");
  /** Variable representing the ProductPackageOverridesFind method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_OVERRIDES_FIND = new ProductPackageRequestMethod("ProductPackageOverridesFind");
  /** Variable representing the ProductPackageOwnerFind method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_OWNER_FIND = new ProductPackageRequestMethod("ProductPackageOwnerFind");
  /** Variable representing the ProductPackageUpdate method */
  public static final ProductPackageRequestMethod PRODUCT_PACKAGE_UPDATE = new ProductPackageRequestMethod("ProductPackageUpdate");
}
