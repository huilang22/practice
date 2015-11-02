/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdLocaleGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdLocaleGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdLocaleObjectKeyData bsdLocaleGetIn;
/**
 *
 * Constructor to create a  BsdLocaleGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdLocaleGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdLocaleObjectKeyData bsdLocaleGetInIn) {
    super(id, context, "BsdLocaleGet");
    bsdLocaleGetIn = bsdLocaleGetInIn;
  }

  public void translateToMap() {
    if (bsdLocaleGetIn != null) {
      bsdLocaleGetIn.resetFlags(true, true);
      addInput("BsdLocale", BsdLocaleObjectKeyHelper.toMap(bsdLocaleGetIn, new HashMap(), "BsdLocaleObjectKeyData").get("BsdLocaleObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdLocale
 * @param bsdLocaleGetInIn Value of the bsdLocaleGetIn
 *
 */

  public void setBsdLocale(BsdLocaleObjectKeyData bsdLocaleGetInIn) {
    bsdLocaleGetIn = bsdLocaleGetInIn;
  }

  public void translateFromMap() {
    bsdLocaleGetIn = BsdLocaleObjectKeyHelper.fromMap(inputMap, "BsdLocale");
  }

/**
 *
 * Gets the BsdLocale
 * @return Value of the BsdLocale
 *
 */

  public BsdLocaleObjectKeyData getBsdLocale( ) {
    return bsdLocaleGetIn;
  }

}
