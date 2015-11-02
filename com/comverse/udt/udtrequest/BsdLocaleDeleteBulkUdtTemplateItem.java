/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdLocaleDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdLocaleDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdLocaleObjectKeyData bsdLocaleDeleteIn;
/**
 *
 * Constructor to create a  BsdLocaleDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdLocaleDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdLocaleObjectKeyData bsdLocaleDeleteInIn) {
    super(id, context, "BsdLocaleDelete");
    bsdLocaleDeleteIn = bsdLocaleDeleteInIn;
  }

  public void translateToMap() {
    if (bsdLocaleDeleteIn != null) {
      bsdLocaleDeleteIn.resetFlags(true, true);
      addInput("BsdLocale", BsdLocaleObjectKeyHelper.toMap(bsdLocaleDeleteIn, new HashMap(), "BsdLocaleObjectKeyData").get("BsdLocaleObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdLocale
 * @param bsdLocaleDeleteInIn Value of the bsdLocaleDeleteIn
 *
 */

  public void setBsdLocale(BsdLocaleObjectKeyData bsdLocaleDeleteInIn) {
    bsdLocaleDeleteIn = bsdLocaleDeleteInIn;
  }

  public void translateFromMap() {
    bsdLocaleDeleteIn = BsdLocaleObjectKeyHelper.fromMap(inputMap, "BsdLocale");
  }

/**
 *
 * Gets the BsdLocale
 * @return Value of the BsdLocale
 *
 */

  public BsdLocaleObjectKeyData getBsdLocale( ) {
    return bsdLocaleDeleteIn;
  }

}
