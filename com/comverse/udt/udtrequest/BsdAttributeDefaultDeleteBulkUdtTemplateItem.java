/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeDefaultDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeDefaultDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeDefaultObjectBaseKeyData bsdAttributeDefaultDeleteIn;
/**
 *
 * Constructor to create a  BsdAttributeDefaultDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeDefaultDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeDefaultObjectBaseKeyData bsdAttributeDefaultDeleteInIn) {
    super(id, context, "BsdAttributeDefaultDelete");
    bsdAttributeDefaultDeleteIn = bsdAttributeDefaultDeleteInIn;
  }

  public void translateToMap() {
    if (bsdAttributeDefaultDeleteIn != null) {
      bsdAttributeDefaultDeleteIn.resetFlags(true, true);
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseKeyHelper.toMap(bsdAttributeDefaultDeleteIn, new HashMap(), "BsdAttributeDefaultObjectBaseKeyData").get("BsdAttributeDefaultObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BsdAttributeDefault
 * @param bsdAttributeDefaultDeleteInIn Value of the bsdAttributeDefaultDeleteIn
 *
 */

  public void setBsdAttributeDefault(BsdAttributeDefaultObjectBaseKeyData bsdAttributeDefaultDeleteInIn) {
    bsdAttributeDefaultDeleteIn = bsdAttributeDefaultDeleteInIn;
  }

  public void translateFromMap() {
    bsdAttributeDefaultDeleteIn = BsdAttributeDefaultObjectBaseKeyHelper.fromMap(inputMap, "BsdAttributeDefault");
  }

/**
 *
 * Gets the BsdAttributeDefault
 * @return Value of the BsdAttributeDefault
 *
 */

  public BsdAttributeDefaultObjectBaseKeyData getBsdAttributeDefault( ) {
    return bsdAttributeDefaultDeleteIn;
  }

}
