/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcItemUrlUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemUrlUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemUrlObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcItemUrlUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemUrlUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemUrlObjectData noOpInIn) {
    super(id, context, "CtcItemUrlUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcItemUrl", CtcItemUrlObjectHelper.toMap(noOpIn, new HashMap(), "CtcItemUrl").get("CtcItemUrl"));
    }
  }
/**
 *
 * Sets the  CtcItemUrl
 * @param noOpInIn CtcItemUrlObjectData to set
 *
 */
  public void setCtcItemUrl(CtcItemUrlObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItemUrl passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemUrlObjectData getCtcItemUrl() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemUrlObjectHelper.fromMap(inputMap, "CtcItemUrl");
  }
}
