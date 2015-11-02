/*
 * Generated code DO NOT EDIT
 * Generated file: JeopardyStatusFindBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * Class used to create a JeopardyStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class JeopardyStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected JeopardyStatusObjectFilter JeopardyStatusFindIn;
/**
 *
 * Constructor to create a  JeopardyStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public JeopardyStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, JeopardyStatusObjectFilter JeopardyStatusFindInIn) {
    super(id, context, "JeopardyStatusFind");
    JeopardyStatusFindIn = JeopardyStatusFindInIn;
  }

  public void translateToMap() {
    if (JeopardyStatusFindIn != null) {
      Integer index =  JeopardyStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("JeopardyStatus", JeopardyStatusObjectHelper.toMap(JeopardyStatusFindIn, new HashMap(), "JeopardyStatus").get("JeopardyStatus"));
    }
  }


/**
 *
 * Sets the JeopardyStatus
 * @param JeopardyStatusFindInIn Value of the JeopardyStatusFindIn
 *
 */

  public void setJeopardyStatus(JeopardyStatusObjectFilter JeopardyStatusFindInIn) {
    JeopardyStatusFindIn = JeopardyStatusFindInIn;
  }

  public void translateFromMap() {
    JeopardyStatusFindIn = JeopardyStatusObjectHelper.fromMapFilter(inputMap, "JeopardyStatus");
  }

/**
 *
 * Gets the JeopardyStatus
 * @return Value of the JeopardyStatus
 *
 */

  public JeopardyStatusObjectFilter getJeopardyStatus( ) {
    return JeopardyStatusFindIn;
  }

}
