/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdAttributeDefaultGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdAttributeDefaultGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdAttributeDefaultObjectBaseKeyData bsdAttributeDefaultGetIn;
/**
 *
 * Constructor to create a  BsdAttributeDefaultGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdAttributeDefaultGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeDefaultObjectBaseKeyData bsdAttributeDefaultGetInIn) {
    super(id, context, "BsdAttributeDefaultGet");
    bsdAttributeDefaultGetIn = bsdAttributeDefaultGetInIn;
  }

  public void translateToMap() {
    if (bsdAttributeDefaultGetIn != null) {
      bsdAttributeDefaultGetIn.resetFlags(true, true);
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseKeyHelper.toMap(bsdAttributeDefaultGetIn, new HashMap(), "BsdAttributeDefaultObjectBaseKeyData").get("BsdAttributeDefaultObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BsdAttributeDefault
 * @param bsdAttributeDefaultGetInIn Value of the bsdAttributeDefaultGetIn
 *
 */

  public void setBsdAttributeDefault(BsdAttributeDefaultObjectBaseKeyData bsdAttributeDefaultGetInIn) {
    bsdAttributeDefaultGetIn = bsdAttributeDefaultGetInIn;
  }

  public void translateFromMap() {
    bsdAttributeDefaultGetIn = BsdAttributeDefaultObjectBaseKeyHelper.fromMap(inputMap, "BsdAttributeDefault");
  }

/**
 *
 * Gets the BsdAttributeDefault
 * @return Value of the BsdAttributeDefault
 *
 */

  public BsdAttributeDefaultObjectBaseKeyData getBsdAttributeDefault( ) {
    return bsdAttributeDefaultGetIn;
  }

}
