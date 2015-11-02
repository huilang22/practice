/*
 * Generated code DO NOT EDIT
 * Generated file: StatusTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a StatusTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusTypeObjectKeyData StatusTypeGetIn;
/**
 *
 * Constructor to create a  StatusTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusTypeObjectKeyData StatusTypeGetInIn) {
    super(id, context, "StatusTypeGet");
    StatusTypeGetIn = StatusTypeGetInIn;
  }

  public void translateToMap() {
    if (StatusTypeGetIn != null) {
      StatusTypeGetIn.resetFlags(true, true);
      addInput("StatusType", StatusTypeObjectKeyHelper.toMap(StatusTypeGetIn, new HashMap(), "StatusTypeObjectKeyData").get("StatusTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the StatusType
 * @param StatusTypeGetInIn Value of the StatusTypeGetIn
 *
 */

  public void setStatusType(StatusTypeObjectKeyData StatusTypeGetInIn) {
    StatusTypeGetIn = StatusTypeGetInIn;
  }

  public void translateFromMap() {
    StatusTypeGetIn = StatusTypeObjectKeyHelper.fromMap(inputMap, "StatusType");
  }

/**
 *
 * Gets the StatusType
 * @return Value of the StatusType
 *
 */

  public StatusTypeObjectKeyData getStatusType( ) {
    return StatusTypeGetIn;
  }

}
