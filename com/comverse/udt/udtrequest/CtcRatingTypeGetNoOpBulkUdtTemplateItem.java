/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingTypeGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcRatingTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcRatingTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcRatingTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcRatingTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcRatingTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingTypeObjectData noOpInIn) {
    super(id, context, "CtcRatingTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(noOpIn, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }
/**
 *
 * Sets the  CtcRatingType
 * @param noOpInIn CtcRatingTypeObjectData to set
 *
 */
  public void setCtcRatingType(CtcRatingTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcRatingType passed into the constructor
 * @return Simulated response
 *
 */
  public CtcRatingTypeObjectData getCtcRatingType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcRatingTypeObjectHelper.fromMap(inputMap, "CtcRatingType");
  }
}
