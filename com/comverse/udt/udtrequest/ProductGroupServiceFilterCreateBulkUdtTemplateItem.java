/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupServiceFilterCreateBulkUdtTemplateItem.java
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
 * Class used to create a ProductGroupServiceFilterCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductGroupServiceFilterCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PGSFObjectData PSGFcreate_In;
/**
 *
 * Constructor to create a  ProductGroupServiceFilterCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductGroupServiceFilterCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PGSFObjectData PSGFcreate_InIn) {
    super(id, context, "ProductGroupServiceFilterCreate");
    PSGFcreate_In = PSGFcreate_InIn;
  }

  public void translateToMap() {
    if (PSGFcreate_In != null) {
      PSGFcreate_In.resetFlags(true, true);
      addInput("ProductGroupServiceFilter", PGSFObjectHelper.toMap(PSGFcreate_In, new HashMap(), "ProductGroupServiceFilter").get("ProductGroupServiceFilter"));
    }
  }


/**
 *
 * Sets the ProductGroupServiceFilter
 * @param PSGFcreate_InIn Value of the PSGFcreate_In
 *
 */

  public void setProductGroupServiceFilter(PGSFObjectData PSGFcreate_InIn) {
    PSGFcreate_In = PSGFcreate_InIn;
  }

  public void translateFromMap() {
    PSGFcreate_In = PGSFObjectHelper.fromMap(inputMap, "ProductGroupServiceFilter");
  }

/**
 *
 * Gets the ProductGroupServiceFilter
 * @return Value of the ProductGroupServiceFilter
 *
 */

  public PGSFObjectData getProductGroupServiceFilter( ) {
    return PSGFcreate_In;
  }

}
