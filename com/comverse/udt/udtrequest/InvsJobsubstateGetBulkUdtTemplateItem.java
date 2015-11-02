/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobsubstateGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsJobsubstateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsJobsubstateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsJobsubstateObjectKeyData InvsJobsubstateGetIn;
/**
 *
 * Constructor to create a  InvsJobsubstateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsJobsubstateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobsubstateObjectKeyData InvsJobsubstateGetInIn) {
    super(id, context, "InvsJobsubstateGet");
    InvsJobsubstateGetIn = InvsJobsubstateGetInIn;
  }

  public void translateToMap() {
    if (InvsJobsubstateGetIn != null) {
      InvsJobsubstateGetIn.resetFlags(true, true);
      addInput("InvsJobsubstate", InvsJobsubstateObjectKeyHelper.toMap(InvsJobsubstateGetIn, new HashMap(), "InvsJobsubstateObjectKeyData").get("InvsJobsubstateObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsJobsubstate
 * @param InvsJobsubstateGetInIn Value of the InvsJobsubstateGetIn
 *
 */

  public void setInvsJobsubstate(InvsJobsubstateObjectKeyData InvsJobsubstateGetInIn) {
    InvsJobsubstateGetIn = InvsJobsubstateGetInIn;
  }

  public void translateFromMap() {
    InvsJobsubstateGetIn = InvsJobsubstateObjectKeyHelper.fromMap(inputMap, "InvsJobsubstate");
  }

/**
 *
 * Gets the InvsJobsubstate
 * @return Value of the InvsJobsubstate
 *
 */

  public InvsJobsubstateObjectKeyData getInvsJobsubstate( ) {
    return InvsJobsubstateGetIn;
  }

}
