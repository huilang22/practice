/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstatusGetBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsJobstatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsJobstatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsJobstatusObjectKeyData InvsJobstatusGetIn;
/**
 *
 * Constructor to create a  InvsJobstatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsJobstatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobstatusObjectKeyData InvsJobstatusGetInIn) {
    super(id, context, "InvsJobstatusGet");
    InvsJobstatusGetIn = InvsJobstatusGetInIn;
  }

  public void translateToMap() {
    if (InvsJobstatusGetIn != null) {
      InvsJobstatusGetIn.resetFlags(true, true);
      addInput("InvsJobstatus", InvsJobstatusObjectKeyHelper.toMap(InvsJobstatusGetIn, new HashMap(), "InvsJobstatusObjectKeyData").get("InvsJobstatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsJobstatus
 * @param InvsJobstatusGetInIn Value of the InvsJobstatusGetIn
 *
 */

  public void setInvsJobstatus(InvsJobstatusObjectKeyData InvsJobstatusGetInIn) {
    InvsJobstatusGetIn = InvsJobstatusGetInIn;
  }

  public void translateFromMap() {
    InvsJobstatusGetIn = InvsJobstatusObjectKeyHelper.fromMap(inputMap, "InvsJobstatus");
  }

/**
 *
 * Gets the InvsJobstatus
 * @return Value of the InvsJobstatus
 *
 */

  public InvsJobstatusObjectKeyData getInvsJobstatus( ) {
    return InvsJobstatusGetIn;
  }

}
