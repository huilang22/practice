/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a StatusTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusTypeObjectData StatusTypeUpdateIn;
/**
 *
 * Constructor to create a  StatusTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusTypeObjectData StatusTypeUpdateInIn) {
    super(id, context, "StatusTypeUpdate");
    StatusTypeUpdateIn = StatusTypeUpdateInIn;
  }

  public void translateToMap() {
    if (StatusTypeUpdateIn != null) {
      StatusTypeUpdateIn.resetFlags(true, true);
      addInput("StatusType", StatusTypeObjectHelper.toMap(StatusTypeUpdateIn, new HashMap(), "StatusType").get("StatusType"));
    }
  }


/**
 *
 * Sets the StatusType
 * @param StatusTypeUpdateInIn Value of the StatusTypeUpdateIn
 *
 */

  public void setStatusType(StatusTypeObjectData StatusTypeUpdateInIn) {
    StatusTypeUpdateIn = StatusTypeUpdateInIn;
  }

  public void translateFromMap() {
    StatusTypeUpdateIn = StatusTypeObjectHelper.fromMap(inputMap, "StatusType");
  }

/**
 *
 * Gets the StatusType
 * @return Value of the StatusType
 *
 */

  public StatusTypeObjectData getStatusType( ) {
    return StatusTypeUpdateIn;
  }

}
