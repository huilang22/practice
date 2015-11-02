/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstateGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsJobstateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsJobstateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsJobstateObjectKeyData InvsJobstateGetIn;
/**
 *
 * Constructor to create a  InvsJobstateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsJobstateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobstateObjectKeyData InvsJobstateGetInIn) {
    super(id, context, "InvsJobstateGet");
    InvsJobstateGetIn = InvsJobstateGetInIn;
  }

  public void translateToMap() {
    if (InvsJobstateGetIn != null) {
      InvsJobstateGetIn.resetFlags(true, true);
      addInput("InvsJobstate", InvsJobstateObjectKeyHelper.toMap(InvsJobstateGetIn, new HashMap(), "InvsJobstateObjectKeyData").get("InvsJobstateObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsJobstate
 * @param InvsJobstateGetInIn Value of the InvsJobstateGetIn
 *
 */

  public void setInvsJobstate(InvsJobstateObjectKeyData InvsJobstateGetInIn) {
    InvsJobstateGetIn = InvsJobstateGetInIn;
  }

  public void translateFromMap() {
    InvsJobstateGetIn = InvsJobstateObjectKeyHelper.fromMap(inputMap, "InvsJobstate");
  }

/**
 *
 * Gets the InvsJobstate
 * @return Value of the InvsJobstate
 *
 */

  public InvsJobstateObjectKeyData getInvsJobstate( ) {
    return InvsJobstateGetIn;
  }

}
