/*
 * Generated code DO NOT EDIT
 * Generated file: StatusTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a StatusTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusTypeObjectFilter StatusTypeFindIn;
/**
 *
 * Constructor to create a  StatusTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusTypeObjectFilter StatusTypeFindInIn) {
    super(id, context, "StatusTypeFind");
    StatusTypeFindIn = StatusTypeFindInIn;
  }

  public void translateToMap() {
    if (StatusTypeFindIn != null) {
      Integer index =  StatusTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("StatusType", StatusTypeObjectHelper.toMap(StatusTypeFindIn, new HashMap(), "StatusType").get("StatusType"));
    }
  }


/**
 *
 * Sets the StatusType
 * @param StatusTypeFindInIn Value of the StatusTypeFindIn
 *
 */

  public void setStatusType(StatusTypeObjectFilter StatusTypeFindInIn) {
    StatusTypeFindIn = StatusTypeFindInIn;
  }

  public void translateFromMap() {
    StatusTypeFindIn = StatusTypeObjectHelper.fromMapFilter(inputMap, "StatusType");
  }

/**
 *
 * Gets the StatusType
 * @return Value of the StatusType
 *
 */

  public StatusTypeObjectFilter getStatusType( ) {
    return StatusTypeFindIn;
  }

}
