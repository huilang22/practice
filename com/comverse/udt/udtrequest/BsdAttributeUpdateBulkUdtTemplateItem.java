/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeObjectData bsdAttributeUpdateIn;
/**
 *
 * Constructor to create a  BsdAttributeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeObjectData bsdAttributeUpdateInIn) {
    super(id, context, "BsdAttributeUpdate");
    bsdAttributeUpdateIn = bsdAttributeUpdateInIn;
  }

  public void translateToMap() {
    if (bsdAttributeUpdateIn != null) {
      bsdAttributeUpdateIn.resetFlags(true, true);
      addInput("BsdAttribute", BsdAttributeObjectHelper.toMap(bsdAttributeUpdateIn, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }


/**
 *
 * Sets the BsdAttribute
 * @param bsdAttributeUpdateInIn Value of the bsdAttributeUpdateIn
 *
 */

  public void setBsdAttribute(BsdAttributeObjectData bsdAttributeUpdateInIn) {
    bsdAttributeUpdateIn = bsdAttributeUpdateInIn;
  }

  public void translateFromMap() {
    bsdAttributeUpdateIn = BsdAttributeObjectHelper.fromMap(inputMap, "BsdAttribute");
  }

/**
 *
 * Gets the BsdAttribute
 * @return Value of the BsdAttribute
 *
 */

  public BsdAttributeObjectData getBsdAttribute( ) {
    return bsdAttributeUpdateIn;
  }

}
