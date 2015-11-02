/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimResellerUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimResellerUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimResellerObjectData InvsSimResellerUpdateIn;
/**
 *
 * Constructor to create a  InvsSimResellerUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimResellerUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimResellerObjectData InvsSimResellerUpdateInIn) {
    super(id, context, "InvsSimResellerUpdate");
    InvsSimResellerUpdateIn = InvsSimResellerUpdateInIn;
  }

  public void translateToMap() {
    if (InvsSimResellerUpdateIn != null) {
      InvsSimResellerUpdateIn.resetFlags(true, true);
      addInput("InvsSimReseller", InvsSimResellerObjectHelper.toMap(InvsSimResellerUpdateIn, new HashMap(), "InvsSimReseller").get("InvsSimReseller"));
    }
  }


/**
 *
 * Sets the InvsSimReseller
 * @param InvsSimResellerUpdateInIn Value of the InvsSimResellerUpdateIn
 *
 */

  public void setInvsSimReseller(InvsSimResellerObjectData InvsSimResellerUpdateInIn) {
    InvsSimResellerUpdateIn = InvsSimResellerUpdateInIn;
  }

  public void translateFromMap() {
    InvsSimResellerUpdateIn = InvsSimResellerObjectHelper.fromMap(inputMap, "InvsSimReseller");
  }

/**
 *
 * Gets the InvsSimReseller
 * @return Value of the InvsSimReseller
 *
 */

  public InvsSimResellerObjectData getInvsSimReseller( ) {
    return InvsSimResellerUpdateIn;
  }

}
