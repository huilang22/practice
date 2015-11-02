/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimVectorDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvSimVectorDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvSimVectorDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvSimVectorDeleteObjData noOpIn;

/**
 *
 * Constructor to create a   InvSimVectorDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvSimVectorDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimVectorDeleteObjData noOpInIn) {
    super(id, context, "InvSimVectorDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvSimVector", InvSimVectorDeleteObjHelper.toMap(noOpIn, new HashMap(), "InvSimVector").get("InvSimVector"));
    }
  }
/**
 *
 * Sets the  InvSimVector
 * @param noOpInIn InvSimVectorDeleteObjData to set
 *
 */
  public void setInvSimVector(InvSimVectorDeleteObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvSimVector passed into the constructor
 * @return Simulated response
 *
 */
  public InvSimVectorDeleteObjData getInvSimVector() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvSimVectorDeleteObjHelper.fromMap(inputMap, "InvSimVector");
  }
}
