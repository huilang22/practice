/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdApplicationUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdApplicationUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdApplicationObjectData bsdApplicationUpdateIn;
/**
 *
 * Constructor to create a  BsdApplicationUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdApplicationUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationObjectData bsdApplicationUpdateInIn) {
    super(id, context, "BsdApplicationUpdate");
    bsdApplicationUpdateIn = bsdApplicationUpdateInIn;
  }

  public void translateToMap() {
    if (bsdApplicationUpdateIn != null) {
      bsdApplicationUpdateIn.resetFlags(true, true);
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(bsdApplicationUpdateIn, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }


/**
 *
 * Sets the BsdApplication
 * @param bsdApplicationUpdateInIn Value of the bsdApplicationUpdateIn
 *
 */

  public void setBsdApplication(BsdApplicationObjectData bsdApplicationUpdateInIn) {
    bsdApplicationUpdateIn = bsdApplicationUpdateInIn;
  }

  public void translateFromMap() {
    bsdApplicationUpdateIn = BsdApplicationObjectHelper.fromMap(inputMap, "BsdApplication");
  }

/**
 *
 * Gets the BsdApplication
 * @return Value of the BsdApplication
 *
 */

  public BsdApplicationObjectData getBsdApplication( ) {
    return bsdApplicationUpdateIn;
  }

}
