/*
 * Generated code DO NOT EDIT
 * Generated file: StatusFindBulkUdtTemplateItem.java
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
 * Class used to create a StatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusObjectFilter StatusFindIn;
/**
 *
 * Constructor to create a  StatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusObjectFilter StatusFindInIn) {
    super(id, context, "StatusFind");
    StatusFindIn = StatusFindInIn;
  }

  public void translateToMap() {
    if (StatusFindIn != null) {
      Integer index =  StatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Status", StatusObjectHelper.toMap(StatusFindIn, new HashMap(), "Status").get("Status"));
    }
  }


/**
 *
 * Sets the Status
 * @param StatusFindInIn Value of the StatusFindIn
 *
 */

  public void setStatus(StatusObjectFilter StatusFindInIn) {
    StatusFindIn = StatusFindInIn;
  }

  public void translateFromMap() {
    StatusFindIn = StatusObjectHelper.fromMapFilter(inputMap, "Status");
  }

/**
 *
 * Gets the Status
 * @return Value of the Status
 *
 */

  public StatusObjectFilter getStatus( ) {
    return StatusFindIn;
  }

}
