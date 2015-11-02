/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvElementGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvElementGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvElementObjData noOpIn;

/**
 *
 * Constructor to create a   InvElementGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvElementGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData noOpInIn) {
    super(id, context, "InvElementGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(noOpIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }
/**
 *
 * Sets the  InvElement
 * @param noOpInIn InvElementObjData to set
 *
 */
  public void setInvElement(InvElementObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvElement passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementObjData getInvElement() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
  }
}
