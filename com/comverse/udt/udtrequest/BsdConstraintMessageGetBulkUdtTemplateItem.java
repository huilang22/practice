/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdConstraintMessageGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdConstraintMessageGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdConstraintMessageObjectBaseKeyData bsdConstraintMessageGetIn;
/**
 *
 * Constructor to create a  BsdConstraintMessageGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdConstraintMessageGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintMessageObjectBaseKeyData bsdConstraintMessageGetInIn) {
    super(id, context, "BsdConstraintMessageGet");
    bsdConstraintMessageGetIn = bsdConstraintMessageGetInIn;
  }

  public void translateToMap() {
    if (bsdConstraintMessageGetIn != null) {
      bsdConstraintMessageGetIn.resetFlags(true, true);
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseKeyHelper.toMap(bsdConstraintMessageGetIn, new HashMap(), "BsdConstraintMessageObjectBaseKeyData").get("BsdConstraintMessageObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the BsdConstraintMessage
 * @param bsdConstraintMessageGetInIn Value of the bsdConstraintMessageGetIn
 *
 */

  public void setBsdConstraintMessage(BsdConstraintMessageObjectBaseKeyData bsdConstraintMessageGetInIn) {
    bsdConstraintMessageGetIn = bsdConstraintMessageGetInIn;
  }

  public void translateFromMap() {
    bsdConstraintMessageGetIn = BsdConstraintMessageObjectBaseKeyHelper.fromMap(inputMap, "BsdConstraintMessage");
  }

/**
 *
 * Gets the BsdConstraintMessage
 * @return Value of the BsdConstraintMessage
 *
 */

  public BsdConstraintMessageObjectBaseKeyData getBsdConstraintMessage( ) {
    return bsdConstraintMessageGetIn;
  }

}
