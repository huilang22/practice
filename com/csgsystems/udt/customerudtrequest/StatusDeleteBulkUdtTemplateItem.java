/*
 * Generated code DO NOT EDIT
 * Generated file: StatusDeleteBulkUdtTemplateItem.java
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
 * Class used to create a StatusDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusObjectKeyData StatusDeleteIn;
/**
 *
 * Constructor to create a  StatusDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusObjectKeyData StatusDeleteInIn) {
    super(id, context, "StatusDelete");
    StatusDeleteIn = StatusDeleteInIn;
  }

  public void translateToMap() {
    if (StatusDeleteIn != null) {
      StatusDeleteIn.resetFlags(true, true);
      addInput("Status", StatusObjectKeyHelper.toMap(StatusDeleteIn, new HashMap(), "StatusObjectKeyData").get("StatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the Status
 * @param StatusDeleteInIn Value of the StatusDeleteIn
 *
 */

  public void setStatus(StatusObjectKeyData StatusDeleteInIn) {
    StatusDeleteIn = StatusDeleteInIn;
  }

  public void translateFromMap() {
    StatusDeleteIn = StatusObjectKeyHelper.fromMap(inputMap, "Status");
  }

/**
 *
 * Gets the Status
 * @return Value of the Status
 *
 */

  public StatusObjectKeyData getStatus( ) {
    return StatusDeleteIn;
  }

}
