/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsReasonFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsReasonObjectFilter InvsReasonFindIn;
/**
 *
 * Constructor to create a  InvsReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsReasonObjectFilter InvsReasonFindInIn) {
    super(id, context, "InvsReasonFind");
    InvsReasonFindIn = InvsReasonFindInIn;
  }

  public void translateToMap() {
    if (InvsReasonFindIn != null) {
      Integer index =  InvsReasonFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsReason", InvsReasonObjectHelper.toMap(InvsReasonFindIn, new HashMap(), "InvsReason").get("InvsReason"));
    }
  }


/**
 *
 * Sets the InvsReason
 * @param InvsReasonFindInIn Value of the InvsReasonFindIn
 *
 */

  public void setInvsReason(InvsReasonObjectFilter InvsReasonFindInIn) {
    InvsReasonFindIn = InvsReasonFindInIn;
  }

  public void translateFromMap() {
    InvsReasonFindIn = InvsReasonObjectHelper.fromMapFilter(inputMap, "InvsReason");
  }

/**
 *
 * Gets the InvsReason
 * @return Value of the InvsReason
 *
 */

  public InvsReasonObjectFilter getInvsReason( ) {
    return InvsReasonFindIn;
  }

}
