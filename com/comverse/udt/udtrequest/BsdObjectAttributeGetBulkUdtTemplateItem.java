/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectAttributeGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdObjectAttributeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdObjectAttributeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdObjectAttributeObjectBaseKeyData bsdObjectAttributeGetIn;
/**
 *
 * Constructor to create a  BsdObjectAttributeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdObjectAttributeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectAttributeObjectBaseKeyData bsdObjectAttributeGetInIn) {
    super(id, context, "BsdObjectAttributeGet");
    bsdObjectAttributeGetIn = bsdObjectAttributeGetInIn;
  }

  public void translateToMap() {
    if (bsdObjectAttributeGetIn != null) {
      bsdObjectAttributeGetIn.resetFlags(true, true);
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectBaseKeyHelper.toMap(bsdObjectAttributeGetIn, new HashMap(), "BsdObjectAttributeObjectBaseKeyData").get("BsdObjectAttributeObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BsdObjectAttribute
 * @param bsdObjectAttributeGetInIn Value of the bsdObjectAttributeGetIn
 *
 */

  public void setBsdObjectAttribute(BsdObjectAttributeObjectBaseKeyData bsdObjectAttributeGetInIn) {
    bsdObjectAttributeGetIn = bsdObjectAttributeGetInIn;
  }

  public void translateFromMap() {
    bsdObjectAttributeGetIn = BsdObjectAttributeObjectBaseKeyHelper.fromMap(inputMap, "BsdObjectAttribute");
  }

/**
 *
 * Gets the BsdObjectAttribute
 * @return Value of the BsdObjectAttribute
 *
 */

  public BsdObjectAttributeObjectBaseKeyData getBsdObjectAttribute( ) {
    return bsdObjectAttributeGetIn;
  }

}
