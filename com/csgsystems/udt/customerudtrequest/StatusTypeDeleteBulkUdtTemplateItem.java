/*
 * Generated code DO NOT EDIT
 * Generated file: StatusTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a StatusTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusTypeObjectKeyData StatusTypeDeleteIn;
/**
 *
 * Constructor to create a  StatusTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusTypeObjectKeyData StatusTypeDeleteInIn) {
    super(id, context, "StatusTypeDelete");
    StatusTypeDeleteIn = StatusTypeDeleteInIn;
  }

  public void translateToMap() {
    if (StatusTypeDeleteIn != null) {
      StatusTypeDeleteIn.resetFlags(true, true);
      addInput("StatusType", StatusTypeObjectKeyHelper.toMap(StatusTypeDeleteIn, new HashMap(), "StatusTypeObjectKeyData").get("StatusTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the StatusType
 * @param StatusTypeDeleteInIn Value of the StatusTypeDeleteIn
 *
 */

  public void setStatusType(StatusTypeObjectKeyData StatusTypeDeleteInIn) {
    StatusTypeDeleteIn = StatusTypeDeleteInIn;
  }

  public void translateFromMap() {
    StatusTypeDeleteIn = StatusTypeObjectKeyHelper.fromMap(inputMap, "StatusType");
  }

/**
 *
 * Gets the StatusType
 * @return Value of the StatusType
 *
 */

  public StatusTypeObjectKeyData getStatusType( ) {
    return StatusTypeDeleteIn;
  }

}
