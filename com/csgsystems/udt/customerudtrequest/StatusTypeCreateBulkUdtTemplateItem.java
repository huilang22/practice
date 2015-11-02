/*
 * Generated code DO NOT EDIT
 * Generated file: StatusTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a StatusTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusTypeObjectData StatusTypeCreateIn;
/**
 *
 * Constructor to create a  StatusTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusTypeObjectData StatusTypeCreateInIn) {
    super(id, context, "StatusTypeCreate");
    StatusTypeCreateIn = StatusTypeCreateInIn;
  }

  public void translateToMap() {
    if (StatusTypeCreateIn != null) {
      StatusTypeCreateIn.resetFlags(true, true);
      addInput("StatusType", StatusTypeObjectHelper.toMap(StatusTypeCreateIn, new HashMap(), "StatusType").get("StatusType"));
    }
  }


/**
 *
 * Sets the StatusType
 * @param StatusTypeCreateInIn Value of the StatusTypeCreateIn
 *
 */

  public void setStatusType(StatusTypeObjectData StatusTypeCreateInIn) {
    StatusTypeCreateIn = StatusTypeCreateInIn;
  }

  public void translateFromMap() {
    StatusTypeCreateIn = StatusTypeObjectHelper.fromMap(inputMap, "StatusType");
  }

/**
 *
 * Gets the StatusType
 * @return Value of the StatusType
 *
 */

  public StatusTypeObjectData getStatusType( ) {
    return StatusTypeCreateIn;
  }

}
