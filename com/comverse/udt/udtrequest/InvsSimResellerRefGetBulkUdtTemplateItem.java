/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerRefGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimResellerRefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimResellerRefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimResellerRefObjectKeyData InvsSimResellerRefGetIn;
/**
 *
 * Constructor to create a  InvsSimResellerRefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimResellerRefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimResellerRefObjectKeyData InvsSimResellerRefGetInIn) {
    super(id, context, "InvsSimResellerRefGet");
    InvsSimResellerRefGetIn = InvsSimResellerRefGetInIn;
  }

  public void translateToMap() {
    if (InvsSimResellerRefGetIn != null) {
      InvsSimResellerRefGetIn.resetFlags(true, true);
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectKeyHelper.toMap(InvsSimResellerRefGetIn, new HashMap(), "InvsSimResellerRefObjectKeyData").get("InvsSimResellerRefObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsSimResellerRef
 * @param InvsSimResellerRefGetInIn Value of the InvsSimResellerRefGetIn
 *
 */

  public void setInvsSimResellerRef(InvsSimResellerRefObjectKeyData InvsSimResellerRefGetInIn) {
    InvsSimResellerRefGetIn = InvsSimResellerRefGetInIn;
  }

  public void translateFromMap() {
    InvsSimResellerRefGetIn = InvsSimResellerRefObjectKeyHelper.fromMap(inputMap, "InvsSimResellerRef");
  }

/**
 *
 * Gets the InvsSimResellerRef
 * @return Value of the InvsSimResellerRef
 *
 */

  public InvsSimResellerRefObjectKeyData getInvsSimResellerRef( ) {
    return InvsSimResellerRefGetIn;
  }

}
