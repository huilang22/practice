/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ProductElementUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductElementUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductElementObjectData peUpdIn;
/**
 *
 * Constructor to create a  ProductElementUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductElementUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductElementObjectData peUpdInIn) {
    super(id, context, "ProductElementUpdate");
    peUpdIn = peUpdInIn;
  }

  public void translateToMap() {
    if (peUpdIn != null) {
      peUpdIn.resetFlags(true, true);
      addInput("ProductElement", ProductElementObjectHelper.toMap(peUpdIn, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }


/**
 *
 * Sets the ProductElement
 * @param peUpdInIn Value of the peUpdIn
 *
 */

  public void setProductElement(ProductElementObjectData peUpdInIn) {
    peUpdIn = peUpdInIn;
  }

  public void translateFromMap() {
    peUpdIn = ProductElementObjectHelper.fromMap(inputMap, "ProductElement");
  }

/**
 *
 * Gets the ProductElement
 * @return Value of the ProductElement
 *
 */

  public ProductElementObjectData getProductElement( ) {
    return peUpdIn;
  }

}
