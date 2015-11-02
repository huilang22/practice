/*
 * Generated code DO NOT EDIT
 * Generated file: ProductElementValidateCreateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ProductElementValidateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductElementValidateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductElementObjectData ProductElementIn;
  protected Integer ServiceInternalId;
  protected Integer ServiceInternalIdResets;
/**
 *
 * Constructor to create a  ProductElementValidateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductElementValidateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductElementObjectData ProductElementInIn, Integer ServiceInternalIdIn, Integer ServiceInternalIdResetsIn) {
    super(id, context, "ProductElementValidateCreate");
    ProductElementIn = ProductElementInIn;
    ServiceInternalId = ServiceInternalIdIn;
    ServiceInternalIdResets = ServiceInternalIdResetsIn;
  }

  public void translateToMap() {
    if (ProductElementIn != null) {
      ProductElementIn.resetFlags(true, true);
      addInput("ProductElementValidate", ProductElementObjectHelper.toMap(ProductElementIn, new HashMap(), "ProductElementValidate").get("ProductElementValidate"));
    }
    if (ServiceInternalId != null) {
      addInput("ServiceInternalId", ServiceInternalId);
    }
    if (ServiceInternalIdResets != null) {
      addInput("ServiceInternalIdResets", ServiceInternalIdResets);
    }
  }


/**
 *
 * Sets the ProductElementValidate
 * @param ProductElementInIn Value of the ProductElementIn
 *
 */

  public void setProductElementValidate(ProductElementObjectData ProductElementInIn) {
    ProductElementIn = ProductElementInIn;
  }

/**
 *
 * Sets the ServiceInternalId
 * @param ServiceInternalIdIn Value of the ServiceInternalId
 *
 */

  public void setServiceInternalId(Integer ServiceInternalIdIn) {
    ServiceInternalId = ServiceInternalIdIn;
  }

/**
 *
 * Sets the ServiceInternalIdResets
 * @param ServiceInternalIdResetsIn Value of the ServiceInternalIdResets
 *
 */

  public void setServiceInternalIdResets(Integer ServiceInternalIdResetsIn) {
    ServiceInternalIdResets = ServiceInternalIdResetsIn;
  }

  public void translateFromMap() {
    ProductElementIn = ProductElementObjectHelper.fromMap(inputMap, "ProductElementValidate");
    ServiceInternalId = (Integer)inputMap.get("ServiceInternalId");
    ServiceInternalIdResets = (Integer)inputMap.get("ServiceInternalIdResets");
  }

/**
 *
 * Gets the ProductElementValidate
 * @return Value of the ProductElementValidate
 *
 */

  public ProductElementObjectData getProductElementValidate( ) {
    return ProductElementIn;
  }

/**
 *
 * Gets the ServiceInternalId
 * @return Value of the ServiceInternalId
 *
 */

  public Integer getServiceInternalId( ) {
    return ServiceInternalId;
  }

/**
 *
 * Gets the ServiceInternalIdResets
 * @return Value of the ServiceInternalIdResets
 *
 */

  public Integer getServiceInternalIdResets( ) {
    return ServiceInternalIdResets;
  }

}
