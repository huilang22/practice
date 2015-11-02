/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateClassDescrCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateClassDescrCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateClassDescrCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateClassDescrObjectData noOpIn;

/**
 *
 * Constructor to create a   RateClassDescrCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateClassDescrCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateClassDescrObjectData noOpInIn) {
    super(id, context, "RateClassDescrCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(noOpIn, new HashMap(), "RateClassDescr").get("RateClassDescr"));
    }
  }
/**
 *
 * Sets the  RateClassDescr
 * @param noOpInIn RateClassDescrObjectData to set
 *
 */
  public void setRateClassDescr(RateClassDescrObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateClassDescr passed into the constructor
 * @return Simulated response
 *
 */
  public RateClassDescrObjectData getRateClassDescr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateClassDescrObjectHelper.fromMap(inputMap, "RateClassDescr");
  }
}
