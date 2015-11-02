/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JeopardyStatusGetBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * Class used to create a JeopardyStatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class JeopardyStatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected JeopardyStatusObjectKeyData JeopardyStatusGetIn;
/**
 *
 * Constructor to create a  JeopardyStatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public JeopardyStatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, JeopardyStatusObjectKeyData JeopardyStatusGetInIn) {
    super(id, context, "JeopardyStatusGet");
    JeopardyStatusGetIn = JeopardyStatusGetInIn;
  }

  public void translateToMap() {
    if (JeopardyStatusGetIn != null) {
      JeopardyStatusGetIn.resetFlags(true, true);
      addInput("JeopardyStatus", JeopardyStatusObjectKeyHelper.toMap(JeopardyStatusGetIn, new HashMap(), "JeopardyStatusObjectKeyData").get("JeopardyStatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the JeopardyStatus
 * @param JeopardyStatusGetInIn Value of the JeopardyStatusGetIn
 *
 */

  public void setJeopardyStatus(JeopardyStatusObjectKeyData JeopardyStatusGetInIn) {
    JeopardyStatusGetIn = JeopardyStatusGetInIn;
  }

  public void translateFromMap() {
    JeopardyStatusGetIn = JeopardyStatusObjectKeyHelper.fromMap(inputMap, "JeopardyStatus");
  }

/**
 *
 * Gets the JeopardyStatus
 * @return Value of the JeopardyStatus
 *
 */

  public JeopardyStatusObjectKeyData getJeopardyStatus( ) {
    return JeopardyStatusGetIn;
  }

}
