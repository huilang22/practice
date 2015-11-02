/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMncGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsMncGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsMncGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsMncObjectKeyData InvsMncGetIn;
/**
 *
 * Constructor to create a  InvsMncGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsMncGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsMncObjectKeyData InvsMncGetInIn) {
    super(id, context, "InvsMncGet");
    InvsMncGetIn = InvsMncGetInIn;
  }

  public void translateToMap() {
    if (InvsMncGetIn != null) {
      InvsMncGetIn.resetFlags(true, true);
      addInput("InvsMnc", InvsMncObjectKeyHelper.toMap(InvsMncGetIn, new HashMap(), "InvsMncObjectKeyData").get("InvsMncObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsMnc
 * @param InvsMncGetInIn Value of the InvsMncGetIn
 *
 */

  public void setInvsMnc(InvsMncObjectKeyData InvsMncGetInIn) {
    InvsMncGetIn = InvsMncGetInIn;
  }

  public void translateFromMap() {
    InvsMncGetIn = InvsMncObjectKeyHelper.fromMap(inputMap, "InvsMnc");
  }

/**
 *
 * Gets the InvsMnc
 * @return Value of the InvsMnc
 *
 */

  public InvsMncObjectKeyData getInvsMnc( ) {
    return InvsMncGetIn;
  }

}
