/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationDefaultGetBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * Class used to create a BsdApplicationDefaultGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationDefaultGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationDefaultObjectKeyData bsdApplicationDefaultGetIn;
/**
 *
 * Constructor to create a  BsdApplicationDefaultGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationDefaultGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationDefaultObjectKeyData bsdApplicationDefaultGetInIn) {
    super(id, context, "BsdApplicationDefaultGet");
    bsdApplicationDefaultGetIn = bsdApplicationDefaultGetInIn;
  }

  public void translateToMap() {
    if (bsdApplicationDefaultGetIn != null) {
      bsdApplicationDefaultGetIn.resetFlags(true, true);
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectKeyHelper.toMap(bsdApplicationDefaultGetIn, new HashMap(), "BsdApplicationDefaultObjectKeyData").get("BsdApplicationDefaultObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdApplicationDefault
 * @param bsdApplicationDefaultGetInIn Value of the bsdApplicationDefaultGetIn
 *
 */

  public void setBsdApplicationDefault(BsdApplicationDefaultObjectKeyData bsdApplicationDefaultGetInIn) {
    bsdApplicationDefaultGetIn = bsdApplicationDefaultGetInIn;
  }

  public void translateFromMap() {
    bsdApplicationDefaultGetIn = BsdApplicationDefaultObjectKeyHelper.fromMap(inputMap, "BsdApplicationDefault");
  }

/**
 *
 * Gets the BsdApplicationDefault
 * @return Value of the BsdApplicationDefault
 *
 */

  public BsdApplicationDefaultObjectKeyData getBsdApplicationDefault( ) {
    return bsdApplicationDefaultGetIn;
  }

}
