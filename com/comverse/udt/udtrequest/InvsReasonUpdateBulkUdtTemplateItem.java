/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsReasonUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsReasonUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsReasonUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsReasonObjectData InvsReasonUpdateIn;
/**
 *
 * Constructor to create a  InvsReasonUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsReasonUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsReasonObjectData InvsReasonUpdateInIn) {
    super(id, context, "InvsReasonUpdate");
    InvsReasonUpdateIn = InvsReasonUpdateInIn;
  }

  public void translateToMap() {
    if (InvsReasonUpdateIn != null) {
      InvsReasonUpdateIn.resetFlags(true, true);
      addInput("InvsReason", InvsReasonObjectHelper.toMap(InvsReasonUpdateIn, new HashMap(), "InvsReason").get("InvsReason"));
    }
  }


/**
 *
 * Sets the InvsReason
 * @param InvsReasonUpdateInIn Value of the InvsReasonUpdateIn
 *
 */

  public void setInvsReason(InvsReasonObjectData InvsReasonUpdateInIn) {
    InvsReasonUpdateIn = InvsReasonUpdateInIn;
  }

  public void translateFromMap() {
    InvsReasonUpdateIn = InvsReasonObjectHelper.fromMap(inputMap, "InvsReason");
  }

/**
 *
 * Gets the InvsReason
 * @return Value of the InvsReason
 *
 */

  public InvsReasonObjectData getInvsReason( ) {
    return InvsReasonUpdateIn;
  }

}
