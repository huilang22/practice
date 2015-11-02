/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SuspendedReasonFindBulkUdtTemplateItem.java
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
import com.csgsystems.ar.data.*;

/**
 *
 * Class used to create a SuspendedReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SuspendedReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SuspendedReasonObjectFilter SRFindIn;
/**
 *
 * Constructor to create a  SuspendedReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SuspendedReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SuspendedReasonObjectFilter SRFindInIn) {
    super(id, context, "SuspendedReasonFind");
    SRFindIn = SRFindInIn;
  }

  public void translateToMap() {
    if (SRFindIn != null) {
      Integer index =  SRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SuspendedReason", SuspendedReasonObjectHelper.toMap(SRFindIn, new HashMap(), "SuspendedReason").get("SuspendedReason"));
    }
  }


/**
 *
 * Sets the SuspendedReason
 * @param SRFindInIn Value of the SRFindIn
 *
 */

  public void setSuspendedReason(SuspendedReasonObjectFilter SRFindInIn) {
    SRFindIn = SRFindInIn;
  }

  public void translateFromMap() {
    SRFindIn = SuspendedReasonObjectHelper.fromMapFilter(inputMap, "SuspendedReason");
  }

/**
 *
 * Gets the SuspendedReason
 * @return Value of the SuspendedReason
 *
 */

  public SuspendedReasonObjectFilter getSuspendedReason( ) {
    return SRFindIn;
  }

}
