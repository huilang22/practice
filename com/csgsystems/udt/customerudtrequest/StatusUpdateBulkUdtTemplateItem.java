/*
 * Generated code DO NOT EDIT
 * Generated file: StatusUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a StatusUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusObjectData StatusUpdateIn;
/**
 *
 * Constructor to create a  StatusUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusObjectData StatusUpdateInIn) {
    super(id, context, "StatusUpdate");
    StatusUpdateIn = StatusUpdateInIn;
  }

  public void translateToMap() {
    if (StatusUpdateIn != null) {
      StatusUpdateIn.resetFlags(true, true);
      addInput("Status", StatusObjectHelper.toMap(StatusUpdateIn, new HashMap(), "Status").get("Status"));
    }
  }


/**
 *
 * Sets the Status
 * @param StatusUpdateInIn Value of the StatusUpdateIn
 *
 */

  public void setStatus(StatusObjectData StatusUpdateInIn) {
    StatusUpdateIn = StatusUpdateInIn;
  }

  public void translateFromMap() {
    StatusUpdateIn = StatusObjectHelper.fromMap(inputMap, "Status");
  }

/**
 *
 * Gets the Status
 * @return Value of the Status
 *
 */

  public StatusObjectData getStatus( ) {
    return StatusUpdateIn;
  }

}
