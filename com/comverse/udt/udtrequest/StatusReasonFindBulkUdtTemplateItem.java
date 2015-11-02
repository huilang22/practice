/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a StatusReasonFindBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusReasonFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusReasonObjectFilter StatusReasonFindIn;
/**
 *
 * Constructor to create a  StatusReasonFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusReasonFindBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusReasonObjectFilter StatusReasonFindInIn) {
    super(id, context, "StatusReasonFind");
    StatusReasonFindIn = StatusReasonFindInIn;
  }

  public void translateToMap() {
    if (StatusReasonFindIn != null) {
      Integer index =  StatusReasonFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("StatusReason", StatusReasonObjectHelper.toMap(StatusReasonFindIn, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }


/**
 *
 * Sets the StatusReason
 * @param StatusReasonFindInIn Value of the StatusReasonFindIn
 *
 */

  public void setStatusReason(StatusReasonObjectFilter StatusReasonFindInIn) {
    StatusReasonFindIn = StatusReasonFindInIn;
  }

  public void translateFromMap() {
    StatusReasonFindIn = StatusReasonObjectHelper.fromMapFilter(inputMap, "StatusReason");
  }

/**
 *
 * Gets the StatusReason
 * @return Value of the StatusReason
 *
 */

  public StatusReasonObjectFilter getStatusReason( ) {
    return StatusReasonFindIn;
  }

}
