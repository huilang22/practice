/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationDefaultCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationDefaultCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationDefaultCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationDefaultObjectData bsdApplicationDefaultCreateIn;
/**
 *
 * Constructor to create a  BsdApplicationDefaultCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationDefaultCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationDefaultObjectData bsdApplicationDefaultCreateInIn) {
    super(id, context, "BsdApplicationDefaultCreate");
    bsdApplicationDefaultCreateIn = bsdApplicationDefaultCreateInIn;
  }

  public void translateToMap() {
    if (bsdApplicationDefaultCreateIn != null) {
      bsdApplicationDefaultCreateIn.resetFlags(true, true);
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectHelper.toMap(bsdApplicationDefaultCreateIn, new HashMap(), "BsdApplicationDefault").get("BsdApplicationDefault"));
    }
  }


/**
 *
 * Sets the BsdApplicationDefault
 * @param bsdApplicationDefaultCreateInIn Value of the bsdApplicationDefaultCreateIn
 *
 */

  public void setBsdApplicationDefault(BsdApplicationDefaultObjectData bsdApplicationDefaultCreateInIn) {
    bsdApplicationDefaultCreateIn = bsdApplicationDefaultCreateInIn;
  }

  public void translateFromMap() {
    bsdApplicationDefaultCreateIn = BsdApplicationDefaultObjectHelper.fromMap(inputMap, "BsdApplicationDefault");
  }

/**
 *
 * Gets the BsdApplicationDefault
 * @return Value of the BsdApplicationDefault
 *
 */

  public BsdApplicationDefaultObjectData getBsdApplicationDefault( ) {
    return bsdApplicationDefaultCreateIn;
  }

}
