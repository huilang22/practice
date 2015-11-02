/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ProductRateKeyDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductRateKeyDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductRateKeyObjectKeyData PRKDeleteIn;
  protected Date PRKCeaseDate;
/**
 *
 * Constructor to create a  ProductRateKeyDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductRateKeyDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductRateKeyObjectKeyData PRKDeleteInIn, Date PRKCeaseDateIn) {
    super(id, context, "ProductRateKeyDelete");
    PRKDeleteIn = PRKDeleteInIn;
    PRKCeaseDate = PRKCeaseDateIn;
  }

  public void translateToMap() {
    if (PRKDeleteIn != null) {
      PRKDeleteIn.resetFlags(true, true);
      addInput("ProductRateKey", ProductRateKeyObjectKeyHelper.toMap(PRKDeleteIn, new HashMap(), "ProductRateKeyObjectKeyData").get("ProductRateKeyObjectKeyData"));
    }
    if (PRKCeaseDate != null) {
      addInput("InactiveDate", PRKCeaseDate);
    }
  }


/**
 *
 * Sets the ProductRateKey
 * @param PRKDeleteInIn Value of the PRKDeleteIn
 *
 */

  public void setProductRateKey(ProductRateKeyObjectKeyData PRKDeleteInIn) {
    PRKDeleteIn = PRKDeleteInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param PRKCeaseDateIn Value of the PRKCeaseDate
 *
 */

  public void setInactiveDate(Date PRKCeaseDateIn) {
    PRKCeaseDate = PRKCeaseDateIn;
  }

  public void translateFromMap() {
    PRKDeleteIn = ProductRateKeyObjectKeyHelper.fromMap(inputMap, "ProductRateKey");
    PRKCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the ProductRateKey
 * @return Value of the ProductRateKey
 *
 */

  public ProductRateKeyObjectKeyData getProductRateKey( ) {
    return PRKDeleteIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return PRKCeaseDate;
  }

}
