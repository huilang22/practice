/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExclusionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExclusionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExclusionObjectData noOpIn;

/**
 *
 * Constructor to create a   ExclusionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExclusionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExclusionObjectData noOpInIn) {
    super(id, context, "ExclusionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Exclusion", ExclusionObjectHelper.toMap(noOpIn, new HashMap(), "Exclusion").get("Exclusion"));
    }
  }
/**
 *
 * Sets the  Exclusion
 * @param noOpInIn ExclusionObjectData to set
 *
 */
  public void setExclusion(ExclusionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Exclusion passed into the constructor
 * @return Simulated response
 *
 */
  public ExclusionObjectData getExclusion() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExclusionObjectHelper.fromMap(inputMap, "Exclusion");
  }
}
