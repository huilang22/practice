/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdObjectDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdObjectDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdObjectObjectKeyData bsdObjectDeleteIn;
/**
 *
 * Constructor to create a  BsdObjectDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdObjectDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectObjectKeyData bsdObjectDeleteInIn) {
    super(id, context, "BsdObjectDelete");
    bsdObjectDeleteIn = bsdObjectDeleteInIn;
  }

  public void translateToMap() {
    if (bsdObjectDeleteIn != null) {
      bsdObjectDeleteIn.resetFlags(true, true);
      addInput("BsdObject", BsdObjectObjectKeyHelper.toMap(bsdObjectDeleteIn, new HashMap(), "BsdObjectObjectKeyData").get("BsdObjectObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdObject
 * @param bsdObjectDeleteInIn Value of the bsdObjectDeleteIn
 *
 */

  public void setBsdObject(BsdObjectObjectKeyData bsdObjectDeleteInIn) {
    bsdObjectDeleteIn = bsdObjectDeleteInIn;
  }

  public void translateFromMap() {
    bsdObjectDeleteIn = BsdObjectObjectKeyHelper.fromMap(inputMap, "BsdObject");
  }

/**
 *
 * Gets the BsdObject
 * @return Value of the BsdObject
 *
 */

  public BsdObjectObjectKeyData getBsdObject( ) {
    return bsdObjectDeleteIn;
  }

}
