/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectAttributeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdObjectAttributeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdObjectAttributeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdObjectAttributeObjectBaseKeyData bsdObjectAttributeDeleteIn;
/**
 *
 * Constructor to create a  BsdObjectAttributeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdObjectAttributeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectAttributeObjectBaseKeyData bsdObjectAttributeDeleteInIn) {
    super(id, context, "BsdObjectAttributeDelete");
    bsdObjectAttributeDeleteIn = bsdObjectAttributeDeleteInIn;
  }

  public void translateToMap() {
    if (bsdObjectAttributeDeleteIn != null) {
      bsdObjectAttributeDeleteIn.resetFlags(true, true);
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectBaseKeyHelper.toMap(bsdObjectAttributeDeleteIn, new HashMap(), "BsdObjectAttributeObjectBaseKeyData").get("BsdObjectAttributeObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BsdObjectAttribute
 * @param bsdObjectAttributeDeleteInIn Value of the bsdObjectAttributeDeleteIn
 *
 */

  public void setBsdObjectAttribute(BsdObjectAttributeObjectBaseKeyData bsdObjectAttributeDeleteInIn) {
    bsdObjectAttributeDeleteIn = bsdObjectAttributeDeleteInIn;
  }

  public void translateFromMap() {
    bsdObjectAttributeDeleteIn = BsdObjectAttributeObjectBaseKeyHelper.fromMap(inputMap, "BsdObjectAttribute");
  }

/**
 *
 * Gets the BsdObjectAttribute
 * @return Value of the BsdObjectAttribute
 *
 */

  public BsdObjectAttributeObjectBaseKeyData getBsdObjectAttribute( ) {
    return bsdObjectAttributeDeleteIn;
  }

}
