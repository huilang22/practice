/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdLocaleFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdLocaleFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdLocaleObjectFilter bsdLocaleFindIn;
/**
 *
 * Constructor to create a  BsdLocaleFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdLocaleFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdLocaleObjectFilter bsdLocaleFindInIn) {
    super(id, context, "BsdLocaleFind");
    bsdLocaleFindIn = bsdLocaleFindInIn;
  }

  public void translateToMap() {
    if (bsdLocaleFindIn != null) {
      Integer index =  bsdLocaleFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(bsdLocaleFindIn, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }


/**
 *
 * Sets the BsdLocale
 * @param bsdLocaleFindInIn Value of the bsdLocaleFindIn
 *
 */

  public void setBsdLocale(BsdLocaleObjectFilter bsdLocaleFindInIn) {
    bsdLocaleFindIn = bsdLocaleFindInIn;
  }

  public void translateFromMap() {
    bsdLocaleFindIn = BsdLocaleObjectHelper.fromMapFilter(inputMap, "BsdLocale");
  }

/**
 *
 * Gets the BsdLocale
 * @return Value of the BsdLocale
 *
 */

  public BsdLocaleObjectFilter getBsdLocale( ) {
    return bsdLocaleFindIn;
  }

}
