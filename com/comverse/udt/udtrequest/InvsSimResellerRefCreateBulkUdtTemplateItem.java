/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerRefCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimResellerRefCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimResellerRefCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimResellerRefObjectData InvsSimResellerRefCreateIn;
/**
 *
 * Constructor to create a  InvsSimResellerRefCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimResellerRefCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimResellerRefObjectData InvsSimResellerRefCreateInIn) {
    super(id, context, "InvsSimResellerRefCreate");
    InvsSimResellerRefCreateIn = InvsSimResellerRefCreateInIn;
  }

  public void translateToMap() {
    if (InvsSimResellerRefCreateIn != null) {
      InvsSimResellerRefCreateIn.resetFlags(true, true);
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectHelper.toMap(InvsSimResellerRefCreateIn, new HashMap(), "InvsSimResellerRef").get("InvsSimResellerRef"));
    }
  }


/**
 *
 * Sets the InvsSimResellerRef
 * @param InvsSimResellerRefCreateInIn Value of the InvsSimResellerRefCreateIn
 *
 */

  public void setInvsSimResellerRef(InvsSimResellerRefObjectData InvsSimResellerRefCreateInIn) {
    InvsSimResellerRefCreateIn = InvsSimResellerRefCreateInIn;
  }

  public void translateFromMap() {
    InvsSimResellerRefCreateIn = InvsSimResellerRefObjectHelper.fromMap(inputMap, "InvsSimResellerRef");
  }

/**
 *
 * Gets the InvsSimResellerRef
 * @return Value of the InvsSimResellerRef
 *
 */

  public InvsSimResellerRefObjectData getInvsSimResellerRef( ) {
    return InvsSimResellerRefCreateIn;
  }

}
