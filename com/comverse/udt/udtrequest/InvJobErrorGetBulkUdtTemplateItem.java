/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobErrorGetBulkUdtTemplateItem.java
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
 * Class used to create a InvJobErrorGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvJobErrorGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvJobErrorObjectKeyData InvJobErrorGetIn;
/**
 *
 * Constructor to create a  InvJobErrorGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvJobErrorGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobErrorObjectKeyData InvJobErrorGetInIn) {
    super(id, context, "InvJobErrorGet");
    InvJobErrorGetIn = InvJobErrorGetInIn;
  }

  public void translateToMap() {
    if (InvJobErrorGetIn != null) {
      InvJobErrorGetIn.resetFlags(true, true);
      addInput("InvJobError", InvJobErrorObjectKeyHelper.toMap(InvJobErrorGetIn, new HashMap(), "InvJobErrorObjectKeyData").get("InvJobErrorObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvJobError
 * @param InvJobErrorGetInIn Value of the InvJobErrorGetIn
 *
 */

  public void setInvJobError(InvJobErrorObjectKeyData InvJobErrorGetInIn) {
    InvJobErrorGetIn = InvJobErrorGetInIn;
  }

  public void translateFromMap() {
    InvJobErrorGetIn = InvJobErrorObjectKeyHelper.fromMap(inputMap, "InvJobError");
  }

/**
 *
 * Gets the InvJobError
 * @return Value of the InvJobError
 *
 */

  public InvJobErrorObjectKeyData getInvJobError( ) {
    return InvJobErrorGetIn;
  }

}
