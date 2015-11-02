/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmTableUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtmTableUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmTableUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmTableObjectData noOpIn;

/**
 *
 * Constructor to create a   CtmTableUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmTableUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmTableObjectData noOpInIn) {
    super(id, context, "CtmTableUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtmTable", CtmTableObjectHelper.toMap(noOpIn, new HashMap(), "CtmTable").get("CtmTable"));
    }
  }
/**
 *
 * Sets the  CtmTable
 * @param noOpInIn CtmTableObjectData to set
 *
 */
  public void setCtmTable(CtmTableObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmTable passed into the constructor
 * @return Simulated response
 *
 */
  public CtmTableObjectData getCtmTable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmTableObjectHelper.fromMap(inputMap, "CtmTable");
  }
}
