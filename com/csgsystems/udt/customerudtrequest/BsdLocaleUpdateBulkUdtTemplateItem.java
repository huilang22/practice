/*
 * Generated code DO NOT EDIT
 * Generated file: BsdLocaleUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a BsdLocaleUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdLocaleUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdLocaleObjectData bsdLocaleUpdateIn;
/**
 *
 * Constructor to create a  BsdLocaleUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdLocaleUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdLocaleObjectData bsdLocaleUpdateInIn) {
    super(id, context, "BsdLocaleUpdate");
    bsdLocaleUpdateIn = bsdLocaleUpdateInIn;
  }

  public void translateToMap() {
    if (bsdLocaleUpdateIn != null) {
      bsdLocaleUpdateIn.resetFlags(true, true);
      addInput("BsdLocale", BsdLocaleObjectHelper.toMap(bsdLocaleUpdateIn, new HashMap(), "BsdLocale").get("BsdLocale"));
    }
  }


/**
 *
 * Sets the BsdLocale
 * @param bsdLocaleUpdateInIn Value of the bsdLocaleUpdateIn
 *
 */

  public void setBsdLocale(BsdLocaleObjectData bsdLocaleUpdateInIn) {
    bsdLocaleUpdateIn = bsdLocaleUpdateInIn;
  }

  public void translateFromMap() {
    bsdLocaleUpdateIn = BsdLocaleObjectHelper.fromMap(inputMap, "BsdLocale");
  }

/**
 *
 * Gets the BsdLocale
 * @return Value of the BsdLocale
 *
 */

  public BsdLocaleObjectData getBsdLocale( ) {
    return bsdLocaleUpdateIn;
  }

}
