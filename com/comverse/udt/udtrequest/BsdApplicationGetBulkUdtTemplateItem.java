/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationObjectKeyData bsdApplicationGetIn;
/**
 *
 * Constructor to create a  BsdApplicationGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationObjectKeyData bsdApplicationGetInIn) {
    super(id, context, "BsdApplicationGet");
    bsdApplicationGetIn = bsdApplicationGetInIn;
  }

  public void translateToMap() {
    if (bsdApplicationGetIn != null) {
      bsdApplicationGetIn.resetFlags(true, true);
      addInput("BsdApplication", BsdApplicationObjectKeyHelper.toMap(bsdApplicationGetIn, new HashMap(), "BsdApplicationObjectKeyData").get("BsdApplicationObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdApplication
 * @param bsdApplicationGetInIn Value of the bsdApplicationGetIn
 *
 */

  public void setBsdApplication(BsdApplicationObjectKeyData bsdApplicationGetInIn) {
    bsdApplicationGetIn = bsdApplicationGetInIn;
  }

  public void translateFromMap() {
    bsdApplicationGetIn = BsdApplicationObjectKeyHelper.fromMap(inputMap, "BsdApplication");
  }

/**
 *
 * Gets the BsdApplication
 * @return Value of the BsdApplication
 *
 */

  public BsdApplicationObjectKeyData getBsdApplication( ) {
    return bsdApplicationGetIn;
  }

}
