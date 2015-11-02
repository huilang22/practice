/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductFindByServiceOrderBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ProductFindByServiceOrderBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductFindByServiceOrderBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectBaseFilter ProductFindByServiceOrderIn;
  protected String ServiceOrderId;
/**
 *
 * Constructor to create a  ProductFindByServiceOrderBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductFindByServiceOrderBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectBaseFilter ProductFindByServiceOrderInIn, String ServiceOrderIdIn) {
    super(id, context, "ProductFindByServiceOrder");
    ProductFindByServiceOrderIn = ProductFindByServiceOrderInIn;
    ServiceOrderId = ServiceOrderIdIn;
  }

  public void translateToMap() {
    if (ProductFindByServiceOrderIn != null) {
      Integer index =  ProductFindByServiceOrderIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Product", ProductObjectBaseHelper.toMap(ProductFindByServiceOrderIn, new HashMap(), "Product").get("Product"));
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }


/**
 *
 * Sets the Product
 * @param ProductFindByServiceOrderInIn Value of the ProductFindByServiceOrderIn
 *
 */

  public void setProduct(ProductObjectBaseFilter ProductFindByServiceOrderInIn) {
    ProductFindByServiceOrderIn = ProductFindByServiceOrderInIn;
  }

/**
 *
 * Sets the ServiceOrderId
 * @param ServiceOrderIdIn Value of the ServiceOrderId
 *
 */

  public void setServiceOrderId(String ServiceOrderIdIn) {
    ServiceOrderId = ServiceOrderIdIn;
  }

  public void translateFromMap() {
    ProductFindByServiceOrderIn = ProductObjectBaseHelper.fromMapFilter(inputMap, "Product");
    ServiceOrderId = (String)inputMap.get("ServiceOrderId");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectBaseFilter getProduct( ) {
    return ProductFindByServiceOrderIn;
  }

/**
 *
 * Gets the ServiceOrderId
 * @return Value of the ServiceOrderId
 *
 */

  public String getServiceOrderId( ) {
    return ServiceOrderId;
  }

}
