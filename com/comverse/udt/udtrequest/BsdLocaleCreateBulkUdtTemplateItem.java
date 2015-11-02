/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdLocaleCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdLocaleCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdLocaleObjectData bsdLocaleCreateIn;
/**
 *
 * Constructor to create a  BsdLocaleCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdLocaleCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdLocaleObjectData bsdLocaleCreateInIn) {
    super(id, context, "BsdLocaleCreate");
    bsdLocaleCreateIn = bsdLocaleCreateInIn;
  }

  public void translateToMap() {
    if (bsdLocaleCreateIn != null) {
      bsdLocaleCreateIn.resetFlags(true, true);
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(bsdLocaleCreateIn, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }


/**
 *
 * Sets the BsdLocale
 * @param bsdLocaleCreateInIn Value of the bsdLocaleCreateIn
 *
 */

  public void setBsdLocale(BsdLocaleObjectData bsdLocaleCreateInIn) {
    bsdLocaleCreateIn = bsdLocaleCreateInIn;
  }

  public void translateFromMap() {
    bsdLocaleCreateIn = BsdLocaleObjectHelper.fromMap(inputMap, "BsdLocale");
  }

/**
 *
 * Gets the BsdLocale
 * @return Value of the BsdLocale
 *
 */

  public BsdLocaleObjectData getBsdLocale( ) {
    return bsdLocaleCreateIn;
  }

}
