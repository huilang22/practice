/*
 * Generated code DO NOT EDIT
 * Generated file: StatusCreateBulkUdtTemplateItem.java
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
 * Class used to create a StatusCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusObjectData StatusCreateIn;
/**
 *
 * Constructor to create a  StatusCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusObjectData StatusCreateInIn) {
    super(id, context, "StatusCreate");
    StatusCreateIn = StatusCreateInIn;
  }

  public void translateToMap() {
    if (StatusCreateIn != null) {
      StatusCreateIn.resetFlags(true, true);
      addInput("Status", StatusObjectHelper.toMap(StatusCreateIn, new HashMap(), "Status").get("Status"));
    }
  }


/**
 *
 * Sets the Status
 * @param StatusCreateInIn Value of the StatusCreateIn
 *
 */

  public void setStatus(StatusObjectData StatusCreateInIn) {
    StatusCreateIn = StatusCreateInIn;
  }

  public void translateFromMap() {
    StatusCreateIn = StatusObjectHelper.fromMap(inputMap, "Status");
  }

/**
 *
 * Gets the Status
 * @return Value of the Status
 *
 */

  public StatusObjectData getStatus( ) {
    return StatusCreateIn;
  }

}
