/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a StatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatusObjectKeyData StatusGetIn;
/**
 *
 * Constructor to create a  StatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusObjectKeyData StatusGetInIn) {
    super(id, context, "StatusGet");
    StatusGetIn = StatusGetInIn;
  }

  public void translateToMap() {
    if (StatusGetIn != null) {
      StatusGetIn.resetFlags(true, true);
      addInput("Status", StatusObjectKeyHelper.toMap(StatusGetIn, new HashMap(), "StatusObjectKeyData").get("StatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the Status
 * @param StatusGetInIn Value of the StatusGetIn
 *
 */

  public void setStatus(StatusObjectKeyData StatusGetInIn) {
    StatusGetIn = StatusGetInIn;
  }

  public void translateFromMap() {
    StatusGetIn = StatusObjectKeyHelper.fromMap(inputMap, "Status");
  }

/**
 *
 * Gets the Status
 * @return Value of the Status
 *
 */

  public StatusObjectKeyData getStatus( ) {
    return StatusGetIn;
  }

}
