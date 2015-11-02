/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductJurisdictionFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ProductJurisdictionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductJurisdictionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductJurisdictionObjectFilter ProductJurisdictionFindIn;
/**
 *
 * Constructor to create a  ProductJurisdictionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductJurisdictionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductJurisdictionObjectFilter ProductJurisdictionFindInIn) {
    super(id, context, "ProductJurisdictionFind");
    ProductJurisdictionFindIn = ProductJurisdictionFindInIn;
  }

  public void translateToMap() {
    if (ProductJurisdictionFindIn != null) {
      Integer index =  ProductJurisdictionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductJurisdiction", ProductJurisdictionObjectHelper.toMap(ProductJurisdictionFindIn, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
  }


/**
 *
 * Sets the ProductJurisdiction
 * @param ProductJurisdictionFindInIn Value of the ProductJurisdictionFindIn
 *
 */

  public void setProductJurisdiction(ProductJurisdictionObjectFilter ProductJurisdictionFindInIn) {
    ProductJurisdictionFindIn = ProductJurisdictionFindInIn;
  }

  public void translateFromMap() {
    ProductJurisdictionFindIn = ProductJurisdictionObjectHelper.fromMapFilter(inputMap, "ProductJurisdiction");
  }

/**
 *
 * Gets the ProductJurisdiction
 * @return Value of the ProductJurisdiction
 *
 */

  public ProductJurisdictionObjectFilter getProductJurisdiction( ) {
    return ProductJurisdictionFindIn;
  }

}
