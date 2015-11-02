/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ArmStatusGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ArmStatusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ArmStatusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ASObjectData noOpIn;

/**
 *
 * Constructor to create a   ArmStatusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ArmStatusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ASObjectData noOpInIn) {
    super(id, context, "ArmStatusGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ArmStatus", ASObjectHelper.toMap(noOpIn, new HashMap(), "ArmStatus").get("ArmStatus"));
    }
  }
/**
 *
 * Sets the  ArmStatus
 * @param noOpInIn ASObjectData to set
 *
 */
  public void setArmStatus(ASObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ArmStatus passed into the constructor
 * @return Simulated response
 *
 */
  public ASObjectData getArmStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ASObjectHelper.fromMap(inputMap, "ArmStatus");
  }
}
