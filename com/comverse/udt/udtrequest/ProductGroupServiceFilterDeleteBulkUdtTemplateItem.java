/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupServiceFilterDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ProductGroupServiceFilterDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductGroupServiceFilterDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PGSFObjectKeyData PSGFdelete_In;
/**
 *
 * Constructor to create a  ProductGroupServiceFilterDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductGroupServiceFilterDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PGSFObjectKeyData PSGFdelete_InIn) {
    super(id, context, "ProductGroupServiceFilterDelete");
    PSGFdelete_In = PSGFdelete_InIn;
  }

  public void translateToMap() {
    if (PSGFdelete_In != null) {
      PSGFdelete_In.resetFlags(true, true);
      addInput("ProductGroupServiceFilter", PGSFObjectKeyHelper.toMap(PSGFdelete_In, new HashMap(), "PGSFObjectKeyData").get("PGSFObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProductGroupServiceFilter
 * @param PSGFdelete_InIn Value of the PSGFdelete_In
 *
 */

  public void setProductGroupServiceFilter(PGSFObjectKeyData PSGFdelete_InIn) {
    PSGFdelete_In = PSGFdelete_InIn;
  }

  public void translateFromMap() {
    PSGFdelete_In = PGSFObjectKeyHelper.fromMap(inputMap, "ProductGroupServiceFilter");
  }

/**
 *
 * Gets the ProductGroupServiceFilter
 * @return Value of the ProductGroupServiceFilter
 *
 */

  public PGSFObjectKeyData getProductGroupServiceFilter( ) {
    return PSGFdelete_In;
  }

}
