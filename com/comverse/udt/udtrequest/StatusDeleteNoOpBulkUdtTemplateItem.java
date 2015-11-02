/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatusDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatusDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatusObjectData noOpIn;

/**
 *
 * Constructor to create a   StatusDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatusDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusObjectData noOpInIn) {
    super(id, context, "StatusDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Status", StatusObjectHelper.toMap(noOpIn, new HashMap(), "Status").get("Status"));
    }
  }
/**
 *
 * Sets the  Status
 * @param noOpInIn StatusObjectData to set
 *
 */
  public void setStatus(StatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Status passed into the constructor
 * @return Simulated response
 *
 */
  public StatusObjectData getStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StatusObjectHelper.fromMap(inputMap, "Status");
  }
}
