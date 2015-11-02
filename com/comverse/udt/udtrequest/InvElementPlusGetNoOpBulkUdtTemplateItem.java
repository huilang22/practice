/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementPlusGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvElementPlusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvElementPlusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvElementPlusObjData noOpIn;

/**
 *
 * Constructor to create a   InvElementPlusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvElementPlusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementPlusObjData noOpInIn) {
    super(id, context, "InvElementPlusGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvElementPlus", InvElementPlusObjHelper.toMap(noOpIn, new HashMap(), "InvElementPlus").get("InvElementPlus"));
    }
  }
/**
 *
 * Sets the  InvElementPlus
 * @param noOpInIn InvElementPlusObjData to set
 *
 */
  public void setInvElementPlus(InvElementPlusObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvElementPlus passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementPlusObjData getInvElementPlus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvElementPlusObjHelper.fromMap(inputMap, "InvElementPlus");
  }
}
