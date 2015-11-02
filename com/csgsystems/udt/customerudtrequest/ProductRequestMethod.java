/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProductRequestMethod implements UdtMethod {
  private String method = null;
  private ProductRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CurrencyDerive method */
  public static final ProductRequestMethod CURRENCY_DERIVE = new ProductRequestMethod("CurrencyDerive");
  /** Variable representing the ProductAlternateGet method */
  public static final ProductRequestMethod PRODUCT_ALTERNATE_GET = new ProductRequestMethod("ProductAlternateGet");
  /** Variable representing the ProductBillToReevaluate method */
  public static final ProductRequestMethod PRODUCT_BILL_TO_REEVALUATE = new ProductRequestMethod("ProductBillToReevaluate");
  /** Variable representing the ProductCreate method */
  public static final ProductRequestMethod PRODUCT_CREATE = new ProductRequestMethod("ProductCreate");
  /** Variable representing the ProductDisconnectValidate method */
  public static final ProductRequestMethod PRODUCT_DISCONNECT_VALIDATE = new ProductRequestMethod("ProductDisconnectValidate");
  /** Variable representing the ProductExtendedDataFind method */
  public static final ProductRequestMethod PRODUCT_EXTENDED_DATA_FIND = new ProductRequestMethod("ProductExtendedDataFind");
  /** Variable representing the ProductExternalFind method */
  public static final ProductRequestMethod PRODUCT_EXTERNAL_FIND = new ProductRequestMethod("ProductExternalFind");
  /** Variable representing the ProductFind method */
  public static final ProductRequestMethod PRODUCT_FIND = new ProductRequestMethod("ProductFind");
  /** Variable representing the ProductFindByServiceOrder method */
  public static final ProductRequestMethod PRODUCT_FIND_BY_SERVICE_ORDER = new ProductRequestMethod("ProductFindByServiceOrder");
  /** Variable representing the ProductFindWithExtendedData method */
  public static final ProductRequestMethod PRODUCT_FIND_WITH_EXTENDED_DATA = new ProductRequestMethod("ProductFindWithExtendedData");
  /** Variable representing the ProductGet method */
  public static final ProductRequestMethod PRODUCT_GET = new ProductRequestMethod("ProductGet");
  /** Variable representing the ProductUpdate method */
  public static final ProductRequestMethod PRODUCT_UPDATE = new ProductRequestMethod("ProductUpdate");
  /** Variable representing the ProductUpdateValidate method */
  public static final ProductRequestMethod PRODUCT_UPDATE_VALIDATE = new ProductRequestMethod("ProductUpdateValidate");
}
