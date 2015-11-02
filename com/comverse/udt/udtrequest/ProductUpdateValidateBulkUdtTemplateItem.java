/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductUpdateValidateBulkUdtTemplateItem.java
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
 * Class used to create a ProductUpdateValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductUpdateValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectData ProdUpdValidateIn;
  protected Date EffectiveDt;
/**
 *
 * Constructor to create a  ProductUpdateValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductUpdateValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectData ProdUpdValidateInIn, Date EffectiveDtIn) {
    super(id, context, "ProductUpdateValidate");
    ProdUpdValidateIn = ProdUpdValidateInIn;
    EffectiveDt = EffectiveDtIn;
  }

  public void translateToMap() {
    if (ProdUpdValidateIn != null) {
      ProdUpdValidateIn.resetFlags(true, true);
      addInput("Product", ProductObjectHelper.toMap(ProdUpdValidateIn, new HashMap(), "Void").get("Void"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
  }


/**
 *
 * Sets the Product
 * @param ProdUpdValidateInIn Value of the ProdUpdValidateIn
 *
 */

  public void setProduct(ProductObjectData ProdUpdValidateInIn) {
    ProdUpdValidateIn = ProdUpdValidateInIn;
  }

/**
 *
 * Sets the EffectiveDt
 * @param EffectiveDtIn Value of the EffectiveDt
 *
 */

  public void setEffectiveDt(Date EffectiveDtIn) {
    EffectiveDt = EffectiveDtIn;
  }

  public void translateFromMap() {
    ProdUpdValidateIn = ProductObjectHelper.fromMap(inputMap, "Product");
    EffectiveDt = (Date)inputMap.get("EffectiveDt");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectData getProduct( ) {
    return ProdUpdValidateIn;
  }

/**
 *
 * Gets the EffectiveDt
 * @return Value of the EffectiveDt
 *
 */

  public Date getEffectiveDt( ) {
    return EffectiveDt;
  }

}
